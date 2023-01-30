package com.example.providerapi.service;

import com.example.providerapi.pojo.Provider;
import java.util.*;

public interface ProviderService {
    List<Provider> getAll();
    Provider insert(Provider provider);
}
