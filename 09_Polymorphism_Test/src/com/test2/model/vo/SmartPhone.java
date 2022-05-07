package com.test2.model.vo;

// 추상클래스
public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	public SmartPhone() {
		
	}
	
	// 추상메소드
	public abstract void printMaker();

}
