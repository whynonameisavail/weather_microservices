package com.example.search.controller;

import com.example.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/search")
public class SearchController {

    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }


    @GetMapping("/student/all")
    public CompletableFuture<?> getAllStudents() {
        return searchService.getAllStudents().thenApply(ResponseEntity::ok);
    }


    @GetMapping("/teacher/all")
    public CompletableFuture<?> getAllTeachers() {
        return searchService.getAllTeachers().thenApply(ResponseEntity::ok);
    }

    @GetMapping("/provider/all")
    public CompletableFuture<?> getAllProviders() {
        return searchService.getAllProviders().thenApply(ResponseEntity::ok);
    }

    @GetMapping("/student/get/{id}")
    public CompletableFuture<?> getStudentByID(@PathVariable String ID) {
        return searchService.getStudentByID(ID).thenApply(ResponseEntity::ok);

    }

    @GetMapping("/teacher/get/{id}")
    public CompletableFuture<?> getTeacherByID(@PathVariable String ID) {
        return searchService.getTeacherByID(ID).thenApply(ResponseEntity::ok);

    }

}
