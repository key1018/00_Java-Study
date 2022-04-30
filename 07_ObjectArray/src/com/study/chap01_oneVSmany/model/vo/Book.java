package com.study.chap01_oneVSmany.model.vo;

public class Book {
	
	// 필드 == 멤버변수 == 인스턴스변수
		private String title; // 도서명
		private String author; // 저자
		private int price; // 가격
		private String publisher; // 출판사
		
		// 기본 생성자
		
		public Book() {
			
		}
		
		// 매개변수생성자 (모든 필드 다 초기화)
		// this. 에는 해당 필드의 주소값이 담겨져있다
		
		public Book(String title, String author, int price, String publisher) {
			this.title = title;
			this.author = author;
			this.price = price;
			this.publisher = publisher;
		}

		// 각 필드에대한 setter메소드
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		
		// 각 필드에대한 getter메소드
		// 필드에 담겨있는 값을 반환시켜줌
		
		public String getTitle() {
			return title;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public int getPrice() {
			return price;
		}
		
		public String getPublisher() {
			return publisher;
		}
		
		// information 메소드
		
		public String information() {
			return "title : " + title + ", author : " + author + ", price : " + price 
					+ ", publisher : " + publisher;
		}

}
