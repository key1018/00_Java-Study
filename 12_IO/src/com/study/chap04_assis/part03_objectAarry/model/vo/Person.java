package com.study.chap04_assis.part03_objectAarry.model.vo;

import java.io.Serializable;

public class Person implements Serializable{ // Serializable 인터페이스 "구현"하여 "직렬화"하기
	
	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name= " + name + ", age=" + age;
	}

}
