package com.example.providerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class ProviderapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderapiApplication.class, args);
    }

}
