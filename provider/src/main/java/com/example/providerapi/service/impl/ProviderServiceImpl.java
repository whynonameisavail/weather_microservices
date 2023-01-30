package com.example.providerapi.service.impl;

import com.example.providerapi.pojo.Provider;
import com.example.providerapi.repository.ProviderRepository;
import com.example.providerapi.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProviderServiceImpl implements ProviderService {
    private ProviderRepository providerRepository;

    @Autowired
    public ProviderServiceImpl(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Override
    public List<Provider> getAll() {
        return providerRepository.findAll();
    }

    @Override
    public Provider insert(Provider provider) {
        Provider newProvider = providerRepository.save(provider);
        return newProvider;
    }
}
