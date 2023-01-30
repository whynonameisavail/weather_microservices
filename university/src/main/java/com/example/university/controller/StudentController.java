package com.example.university.controller;


import com.example.university.pojo.Student;
import com.example.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping ("/all")
    public List<Student> getAll(){
        return studentService.get();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable int id){
        Student student = studentService.get(id);
        if(student == null){
            throw new RuntimeException("There is no student with "+ id);
        }
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        studentService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.save(student);
    }

}
