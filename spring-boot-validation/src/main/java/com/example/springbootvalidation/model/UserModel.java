package com.example.springbootvalidation.model;

import javax.validation.constraints.NotBlank;

public class UserModel {
	@NotBlank(message="username cannot be empty")
	private String name;
	@NotBlank(message="password cannot be empty")
	private String password;
	private double grade;
	public UserModel(String name, String password, double grade) {
		super();
		this.name = name;
		this.password = password;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
