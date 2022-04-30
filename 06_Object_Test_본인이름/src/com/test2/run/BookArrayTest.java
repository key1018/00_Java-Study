package com.test2.run;

import java.util.Scanner;

import com.test2.model.vo.Book;

public class BookArrayTest {
	
	public static void main(String[] args) {

		// A_BookRun 에서는 반복문을 활용 불가
		// 이번 클래스에서는 for반복문을 활용하여 값을 추출하는 방법을 할 것이다.
				
				
		// 1. 배열 형성

		Book[] books = new Book[3];

		// 2. for반복문을 활용하여 사용자에게 책 정보 입력하기

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {

			System.out.println((i + 1) + "번째 도서 정보");

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

			books[i] = new Book(name, author, publisher, price, discount);
		}

		// 3. for반복문을 활용하여 사용자에게 입력받은 책 정보 추출

		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}

		// 4. 사용자가 입력한 도서명으로 for반복문을 활용하여 책 정보 추출

		System.out.print("찾고자하는 도서명을 입력하세요 : ");
		String buy = sc.nextLine();

		// 찾고자하는 도서가 있을 때
		int count = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getName().equals(buy)) {
				System.out.println(books[i].information());
				count++;
			}
		}

		// 찾고자하는 도서가 없을 때

		if (count == 0) {
			System.out.println("검색결과가 없습니다.");
		}

		System.out.println("========================");
		// 책의 가격을 바꾸고자 할 때

		System.out.print("변경된 가격 : ");
		int change = sc.nextInt();

		for (int i = 0; i < books.length; i++) {
			books[i].setPrice(change);
		}

		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}

	}

}
