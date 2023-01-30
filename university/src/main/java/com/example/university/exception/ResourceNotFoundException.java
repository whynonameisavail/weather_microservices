package com.example.university.exception;

/*
Customize Exception for no resource
 */
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
