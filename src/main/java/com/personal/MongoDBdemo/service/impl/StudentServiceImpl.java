package com.personal.MongoDBdemo.service.impl;

import com.personal.MongoDBdemo.domain.Student;
import com.personal.MongoDBdemo.repository.StudentRepository;
import com.personal.MongoDBdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Mono<Student> save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Mono<Student> findOneById(String id) {
        return studentRepository.findOneById(id);
    }

    @Override
    public Flux<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Mono<Student> deleteOneById(String id) {
         return studentRepository.deleteOneById(id);
    }
}
