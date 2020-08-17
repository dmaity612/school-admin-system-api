package com.gpacalc.GpaCalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpacalc.GpaCalculator.entity.Course;
import com.gpacalc.GpaCalculator.entity.Marks;
import com.gpacalc.GpaCalculator.repository.CourseRepository;
import com.gpacalc.GpaCalculator.repository.MarksRepository;

@Service
public class MarksService {
	@Autowired
	private MarksRepository repository;
	
	public Marks addNewMarks(Marks marks) {
		return repository.save(marks);
	}
	public void deleteMarks (long id) {
		repository.deleteById(id);
	}
}
