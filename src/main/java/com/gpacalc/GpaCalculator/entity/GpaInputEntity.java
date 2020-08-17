package com.gpacalc.GpaCalculator.entity;

public class GpaInputEntity {
	
	private long studentId;
	
	private long courseID;
	
	private long numRank; 
	
	public long getNumRank() {
		return numRank;
	}

	public void setNumRank(long numRank) {
		this.numRank = numRank;
	}

	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}

	public long getRecordID() {
		return recordID;
	}

	public void setRecordID(long recordID) {
		this.recordID = recordID;
	}

	private long recordID;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


}
