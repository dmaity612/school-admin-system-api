package com.gpacalc.GpaCalculator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "student")
public class Student {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column ( name = "STUDENT_ID")
	private long studentId;
	
	@Column ( name = "STUDENT_NAME")
	private String studentName;
	
	@Column ( name = "ADDRESS")
	private String address;
	
	@Column ( name = "GRADE")
	private int grade;
	
	@Column ( name = "GPA")
	private double gpa;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}
