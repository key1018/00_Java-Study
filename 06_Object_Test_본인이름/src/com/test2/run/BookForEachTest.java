package com.test2.run;

import java.util.Scanner;

import com.test2.model.vo.Book;

public class BookForEachTest {

	public static void main(String[] args) {

		/*
		 * * for each문 => 향상된 for문
		 *  - 배열 또는 컬렉션과 함께 사용됨
		 *  - 0번인덱스 ~ 마지막인덱스까지 순차적으로 접근하여 출력하는데 사용
		 *    ==> 중간인덱스까지만 출력하는 것은 불가능!!!
		 *    
		 *  [표현법]
		 *  for(순차적으로 접근될 값을 담을 변수 : 순차적으로 접근할 배열) {
		 *  	반복횟수 == 배열의 크기
		 *  }
		 * 	
		 */
		
		/*
	// 예시
		int arr[] = {10,20,30};
		
		for(int value : arr ) {
			System.out.print(value + " ");
		}
		*/
		
	// 	A_BookArrayPractice의 객체 형성하기
		
		Book[] books = new Book[3];
		
		books[0] = new Book("플루톤의 국가론", "플루토", "나무", 39000, 0.1);
		books[1] = new Book("파과", "구운모" ,"월리스" , 13900, 0.2);
		books[2] = new Book("빨강머리", "레드","나무", 8900, 0.1);
		
	// for-each문을 활용하여 0번인덱스 ~ 마지막인덱스까지 출력하기
		
		for(Book a : books) {
			System.out.println(a.information());
		}
		
		// 구매하고자하는 책들의 총 합계 구하기
		int sum = 0;
		for(Book a : books) {
			sum += a.getPrice();
		}
		
		System.out.println("책들의 총 합계 : " + sum);
		
		// 구매하고자하는 책의 정보 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자하는 책의 이름을 입력하세요 : ");
		String buy = sc.nextLine();
		
		int count = 0; // 찾는 책의 유무를 확인하는 변수
		
		for(Book a : books) {
			if(a.getName().equals(buy)){
				System.out.println(a.information());
				count++;
			}
		}
		
		if(count == 0) { // 찾는 책의 정보가 없는 경우
			System.out.println("찾으시는 책의 정보가 없습니다.");
		}
		
		// 찾는 책의 할인율을 변경하고자하는 경우
		
		System.out.print("\n변경하고자하는 책의 이름을 입력해주세요 : ");
		String change = sc.nextLine();
		
		int result = 0; // 변경하고자하는 책의 유무를 확인하는 변수
		
		for(Book a : books) {
			if(a.getName().equals(change)) {
				System.out.print("변경할 할인율 : ");
				a.setDiscount(sc.nextDouble());
				System.out.println(a.information());
				result++;
			}
		}
		
		if(result == 0 ) { // 변경할 책의 정보가 없는 경우
			System.out.println("변경하고자하는 책의 정보가 없습니다.");
		}

	}

}
