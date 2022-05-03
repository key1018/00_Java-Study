package com.br.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent{
		
	private String d;
	
	public Child2() {
		
	}
	
	public Child2(String a, String b, String d) {
		super(a, b);
		this.d = d;
	}
	
	public void setD(String d) {
		this.d = d;
	}
	
	public String getD() {
		return d;
	}
	
	public void printChild2() {
		System.out.println("난 자식2클래스야");
	}
	
}
