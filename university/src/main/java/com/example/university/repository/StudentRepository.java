package com.example.university.repository;

import com.example.university.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository {

    List<Student> getAll();

    Student get(int id);

    void save(Student student);

    void delete(int id);
}
