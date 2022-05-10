package com.study.chap04_assis.part03_objectAarry.model.vo;

public class Employee extends Person{
	
	private String dept;

	public Employee() {
		
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [dept=" + dept + super.toString() + "]";
	}

}
