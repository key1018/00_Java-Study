package com.test1.model.vo;

// 추상클래스
public abstract class Animal {
	
	private String name;
	private String kinds;
	
	public Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public String getName() {
		return name;
	}
	
	public String getKinds() {
		return kinds;
	}
	
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다."; 
	}
	
	// 추상메소드
	public abstract void speak();
	

}
