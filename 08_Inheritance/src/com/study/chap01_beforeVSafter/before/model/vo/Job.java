package com.study.chap01_beforeVSafter.before.model.vo;

public class Job {
	
	private String name;
	private int age;
	private String address;
	private char gender;
	private String area; // 일하는 지역

	public Job() {
		
	}
	
	public Job(String name, int age, String address, char gender, String area) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.area = area;
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
	
	public void setArea(String area) {
		this.area = area;
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
	
	public String getArea() {
		return area;
	}
	
	// information메소드
	
	public String information() {
		return "이름 : " + name + ",  나이 : " + age + ",  주소 : " + address + ",  성별 : " + gender + ",  회사지역 : " + area;
	}
	
}
