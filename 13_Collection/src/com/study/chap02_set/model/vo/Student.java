package com.study.chap02_set.model.vo;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 현 객체와 비교대상객체의 주소값이 일치할 경우 == 같은 곳을 참조
			return true;
		if (obj == null) // 비교대상의객체가 null일 경우 비교할 가치도 없이 false반환
			return false;
		if (getClass() != obj.getClass()) // 현객체의 클래스타입과 비교대상객체의 클래스타입이 다를 경우 비교할 가치도 없이 false반환
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	

}
