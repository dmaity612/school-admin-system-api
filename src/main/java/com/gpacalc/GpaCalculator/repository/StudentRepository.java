package com.gpacalc.GpaCalculator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpacalc.GpaCalculator.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
