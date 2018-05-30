package com.personal.MongoDBdemo.repository;

import com.personal.MongoDBdemo.domain.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface StudentRepository extends ReactiveMongoRepository<Student,Student> {
    Mono<Student> findOneById(String id);
    Mono<Student> deleteOneById(String id);
}
