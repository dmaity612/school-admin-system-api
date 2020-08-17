package com.gpacalc.GpaCalculator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpacalc.GpaCalculator.entity.Course;
import com.gpacalc.GpaCalculator.entity.Student;



@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}

