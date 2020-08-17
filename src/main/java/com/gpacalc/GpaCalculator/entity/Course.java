package com.gpacalc.GpaCalculator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "course")
public class Course {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column ( name = "COURSE_ID")
	private long courseID;
	
	@Column (name = "SUBJECT")
	private String subject;
	
	@Column (name = "LEVEL")
	private double level;
	
	@Column (name = "TEACHER")
	private String teacher;
	
	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
