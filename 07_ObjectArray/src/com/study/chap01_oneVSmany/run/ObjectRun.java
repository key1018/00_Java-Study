package com.study.chap01_oneVSmany.run;

import java.util.Scanner;

import com.study.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {
	
	public static void main(String[] args) {
	
	// 복습
	// 방법1. 기본생성자로 생성 후 setter메소드를 이용해서 값 초기화
	/*
	Book bk = new Book(); // Book객체 생성 (기본생성자) => 인스턴스화 한다

	bk.setTitle("자바");
	bk.setAuthor("강보람");
	bk.setPrice(10000);
	bk.setPublisher("문학");
	*/
	
	// 방법2. 매개변수생성자로 생성과 동시에 값 초기화
	/*
	Book bk = new Book("자바", "강보람", 10000, "문학");
	// System.out.println(bk); // bk의 주소값이 출력됨
	
	System.out.println(bk.information());
	*/
	
	// [응용] 사용자에게 입력받은 값으로 객체 생성 후 초기화
	
	Scanner sc = new Scanner(System.in);
	/*
	System.out.print("도서명 : ");
	String title = sc.nextLine(); // Book클래스의 필드와 연관성 x
	
	System.out.print("저자 : ");
	String author = sc.nextLine();
	
	System.out.print("가격 : ");
	int price = sc.nextInt();
	sc.nextLine();
	
	System.out.print("출판사 : ");
	String publisher = sc.nextLine();
	
	Book bk = new Book(title, author, price, publisher);
	// 입력받을 변수들을 직접 넣음
	
	System.out.println(bk.information());
	*/
	
	
	// 3개의 Book객체를 생성해서 관리해야된다면??
	
	Book bk1 = null;
	Book bk2 = null;
	Book bk3 = null;
	
	// 사용자에게 입력받은 값으로 3개의 도서객체 생성하는 기능 구현
	for(int i = 0; i < 3; i++) { // i=0 => i=1 => i=2
		
		System.out.println((i+1) + "번째 도서 정보 입력");
		
		System.out.print("도서명 : ");
		String title = sc.nextLine(); // Book클래스의 필드와 연관성 x
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		// 매번 조건검사 후 각각의 객체 생성해야됨
		if(i == 0) {
			bk1 = new Book(title, author, price, publisher);				
		} else if (i == 1) {
			bk2 = new Book(title, author, price, publisher);			
		} else {
			bk3 = new Book(title, author, price, publisher);			
		}
	}
	
	// 전체 도서 정보들 조회하는 기능 구현 (반복문활용x)
	System.out.println(bk1.information());
	System.out.println(bk2.information());
	System.out.println(bk3.information());
	
	
	
	// 도서제목으로 검색하는 서비스 기능 구현
	
	System.out.print("찾고자하는 도서명 : ");
	String search = sc.nextLine();
	
	if(bk1.getTitle().equals(search)) { // 반복문 불가능
		System.out.println("검색결과 - " + bk1.information());
	}
	
	if(bk2.getTitle().equals(search)) {
		System.out.println("검색결과 - " + bk2.information());
	}
	
	if(bk3.getTitle().equals(search)) {
		System.out.println("검색결과 - " + bk3.information());
	}
	
}

}

