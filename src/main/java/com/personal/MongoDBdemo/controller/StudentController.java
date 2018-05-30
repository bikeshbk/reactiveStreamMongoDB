package com.personal.MongoDBdemo.controller;

import com.personal.MongoDBdemo.domain.Student;
import com.personal.MongoDBdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Mono<Student>> createStudent(@RequestBody Student student) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/student")).body(studentService.save(student));
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Mono<Student>> getStudent(@PathVariable String id) {
        return ResponseEntity.ok().body(studentService.findOneById(id));
    }

    @GetMapping("/students")
    public ResponseEntity<Flux<Student>> getStudents() {
        return ResponseEntity.ok().body(studentService.findAll());
    }

    @PutMapping("/student")
    public ResponseEntity<Mono<Student>> updateStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.save(student));
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Mono<Student>> deleteStudent(@PathVariable String id) {
        return ResponseEntity.ok().body(studentService.deleteOneById(id));
    }
}
