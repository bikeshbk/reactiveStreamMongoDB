package com.personal.MongoDBdemo.controller;

import com.personal.MongoDBdemo.domain.Student;
import com.personal.MongoDBdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentRepository.findOneById(id);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.deleteOneById(id);
    }
}
