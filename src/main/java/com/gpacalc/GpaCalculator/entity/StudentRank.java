package com.gpacalc.GpaCalculator.entity;

public class StudentRank {
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	private long studentId;
	private String studentName;
	private String address;
	private double gpa;
	private int grade;
	
	public StudentRank(long studentId, String address, double gpa, int grade, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.gpa = gpa;
		this.grade = grade;
	}
}
