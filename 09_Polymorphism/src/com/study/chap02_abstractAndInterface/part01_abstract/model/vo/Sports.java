package com.study.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sports { // 추상메소드가 있을 때 클래스도 추상클래스로 정의해야함

	private int people;

	public Sports() {

	}

	public Sports(int people) {
		this.people = people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}
	
	// 추상메소드 ==> 미완성된 메소드 ==> 자식클래스들이 완성시킴
	public abstract void rule();

}
