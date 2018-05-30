package com.personal.MongoDBdemo.repository;

import com.personal.MongoDBdemo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Student> {
    Student findOneById(String id);

    void deleteOneById(String id);
}
