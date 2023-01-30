package com.example.university.repository;

import com.example.university.pojo.Teacher;

import java.util.List;

public interface TeacherRepository {

    List<Teacher> getAll();

    Teacher getById(int id);

    void save(Teacher teacher);

    void delete(int id);

}
