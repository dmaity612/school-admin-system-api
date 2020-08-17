package com.gpacalc.GpaCalculator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpacalc.GpaCalculator.entity.Course;
import com.gpacalc.GpaCalculator.entity.Marks;

@Repository
public interface MarksRepository extends CrudRepository<Marks, Long> {

}
