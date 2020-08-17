package com.gpacalc.GpaCalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpacalc.GpaCalculator.entity.Student;
import com.gpacalc.GpaCalculator.entity.Course;
import com.gpacalc.GpaCalculator.repository.CourseRepository;
import com.gpacalc.GpaCalculator.repository.StudentRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	public Course addNewCourse(Course course) {
		return repository.save(course);
	}
	public void deleteCourse(long id) {
		repository.deleteById(id);
	}
}
