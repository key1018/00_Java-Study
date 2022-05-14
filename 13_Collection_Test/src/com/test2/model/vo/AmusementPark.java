package com.test2.model.vo;

public class AmusementPark {
	
	private String name;
	private int age;
	private String membership;
	private double discount;
	
	public AmusementPark() {
		
	}

	public AmusementPark(String name, int age, String membership, double discount) {
		super();
		this.name = name;
		this.age = age;
		this.membership = membership;
		this.discount = discount;
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

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "AmusementPark [회원명 = " + name + ", 나이 = " + age + ", 멤버십 = " + membership + ", 할인율 = " + discount
				+ "]";
	}

}
