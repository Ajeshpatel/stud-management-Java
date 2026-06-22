package com.student.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id // primary key
	private int roll;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private String email;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int age, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
