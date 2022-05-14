package com.test1.list.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.test1.list.controller.BookController;
import com.test1.list.model.vo.Book;

public class BookMenu {
	
	private BookController bc = new BookController(); // BookController의 메소드들을 사용하기 위한 레퍼런스
	private Scanner sc = new Scanner(System.in); // 사용자에게 키보드로 값을 입력 받기 위한 Scanner 객체
	
	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("===== 메인 메뉴 ====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제하기");
			System.out.println("5. 도서 정도 수정하기");
			
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: updateBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력하였습니다. 다시 입력해주세요"); break;
			}
		}
		
	}
	
	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
		/*
		 * 1. 도서명 입력받기 (String title)
		 * 2. 저자명 입력받기 (String author)
		 * 3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
		 * 4. 가격 입력받기 (int price)
		 * 
		 * 5. bc(BookController)의 insertBook메소드 호출하면서 위의 내용들 전달
		 */
		
		
		// 위의 순서대로 작성해보세용 ~ 찡긋^^
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int category = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Book> list = bc.insertBook(title, author, category, price);
		
		// 반복문 활용하여 추가한 도서 출력하기
		for(int i = 0; i < list.size(); i++) {
			if((list.get(i).getTitle()).equals(title)) {
				System.out.println("\n" + list.get(i));
				System.out.println("성공적으로 도서 정보를 추가했습니다.");
			}
		}
		System.out.println();
	}
	
	
	// 2. 도서 전체용 view 메소드
	public void selectList() {
		/*
		 * 1. bc(BookController)의 selectList() 메소드를 호출 후
		 *    --> 돌아온 결과 값을 리스트(ArrayList<Book> bookList)하나 만들어서 대입
		 * 
		 * 2. 조건식 이용해서 
		 * 2_1. bookList가 "비어있는 경우"    -->   "존재하는 도서가 없습니다." 라는 알람 문구 출력
		 * 2_2. bookList가 "비어있지 않은 경우" -->   반복문을 통해 bookList 안의 Book 객체들 출력
		 * 
		 */
		
		// 위의 순서대로 작성해보세요 ~ 화이팅^^
		
		ArrayList<Book> list = bc.selectList();
		
		System.out.println("\n=== 도서 전체 출력 ===");
		for(int i =0; i<list.size(); i++) {
			if(list.get(i) != null) {
				System.out.println(list.get(i));
			} else {
				System.out.println("존재하는 도서가 없습니다.");
			}
		}
		System.out.println();
	}
	
	
	// 3. 도서 검색용 view 메소드
	public void searchBook() {
		/*
		 * 1. 검색할 도서명 키워드로 입력받기 (String keyword) 
		 * 2. bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 하면서 호출
		 *    --> 이때 돌아온 결과 값을 리스트(ArrayList<Book> searchList) 하나 만들어서 대입
		 *    
		 *    ** 왜 결과 값이 한 도서의 Book 객체가 아니라 리스트 인가요??
		 *    	  보통 키워드로 검색한다! 즉, 그 키워드를 포함한 결과가 하나가 아니라 여러개일 수 있기 때문에 리스트로 받아보자~!
		 * 
		 * 3. 조건식 이용해서
		 * 3_1. searchList가 "비어있는 경우"    -->  "검색 결과가 없습니다." 라는 알람 문구 출력
		 * 3_2. searchList가 "비어있지 않은 경우" -->  반복문을 통해 searchList 안의 Book 객체들 출력
		 * 
		 */
		
		// 위의 순서대로 작성해보세요 ~ 얼마 안남았어요~!!
		
		System.out.print("검색하고자하는 도서명 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);

		System.out.println("\n=== 검색된 도서 조회 ===");
		
		if(searchList.isEmpty()) { // 검색한 도서 결과가 없는 경우
			System.out.println("검색 결과가 없습니다.");
		} else { // 검색한 도서 결과가 있는 경우
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		System.out.println();

	}
	
	
	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {
		/*
		 * 1. 삭제할 도서명 입력받기 (String title)
		 * 2. 삭제할 저자명 입력받기 (String author)
		 * 
		 * ** 왜 도서명만 입력받는게 아니라  저자명도 입력받나요??
		 *    같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있자나요~~ㅎㅎ
		 *    그래서 조금 더 확실히 하려고 도서명 저자명 둘 다 입렵받은 거에요~!!
		 *    
		 * 3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, author 값 전달 하면서 호출
		 * 	  --> 이때 돌아온 결과 값을 result에 받기!
		 * 
		 * 4. 조건식 이용해서
		 * 4_1. result가 1일 경우       -->  "성공적으로 성공적으로 삭제되었습니다." 라는 알람 문구 출력
		 * 4_2. result가 0일 경우    	  -->  "삭제할 도서를 찾지 못했습니다." 라는 알람 문구 출력
		 *  
		 */
		
		// 위의 순서대로 작성해보세요 ~ 이제 거의 끝났어요~!!
		
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		int result = bc.deleteBook(title, author);
		
		if (result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
			selectList();
		} else {
			System.out.println("삭제할 도서를 찾기 못했습니다.");
		}

	}
	
	
	// 5. 도서 수정용 View메소드
	public void updateBook() {
		
		System.out.println("\n=== 도서 수정 ===");
		
		System.out.print("수정하고자하는 기존의 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(도서명, 저자명, 장르, 가격) : ");
		String update = sc.nextLine();
		
		ArrayList<Book> updateList = bc.updateBook(title);
		
		// 수정 전 도서 출력하기
		System.out.println("\n-- 수정 전 도서 --");
		if (updateList.isEmpty()) {
			System.out.println("수정하고자하는 도서를 찾지 못했습니다.");
		} else {
			for (int i = 0; i < updateList.size(); i++) {
				System.out.println(updateList.get(i));
			}
		}
		System.out.println();
		
		int result = bc.updateBook(title, update);
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
			System.out.println("\n-- 수정 후 도서 --");
			for (int i = 0; i < updateList.size(); i++) {
				System.out.println(updateList.get(i));
			}
		}
		
		System.out.println();
	}

}
