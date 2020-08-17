package com.gpacalc.GpaCalculator.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gpacalc.GpaCalculator.entity.Course;
import com.gpacalc.GpaCalculator.entity.GpaInputEntity;
import com.gpacalc.GpaCalculator.entity.Marks;
import com.gpacalc.GpaCalculator.entity.Student;
import com.gpacalc.GpaCalculator.entity.StudentRank;
import com.gpacalc.GpaCalculator.service.StudentService;
import com.gpacalc.GpaCalculator.service.CourseService;
import com.gpacalc.GpaCalculator.service.MarksService;

@RestController
@CrossOrigin("*")
public class GpaCalcController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private MarksService marksService;
	
	@GetMapping("/gpa/hello")
	public String sayHello() {
		String response = "Hey...you are going to use my GPA calculator";
		return response;
	}
	
	@PostMapping("/gpa/student/add")
	public Student addNewStudent(@RequestBody Student student) {
		return studentService.addNewStudent(student);
	}
	
	@PostMapping("/gpa/course/add")
	public Course addNewCourse(@RequestBody Course course) {
		return courseService.addNewCourse(course);
	}
	
	@PostMapping("/gpa/marks/add")
	public Marks addNewMarks(@RequestBody Marks marks) {
		return marksService.addNewMarks(marks);
	}
	
	@PostMapping("/gpa/student/delete")
	public void deleteStudent(@RequestBody GpaInputEntity inputEntity) {
		studentService.deleteStudent(inputEntity.getStudentId());
	}
	@PostMapping("/gpa/course/delete")
	public void deleteCourse(@RequestBody GpaInputEntity inputEntity) {
		courseService.deleteCourse(inputEntity.getCourseID());
	}
	@PostMapping("/gpa/marks/delete")
	public void deleteMarks(@RequestBody GpaInputEntity inputEntity) {
		System.out.println("inputEntity :" + inputEntity);
		marksService.deleteMarks(inputEntity.getRecordID());
	}
	
	@PostMapping("/gpa/saveGpa")
	public Student saveGpa(@RequestBody GpaInputEntity inputEntity) {
		double gpa = studentService.calculateGPA(inputEntity.getStudentId());
		Student student = studentService.getStudentDetails(inputEntity.getStudentId()).orElse(new Student());
		student.setGpa(gpa);
		return studentService.addNewStudent(student);
		
		
	}
	@PostMapping("/gpa/showGpa")
	public Student getGpa(@RequestBody GpaInputEntity inputEntity) {
		return studentService.getStudentDetails(inputEntity.getStudentId()).orElse(new Student());
	}
	
	@PostMapping("/gpa/calculateRank")
	public List<StudentRank> showRank(@RequestBody GpaInputEntity inputEntity) {
		return studentService.calcRank(inputEntity.getNumRank());
	}
	
	

}
