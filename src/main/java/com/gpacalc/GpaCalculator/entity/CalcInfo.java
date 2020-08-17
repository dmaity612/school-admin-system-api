package com.gpacalc.GpaCalculator.entity;

public class CalcInfo {

	private long courseID;
	private long studentId;
	private int score; 
	private double level;
	
	public CalcInfo(long courseID,long studentId, int score, double level) {
		this.courseID = courseID;
		this.studentId = studentId;
		this.level = level;
		this.score = score;
	}
	
	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

}
