package com.study.chap01_poly.part02_electronic.controller;

import com.study.chap01_poly.part02_electronic.model.vo.Desktop;
import com.study.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.study.chap01_poly.part02_electronic.model.vo.Tablet;

// 자식클래스(Desktop, NoteBook, Tablet) 전부를 호출하기위한 클래스 
public class ElectronicShop1 {
	
	// 다형성을 적용안했을 경우
	private Desktop desk; // 자료형이 아닌 클래스로 접근가능
	private NoteBook note; // 호출하면 각 클래스의 toString이 반환됨
	private Tablet tab; 
	
	// 오버로딩 적용
	// insert ==> setter메소드 역할
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~);
		/*this.*/desk = d;
	}
	
	public void insert(NoteBook n) {  // NoteBook n = new NoteBook(~~~);
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 조회를 위한 메소드 ==> getter메소드역할
	public Desktop selectDesktop() { // 클래스타입도 반환가능
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}
