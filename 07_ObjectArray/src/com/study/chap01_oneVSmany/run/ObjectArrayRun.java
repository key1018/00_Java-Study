package com.study.chap01_oneVSmany.run;

import java.util.Scanner;

import com.study.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	
	public static void main(String[] args) {


		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		Scanner sc = new Scanner(System.in);
		
		// 객체 배열 활용
		
		Book[] books = new Book[3];
		
		// Book = new Book();
		//books[0] = new Book();
		
		for(int i = 0; i < books.length; i++) { // i=0 => i=1 => i=2
			
			System.out.println((i+1)+ "번째 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 각각의 인덱스에 차곡차곡 객체 생성
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		// 전체 도서 정보들 조회하는 기능 구현 => 반복문 활용 가능
		
		for(int i =0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색 서비스 기능 구현
		
		System.out.print("찾고자하는 도서명 : ");
		String search = sc.nextLine();
		
		int count = 0; // 찾아진 도서의 개수를 보관할 변수
		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle().equals(search)) {
				System.out.println("검색결과 - " + books[i].information());
				count++;
			}
		}
		
		// 찾은도서가 없을 때 (검색결과가 없을 때)
		if(count==0) {
			System.out.println("검색결과가 없습니다.");
		}
		
		

	}

}
