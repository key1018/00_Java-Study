package com.study.chap01_beforeVSafter.after.model.vo;

public class Job extends Person{
	
	private String area;
	
	public Job() {
		
	}
	
	public Job(String name, int age, String address, char gender, String area) {
		super(name, age, address, gender);
		this.area = area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getArea() {
		return area;
	}
	
	public String information() {
		return super.information() + ",  일하는 위치 : " + area;
	}

}
