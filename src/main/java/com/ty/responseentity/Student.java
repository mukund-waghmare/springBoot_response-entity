package com.ty.responseentity;

public class Student {
	
	private int studenId;
	
	private String studentName;
	
	private double studentMarks;

	public int getStudenId() {
		return studenId;
	}

	public void setStudenId(int studenId) {
		this.studenId = studenId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}

	public Student(int studenId, String studentName, double studentMarks) {
		this.studenId = studenId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [studenId=" + studenId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	
	
	

}
