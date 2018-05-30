package com.personal.MongoDBdemo.service;

import com.personal.MongoDBdemo.domain.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

    Mono<Student> save(Student student);

    Mono<Student> findOneById(String id);

    Flux<Student> findAll();

    Mono<Student> deleteOneById(String id);
}
