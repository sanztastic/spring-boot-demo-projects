package com.example.freemarker.model;

public class Student {
	private long id;
	private String studentName;
	private double grade;
	
	public Student(long id, String studentName, double grade) {
		this.id = id;
		this.studentName = studentName;
		this.grade = grade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
