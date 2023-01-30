package com.example.university.service;

import com.example.university.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> get();

    Student get(int id);

    void save(Student student);

    void delete(int id);
}
