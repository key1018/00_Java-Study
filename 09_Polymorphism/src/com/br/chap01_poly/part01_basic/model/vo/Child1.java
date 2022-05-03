package com.br.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent{
	
	private String c;
	
	public Child1() { // 부모클래스의 기본생성자를 삭제하면 오류발생한다
	// super(); 	     왜? ==> super(); 이 생략되어있음
	}
	
	public Child1(String a, String b, String c) {
		super(a, b);
		this.c = c;
	}
	
	public void setC(String c) {
		this.c = c;
	}
	
	public String getC() {
		return c;
	}
	
	public void printChild1() {
		System.out.println("난 자식1클래스야 ");
	}

}
