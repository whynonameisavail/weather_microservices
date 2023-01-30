package com.example.search.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public interface SearchService {

     CompletableFuture<?> getAllStudents();

     CompletableFuture<?> getAllTeachers();

    CompletableFuture<?> getAllProviders();

    CompletableFuture<?> getStudentByID(String ID);


    CompletableFuture<?> getTeacherByID(String ID);
}
