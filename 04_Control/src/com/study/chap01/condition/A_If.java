package com.study.chap01.condition;

import java.util.Scanner;

// 조건문 if
public class A_If {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * * 단독 if문
	 * 
	 * [표현법]
	 * if (조건문) { ==> 조건문 : true/false
	 * 	실행코드  ==> true일 경우 실행됨
	 * }
	 * 
	 * 조건문이 true일 경우 : if문 안에 있는 '실행코드' 실행됨
	 * 조건문이 false일 경우 : if문 안에 있는 '실행코드'실행 안됨
	 */
	
	public void method1() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num > 0) {
			System.out.println("양수다");
		}
		if (num == 0) {
			System.out.println("0이다");
		}
		if (num < 0) {
			System.out.println("음수다");
		}
		
		
		System.out.println();
		System.out.println("무엇을 구매하시겠습니까? ");
		System.out.print("바나나, 수박, 참외 품목이 있습니다 : ");
		String fruit = sc.nextLine();
		
		if(fruit.equals("바나나")) {
			System.out.println("1개에 1000원 입니다.");
		}
		if(fruit.equals("수박")) {
			System.out.println("1개에 5000원 입니다.");
		}
		if(fruit.equals("참외")) {
			System.out.println("1개에 3500원 입니다.");
		}
	}
	
	
	/*
	 * * if-else문
	 * 
	 * [표현법]
	 *  if(조건문) {
	 *  	실행코드1
	 *  } else {
	 *  	실행코드2
	 *  }
	 *  
	 *  조건문이 true일 경우 : if문 안에 있는 실행코드1 실행
	 *  조건문이 false일 경우 : else문 안에 있는 실행코드2 실행
	 */
	
	public void method2() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.println("양수이다");
		} else {
			System.out.println("양수가 아니다");
		}
		
		System.out.println("무슨 과일을 구매하시겠습니까?");
		System.out.print("바나나, 딸기 중에 고르세요 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		if("바나나".equals(fruit)) {
			price = 1000;
		} else {
			price = 2400;
		}
		
		System.out.printf("%s는 %d원입니다", fruit, price);
		
	}
	
	/*
	 * *if-else i문
	 *  같은 비교대상으로 여러개의 조건을 제시해야 할 경우
	 *  
	 *  [표현법]
	 *  if(조건식1) {
	 *  	실행코드1
	 *  } else if(조건식2) {
	 *  	실행코드2
	 *  } else if(조건식3) {
	 *  	실행코드3
	 *  } [else {
	 *  	위의 if, else if 조건들이 다 false일 경우 실행할 코드;
	 *  }] => 생략가능
	 *  
	 *  else if의 개수는 제한x
	 */
	
	public void method3() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
		
		System.out.println("도서관에 오신것을 환영합니다.");
		System.out.print("회원가입을 진행하겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		
		if (ch == 'y' || ch == 'Y') {
			System.out.println("회원가입을 진행하겠습니다.");
		} else if (ch == 'n' || ch == 'N') {
			System.out.println("회원가입을 종료합니다.");
		} else {
			System.out.println("다시 입력해주세요.");	
		}
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F)을 입력해주세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		
		String gender = "";
		
		/*
		if (ch2 == 'm' || ch2 == 'M') {
			gender = "남자";
		} else if (ch2 == 'f' || ch2 == 'M') {
			gender = "여자";
		} else {
			System.out.println("성별을 다시 입력해주세요.");
			return; // 메소드문(method3)자체를 빠져나감 ==> 뒤에 코드들 실행 x
		} 
		*/

		String result = "";
		
		if (age <= 13) {
			result = "어린이";
		} else if ( age  <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		
		// if - else if 의 범위는 {}에 의해 서로 다르기때문에 같은 변수이름을 써도 상관 x
		System.out.printf("%s님은 %d살입니다. %s회원입니다\n", name, age, result);
	
		
		
		if (ch2 == 'm' || ch2 == 'M') {
			gender = "남자";
		} else if (ch2 == 'f' || ch2 == 'M') {
			gender = "여자";
		} else {
			System.out.println("성별을 다시 입력해주세요.");
			return; // 메소드문(method3)자체를 빠져나감 ==> 뒤에 코드들 실행 x
		} 
		
		System.out.println(name + "님의 성별은 " + gender + "입니다.");
		
		
	}
	
	
	public void method4() {
		
		System.out.println("1번 크루주패키지 2번 호텔패키지 3번 유럽패키지 4번 동남아패키지");
		System.out.print("다음 중 구매할 상품을 입력하세요 : ");
		String goods = sc.nextLine();
		
		String result = "";
		
		if("크루주패키지".equals(goods)) {
			result = "크루주패키지를 선택하셨습니다";
		} else if ("호텔패키지".equals(goods)) {
			result = "호텔패키지를 선택하셨습니다";
		} else if ("유럽패키지".equals(goods)) {
			result = "유럽패키지를 선택하셨습니다"; 	
		} else if ("동남아패키지".equals(goods)) {
			result = "동남아패키지 선택하셨습니다";
		} else {
			System.out.println("다시 선택해주세요");
			return;
		}
		
		System.out.println(result);
		
		System.out.println();
		System.out.print("결제를 진행하겠습니다. 홍길동님이 맞습니까?\n"
				+ "맞으시면 이름을 입력해주세요. : ");
		String name = sc.nextLine();
				
		
		// 1번 
		
		if(name.equals("홍길동")) {
			System.out.println("결제가 완료되었습니다.");
		} else {
			System.out.println("결제가 취소되었습니다.");
		}
		
		// 2번
		
		if(!name.equals("홍길동")) {
			System.out.println("결제가 취소되었습니다.");
		} else {
			System.out.println("결제가 완료되었습니다.");
		}

	}

}
