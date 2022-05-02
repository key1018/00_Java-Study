package com.study.chap01_beforeVSafter.before.model.vo;

public class School {
	
	private String name;
	private int age;
	private String address;
	private char gender;
	private String schoolName; // 학교명
	private int grade;
	private int classroom;
	
	public School() {
		
	}
	
	public School(String name, int age, String address, char gender, String schoolName, int grade, int classroom) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.schoolName = schoolName;
		this.grade = grade;
		this.classroom = classroom;
	}
	
	// setter메소드
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassRoom(int classroom) {
		this.classroom = classroom;
	}
	
	// getter메소드
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassRoom() {
		return classroom;
	}
	
	// information메소드
	
	public String information() {
		return "이름 : " + name + ",  나이 : " + age + ",  주소 : " + address + ",  성별 : " + gender
				+ ",  학교명 : " + schoolName  + ",  학년 : " + grade + ",  반: "  + classroom;
	}

		
}
