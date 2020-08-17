package com.gpacalc.GpaCalculator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "marks")
public class Marks {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column ( name = "RECORD_ID")
	private long recordID;
	
	@Column ( name = "STUDENT_ID")
	private long studentID;
	
	@Column (name = "COURSE_ID")
	private long courseID;
	
	@Column (name = "SEMESTER")
	private int semester;
	
	@Column (name = "SCORE")
	private int score;
	
	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public long getRecordID() {
		return recordID;
	}

	public void setRecordID(long recordID) {
		this.recordID = recordID;
	}

}
