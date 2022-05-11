package com.test2.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.test1.model.vo.Product;
import com.test2.model.vo.Book;

public class BookListTest {
	
	public static void main(String[] args) {
		
		// 1. 사용자에게 정보 입력받기
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> list = new ArrayList<>(3);
		
		// 2. for 반복문 활용하여 입력받은 값 저장하기
		for (int i = 1; i <= 3; i++) {
			
			System.out.println(i + "번째 도서 정보 입력");

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
			
			// 바로 ArrayList에 넣는 것이 아닌 Product객체를 만들어서 입력받은 값 집어넣기
			Book p = new Book(name, author, publisher, price, discount);
			
			// ArrayList에 입력받은 값 add문을 활용하여 저장하기
			list.add(p);
		}
			
			// for loop문 활용해서 입력받은 값 출력하기
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).information());
			}
				
			// for each문 활용해서 입력받은 값 출력하기
//			for (Product p : list) {
//				System.out.println(p.information());
//			}
			
			
			// 3. set을 활용하여 지역 및 가격 수정하기
			for(int i =0; i< list.size(); i++) {
				list.get(i).setPublisher("나무");
				list.get(i).setPrice(12000);
			}
			
			System.out.println("===== 변경 후 =====");
			for(Book p : list) {
				System.out.println(p.information());
			}
			
			// 할인된 총 가격 구하기
			System.out.println("===================");
			int result =0;
			for(int i = 0; i< list.size(); i++) {			
				result =(int)(list.get(i).getPrice() - (list.get(i).getPrice() * list.get(i).getDiscount()));
				System.out.println("책 이름 : " + list.get(i).getName());
				System.out.println("가격 : " + result);
		}

	}
	
}
