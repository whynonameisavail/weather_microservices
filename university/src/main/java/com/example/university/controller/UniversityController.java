package com.example.university.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    @GetMapping("/weather/University")
    public ResponseEntity<?> getDetails() {
        //TODO
        return new ResponseEntity<>("this is University service", HttpStatus.OK);
    }
}
