package com.test2.model.vo;

public class Book {
	
	// 필드 == 멤버변수 == 인스턴스 변수
	 
	private String name;
	private String author;
	private String publisher;
	private int price;
	private double discount;
	
	// 기본생성자
	
	public Book() {
		
	}
	
	// 매개변수생성자
	
	// 매개변수 4개인 매개변수생성자
	public Book(String name, String author, String publisher, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		
	}
	
	// 매개변수 5개인 매개변수생성자
	public Book(String name, String author, String publisher,
			int price, double discount) {
		this(name, author, publisher, price);
		this.price = price;
		this.discount = discount;
	}
	
	// setter메소드
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	// getter메소드
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	// information메소드
	
	public String information() {
		return "책 이름 : " + name + ", 저자 : " + author + ", 출판사 : " + publisher
				+ ", 가격 : " + price + ", 할인율 : " + discount;
	}
	

}
