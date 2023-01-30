package com.example.university.service;

import com.example.university.pojo.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAll();

    Teacher getById(int id);

    void save(Teacher teacher);

    void delete(int id);

}
