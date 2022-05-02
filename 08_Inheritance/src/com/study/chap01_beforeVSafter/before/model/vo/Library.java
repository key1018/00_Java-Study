package com.study.chap01_beforeVSafter.before.model.vo;

public class Library {
	
	private String name;
	private int age;
	private String address;
	private char gender;
	private String borrow; // 빌린책
	private String date; // 대여일
	
	public Library() {
		
	}
	
	public Library(String name, int age, String address, char gender, String borrow, String date) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.borrow = borrow;
		this.date = date;
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
		
		public void setBorrow(String borrow) {
			this.borrow = borrow;
		}
		
		public void setDate(String date) {
			this.date = date;
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
		
		public String getBorrow() {
			return borrow;
		}
		
		public String getDate() {
			return date;
		}
		
		// information메소드
		
		public String information() {
			return "이름 : " + name + ",  나이 : " + age + ",  주소 : " + address + ",  성별 : " + gender
					+",  빌린책 : " + borrow + ",  대여일 : " + date;
		}
	

}
