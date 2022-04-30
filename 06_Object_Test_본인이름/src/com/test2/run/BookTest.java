package com.test2.run;

import java.util.Scanner;

import com.test2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {

		
		/*
		// 방법 1. 입력된 값 그 자체를 받는 방법
		// 기본생성자로 객체 생성 => 인스턴스화 한다
		
		Book a1 = new Book();
		
		a1.setName("그레이브 디거");
		a1.setAuthor("홍길순");
		a1.setPublisher("나무 출판사");
		a1.setPrice(15000);
		a1.setDiscount(0.2);
		
		
		// 매개변수 4개인걸로 객체생성
		
		Book a2 = new Book("파과", "구병모", "위즈덤하우즈" , 12000);
		
		// 매개변수 5개인걸로 객체생성

		Book a3 = new Book("맹꽁이", "홍자", "구름", 13000, 0.4);
		
		
		// 각 객체 호출
		
		System.out.println(a1.information());
		System.out.println(a2.information());
		System.out.println(a3.information());
		*/
		
		/*
		//방법 2. 사용자에게 값을 입력받은 값을 추출하기
		==> 3개의 객체를 호출하고자한다면 하나하나 다 코드를 작성해야한다
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("도서명 : ");
		String name = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		A_BookArrayPractice a1 = new A_BookArrayPractice(name, author, publisher, price);
		System.out.println(a1.information());
		
		System.out.print("도서명 : ");
		String name2 = sc.nextLine();
		
		System.out.print("저자 : ");
		String author2 = sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher2 = sc.nextLine();
		
		System.out.print("가격 : ");
		int price2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("할인율 : ");
		double discount2 = sc.nextDouble();
		sc.nextLine();
		

		Book a2 = new Book(name2, author2, publisher2, price2, discount2);
		System.out.println(a2.information());
		
		System.out.print("도서명 : ");
		String name3 = sc.nextLine();
		
		System.out.print("저자 : ");
		String author3 = sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher3 = sc.nextLine();
		
		System.out.print("가격 : ");
		int price3 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("할인율 : ");
		double discount3 = sc.nextDouble();
		sc.nextLine();
		
		Book a3 = new Book(name3, author3, publisher3, price3, discount3);
		System.out.println(a3.information());
		
		방법 2 끝 */ 
		
		// 방법 3. 사용자에게 값을 입력받아 if-else을 활용하여 추출하기
		
		
		Book a1 = null;
		Book a2 = null;
		Book a3 = null;
				
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println((i+1)+"번째 도서 정보");
			
			System.out.print("도서명 : ");
			String name = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("할인율 : ");
			double discount = sc.nextDouble();
			sc.nextLine();
			
			if(i==0) {
				a1 = new Book(name, author, publisher, price);
			} else if(i == 1) {
				a2 = new Book(name, author, publisher, price, discount);
			} else {
				a3 = new Book(name, author, publisher, price, discount);
			}
		}

		System.out.println(a1.information());
		System.out.println(a2.information());
		System.out.println(a3.information());

		// 반복문 사용 불가로 매번 조건검사 후 값을 추출해야함
		// ==> 책의 정보가 많은 경우 정보를 하나하나 다 입력하기 힘들다!
		
		
		// 도서제목으로 검색하는 서비스 기능 구현
		
		System.out.print("찾고자하는 도서명 : ");
		String buy = sc.nextLine();

		if (a1.getName().equals(buy)) {
			System.out.println(a1.information());
		} else if (a2.getName().equals(buy)) {
			System.out.println(a2.information());
		} else if (a3.getName().equals(buy)) {
			System.out.println(a3.information());
		} else {
			System.out.println("찾으시는 도서는 없는 도서입니다.");
		}

	}

}
