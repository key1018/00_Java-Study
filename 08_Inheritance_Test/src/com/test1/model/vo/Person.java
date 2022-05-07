package com.test1.model.vo;

public class Person {
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ",  나이 : " + age + ",  키 : " + height + ",  몸무게 : " + weight;
	}

}
