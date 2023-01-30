package com.example.providerapi.controller;

import com.example.providerapi.pojo.Provider;
import com.example.providerapi.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProviderController {
    private ProviderService providerService;

    @Autowired
    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping("/provider")
    public ResponseEntity<List<Provider>> getAll(){
        return new ResponseEntity<>(providerService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/provider")
    public ResponseEntity<Provider> insert(@RequestBody Provider provider){
        Provider newProvider = providerService.insert(provider);
        return new ResponseEntity<>(newProvider, HttpStatus.CREATED);
    }
}
