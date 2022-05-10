package com.study.chap04_assis.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // Serializable 인터페이스 "구현"하여 "직렬화"하기
	
	private String name;
	private int price;
	
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}

}
