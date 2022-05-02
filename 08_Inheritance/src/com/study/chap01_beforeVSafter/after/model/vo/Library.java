package com.study.chap01_beforeVSafter.after.model.vo;

public class Library extends Person{
	
	private String borrow;
	private String date;
	
	public Library() {
		
	}
	
	public Library(String name, int age, String address, char gender, String borrow, String date) {
		super(name, age, address, gender);
		this.borrow = borrow;
		this.date = date;
	}
	
	public void setBorrow(String borrow) {
		this.borrow = borrow;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getBorrow() {
		return borrow;
	}
	
	public String getDate() {
		return date;
	}
	
	public String information() {
		return super.information() + ",  빌린책 : " + borrow + ",  대여일 : " + date;
	}

}
