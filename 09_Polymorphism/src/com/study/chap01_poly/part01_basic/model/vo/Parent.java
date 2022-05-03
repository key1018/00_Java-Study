package com.study.chap01_poly.part01_basic.model.vo;

public class Parent /*extends Object*/ {

	private String a;
	private String b;
	
	public Parent() {
		
	}
	
	public Parent(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(String a) {
		this.a = a;
	}
	
	public void setB(String b) {
		this.b = b;
	}
	
	public String getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
	
	public void printParent() {
		System.out.println("난 부모클래스야");
	}
	
	public void print() {
		System.out.println("나 부모니까 잘해");
	}
	
	
}
