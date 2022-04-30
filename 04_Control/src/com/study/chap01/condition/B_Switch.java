package com.study.chap01.condition;

import java.util.Scanner;

public class B_Switch {


	Scanner sc = new Scanner(System.in);


	/*
	* * switch문
	* 	(if문과 동일하게 조건문이다)
	* 
	* if와의 "차이점"
	* 
	* 1) if문은 조건식을 자유롭게 쓸 수 있지만
	* switch는 오로지 동등비교할 값만 제시가능!
	* 2) if문은 해당 경우의 실행할 구문만 실행하고 자동으로 빠져나가지만
	* switch문은 자동으로 빠져나오지 못함 (직접 break;를 써서 빠져나가야함)
	* 
	*  [표현법]
	*  switch(동등비교할 대상자) {
	*  case 1 : 실행코드1; break;
	*  case 2 : 실행코드2; break;
	*  case 3 : 실행코드3; break;
	*  [default : case들이 모두 falase일 때 실행할 코드; break; / return; ]
	*/

		public void method1() {
		
		System.out.print("정수(1~3) : ");
		int num = sc.nextInt();
		
		/*
		switch (num) {
		case 1 : System.out.println("1번을 선택하셨습니다"); 
		case 2 : System.out.println("2번을 선택하셨습니다"); 
		case 3 : System.out.println("3번을 선택하셨습니다");  
		default : System.out.println("다시 입력해주세요");
		}
		
		case1이 true일 경우 : case 1~3번까지 모두 실행
		case2가 true일 경우 : case 2~3번까지 실행 
			 => break문을 이용하여 true인 문장만 출력하도록 실행함
		*/
		 
		
		switch (num) {
		case 1 : System.out.println("1번을 선택하셨습니다"); break;
		case 2 : System.out.println("2번을 선택하셨습니다"); break;
		case 3 : System.out.println("3번을 선택하셨습니다"); break;
		default : System.out.println("다시 입력해주세요");
		}
		
		}
		
		public void method2() {
		
			System.out.print("구매할 도서의 이름을 입력해주세요(그레이브 디거, 아가미, 파과) : ");
			String book = sc.nextLine();
			
			
			int price = '0';
			
			/*
			if("그레이브 디거".equals(book)) {
				price = 8900;
			} else if ("아가미".equals(book)) {
				price = 10900;
			} else if ("파과".equals(book)) {
				price = 9900;
			} else {
				System.out.println("도서의 이름을 다시 입력해주세요");
				return;
			}
			
			System.out.printf("%s의 가격은 %d원 입니다", book, price);
			*/
			
			switch (book) {
			case "그레이브 디거" : price = 8900; break;
			case "아가미" : price = 10900; break;
			case "파과" : price = 9900; break;
			default : System.out.println("도서의 이름을 다시 입력주세요"); return;
			}
			
			System.out.printf("%s의 가격은 %d원 입니다", book, price);
		
		}
		
		public void method3() {
			
			/*
			 * break; 문을 안써도 되는 예시
			 * - 값이 내림차순으로 점차 증가되거나 중복될 경우 안써도 된다
			 * 
			 * 문제 예시)
			 * 
			 * 등급별 권한
			 * 1등급 : 게시글 및 회원 관리, 글쓰기, 읽기 가능
			 * 2등급 : 글쓰기, 읽기 가능
			 * 3등급 : 읽기 가능
			 */
			
			System.out.print("등급(숫자만) : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : System.out.println("게시글 및 회원 관리");
			case 2 : System.out.println("글쓰기");
			case 3 : System.out.println("읽기 가능"); break;
			default : System.out.println("등급을 다시 입력해주세요."); return;
			}
			
		}
		
		public void method4() {
			
			System.out.print("구매할 도서의 이름을 입력해주세요(그레이브 디거, 아가미, 파과) : ");
			String book = sc.nextLine();
			
			
			int price = '0';
			
			switch(book) { // 그레이브 디거의 가격이 8900 -> 10900원으로 인상 되었을 경우
			case "그레이브 디거" :
			case "아가미" : price = 10900; break;
			case "파과" : price = 9900; break;
			default : System.out.println("도서명을 다시 입력해주세요."); return;
			}
			
			System.out.printf("%s의 가격은 %d원 입니다.\n구매해주셔서 감사합니다.", book, price);
			
		}
		
	public void method5() {
		
		// 1,3,5,7,8,10,12월 : 31일
		// 4,6,9,11월 : 30일
		// 2월 : 28일 또는 29일
		
		System.out.print("월(1~12월)을 입력해주세요 : ");
		int season = sc.nextInt();
		sc.nextLine();
		
		String result = "";
		
		/*
		// 1. if문
		
		if(season == 1 || season == 3 || season == 5 || season == 7 || season == 8 
				|| season == 10 || season == 12) {
			result = "31일";
		} else if (season == 4 || season == 6 || season == 9 || season == 11) {
			result = "30일";
		} else if (season == 2) {
			result ="28일 또는 29일";
		} else {
			System.out.println("월을 잘못입력하셨습니다."); return;
		}
		
		System.out.printf("입력하신 %d월은 %s 까지 입니다.", season, result);
		*/
		
		
		// 2. switch문
		
		switch(season) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : result = "31일"; break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : result = "30일"; break;
		case 2 : result = "28일 또는 29일"; break;
		default : System.out.println("월을 잘못입력하셨습니다."); return;
		}

		System.out.printf("입력하신 %d월은 %s 까지 입니다.", season, result);

	}

}
