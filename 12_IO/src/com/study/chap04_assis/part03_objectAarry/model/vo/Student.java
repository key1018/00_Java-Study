package com.study.chap04_assis.part03_objectAarry.model.vo;

public class Student extends Person{

	private String major;
	
	public Student() {
		
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() +", major=" + major + "]";
	}
	
	

	

}
