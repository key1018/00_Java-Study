package com.study.operator;

import java.util.Scanner;

// 논리연산자
public class E_Logical {
	
public void method1() { 
		
		/*
		 * 논리연산자 (이항연산자)
		 * 두 개의 논리값을 연산해주는 연산자
		 * 
		 * 논리값 && (AND) : 두 개의 논리값이 모두 true여야 최종 결과값 true가 출력
		 * ==> 둘 중 한개라도 false면 최종 결과값 false가 출력
		 * 또한, 첫 번째 논리값이 false가 나오면 두 번째 논리값은 실행 x
		 * 뜻 : ~이고, 뿐만아니라, ~이면서, 그리고
		 * 
		 * ex) true && true == true
		 * 	   true && false == false
		 * 	   false && true(죽은코드 : 실행 x ) == false
		 *     false && false(죽은코드 : 실행 x ) == false
		 * 
		 * 논리값 || (OR) : 두 개의 논리값 중 한개라도 true면 최종 결과값 true가 출력
		 * ==> 단, 둘 다 false면 최종 결과값 false가 출력
		 * 또한, 첫 번째 논리값이 true가 나오면 두 번째 논리값은 실행 x
		 * 뜻 : ~또는, ~이거나
		 * 
		 * ex) true || true(죽은코드 : 실행 x ) == true
		 *     true || false(죽은코드 : 실행 x ) == true
		 *     false || true == true
		 *     false || false == false
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result = (1 <= num1) && (num1 <= 100);
		boolean result2 = (50 <= num2) && (num2 <= 100);
		boolean result3 = (50 <= num2) || (num2 <= 100);
		
		System.out.println("1 <= num1 <= 100이 맞나요? : " + result);
		// num1 = 61일 경우 1 <= 61 "그리고" 61 <= 100 둘 다 true이므로 결과값 : true
		System.out.println("50 <= num2 <= 100이 맞나요? : " + result2);
		// num2 = 49일 경우 50 >= 49 "그리고" 49 <= 100 둘 중 한개가 false이므로 결과값 : false
		System.out.println("50 <= num2 또는 num2 <= 100이 맞나요? : " + result3);
		//  num2 = 49일 경우 50 >= 49 "또는" 49 <= 100 둘 중 한개가 true이므로 결과값 : true
				
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자(소문자)를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("영문자(대문자)를 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		
		System.out.print("한글문자를 입력하세요 : ");
		char ch3 = sc.nextLine().charAt(0);
		
		boolean result = ('a' <= ch) && (ch <= 'z');
		boolean result2 = ('A' <= ch2) && (ch2 <= 'Z');
		boolean result3 = ('가' <= ch3) && (ch3 <= '하');
		
		System.out.println("result의 값이 영어 소문자인가요? : " + result);
		System.out.println("result의 값이 영어 대문자인가요? : " + result2);
		System.out.println("result의 값이 한글 문자인가요? : " + result3);
			
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("지원확정(Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'M') || (gender == 'm');
		boolean result2 = (gender == 'F') || (gender == 'f');
		boolean check = (ch == 'Y') || (ch == 'y');
		
		System.out.printf("지원자의 성함은 %s입니다.\n" + "지원자의 나이는 %d입니다.\n" 
		, name, age);
		
		System.out.println("지원자의 성별은 남자입니까 ? " + result);
		System.out.println("지원자의 성별은 여자입니까 ? " + result2);
		System.out.println("지원하시는 것이 맞습니까? " + check);
		
//		System.out.println("1번 4, 2번 5, 3번 12, 4번 18, 5번 26");
//		System.out.println("다음 중 짝수가 아닌 것은? : ");
//		int num = sc.nextInt();
//		
//		System.out.println();
		
		
	}
	
	public void method4() {
		
		// 죽은 코드 (Dead Code)확인하기
		
		int num = 15;
		
		// && 의 경우 첫 번째 조건이 false일 경우 두 번째 조건 실행 x
		boolean result = (10 > num) && (++num <20);
		//					false		실행 x   		
		
		
		System.out.println("result : " + result);
		System.out.println("num : " + num);
		// 첫 번째 조건이 false이기 때문에 두 번째 조건안에 있는 ++num이 실행되지 않았기 때문에 15로 출력
		
		boolean result2 = (10 < num) && (++num <20);
		//					true			true
			
		System.out.println("result2 : " + result2);
		System.out.println("num : " + num);
		// 첫 번째 조건이 true이기 때문에 두 번째 조건안에 있는 ++num이 실행돼서 16으로 출력
		
		int num2 = 12;
		
		// || 의 경우 첫 번째 조건이 true일 경우 두 번째 조건이 실행 x
		boolean result3 = (10 < num2) || (++num2 < 20);
		// 					true			 실행 x
		
		System.out.println("result3 : " + result3);
		System.out.println("num : " + num2);
		// 첫 번째 조건이 true로 나와서 두 번째 조건안에 있는 ++num2가 실행되기 않았기 때문에 12가 출력
		
		boolean result4 = (10 > num2) || (++num2 < 20);
		//					false			true
		
		System.out.println("result4 : " + result4);
		System.out.println("num : " + num2);
		// 첫 번째 조건이 false로 나와서 두 번째 조건안의 ++num2가 실행돼서 13이 출력
	
	}

}
