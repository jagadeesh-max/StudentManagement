package com.example.StudentManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	String kid;
	String name;
	String batch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String kid, String name, String batch) {
		super();
		this.kid = kid;
		this.name = name;
		this.batch = batch;
	}
	public String getKid() {
		return kid;
	}
	public void setKid(String kid) {
		this.kid = kid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [kid=" + kid + ", name=" + name + ", batch=" + batch + "]";
	}
	
	

}
