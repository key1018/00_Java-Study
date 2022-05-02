package com.study.chap01_beforeVSafter.after.model.vo;

public class Person { // 부모클래스
	
	// job, library, school 클래스가 모두 가지고있는 요소(필드, 메소드)기술
	
	private  String name;
	private int age;
	private String address;
	private char gender;
	
	// 기본메소드
	public Person() {
		
	}
	
	// 매개변수메소드
	public Person(String name, int age, String address, char gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
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
	
	// information메소드
	
	public String information() {
		return "이름 : " + name + ",  나이 : " + age + ",  주소 : " + address + ",  성별 : " + gender;
	}

}
