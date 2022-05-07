package com.test3.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Library {
	
	private String name;
	private String book;
	private String rentalDate;
	private String returnDate;
	private int price;
	private double lateCharges;
	
	public Library() {
		
	}
	
	public Library(String name, String book, String rentalDate, String returnDate, int price, double lateCharges) {
		this.name = name;
		this.book = book;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.price = price;
		this.lateCharges = lateCharges;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBook(String book) {
		this.book = book;
	}
	
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
	
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setLateCharges(double lateCharges) {
		this.lateCharges = lateCharges;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBook() {
		return book;
	}
	
	public String getRentalDate() {
		return rentalDate;
	}
	
	public String getReturnDate() {
		return returnDate;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getLateCharges() {
		return lateCharges;
	}
	
	@Override
	public String toString() {

		return "이름 : " + name + ",  책명 : " + book + ",  대여일 : " + rentalDate + ",  반납일 : " + returnDate + ",  가격 : " + price
				+ ",  연체수수료 : " + lateCharges;
	}
	
}
