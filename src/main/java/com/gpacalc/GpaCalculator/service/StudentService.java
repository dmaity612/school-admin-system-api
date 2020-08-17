package com.gpacalc.GpaCalculator.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpacalc.GpaCalculator.entity.CalcInfo;
import com.gpacalc.GpaCalculator.entity.Student;
import com.gpacalc.GpaCalculator.entity.StudentRank;
import com.gpacalc.GpaCalculator.repository.GpaRepository;
import com.gpacalc.GpaCalculator.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	@Autowired
	private GpaRepository methodRepository;
	
	public Student addNewStudent(Student student) {
		return repository.save(student);
	}
	
	public void deleteStudent(long id) {
		repository.deleteById(id);
	}
	
	public Optional<Student> getStudentDetails(long id) {
		return repository.findById(id);
	}

	public double calculateGPA(long studentId) {
		List<CalcInfo> info;
		info = methodRepository.getGpaDetails(studentId);
		double gpa = 0.0;
		int score = 0;
		double level = 0.0;
		double points = 0.0;
		double gpaLost = 0.0;
		for (int i = 0; i < info.size(); i++) {
			score = info.get(i).getScore();
			level = info.get(i).getLevel();
			gpaLost = 0.2 * ((int) ((1/3.0) * (102- score) - 1));
			if (score%10 == 0 && score!=100) {
				gpaLost -= 0.2;
			}
			if (score < 70) {
				gpaLost = level;
			}
			points += (level - gpaLost);
		}
		gpa = points/info.size();
		DecimalFormat df = new DecimalFormat("#.####");
		return Double.valueOf(df.format(gpa));
	}
	
	public List<StudentRank> calcRank(long id) {
		return methodRepository.getRank(id);
	}
	

}
