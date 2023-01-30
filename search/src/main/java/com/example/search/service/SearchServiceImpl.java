package com.example.search.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class SearchServiceImpl implements SearchService{

    @Value("${university.url}")
    private String universityURL;

    @Value("${provider.url}")
    private String providerURL;

    private final RestTemplate template;

    @Autowired
    public SearchServiceImpl(RestTemplate template) {
        this.template = template;
    }

    @Async
    public CompletableFuture<?> getAllStudents() {
        return CompletableFuture.completedFuture(template.getForObject(universityURL + "/student/all", List.class));
    }

    @Async
    public CompletableFuture<?> getAllTeachers() {

        return CompletableFuture.completedFuture(template.getForObject(universityURL + "/teacher/all", List.class));
    }

    @Async
    public CompletableFuture<?> getAllProviders() {

        return CompletableFuture.completedFuture(template.getForObject(providerURL + "/provider", List.class));
    }

    @Async
    public CompletableFuture<?> getStudentByID(String ID) {

        return CompletableFuture.completedFuture(template.getForObject(universityURL + "/student/get/" + ID, List.class));
    }


    @Async
    public CompletableFuture<?> getTeacherByID(String ID) {

        return CompletableFuture.completedFuture(template.getForObject(universityURL + "/teacher/get/" + ID, List.class));
    }
}
