package com.test1.model.vo;

public class Product {
	
	// 필드 == 멤버변수 == 인스턴스 변수
	
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	// 기본생성자
	
	public Product() {
		
	}
	
	// 매개변수생성자
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// setter 메소드
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// getter 메소드
	
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}
	
	// information생성자
	
	public String information() {
		return "ID : " + productId + ", 상품명 : " + productName + ", 지역 : " + productArea + ", 가격 : " + price + ", 부과세 : "
				+ tax;
		}

}
