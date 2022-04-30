package com.study.operator;

import java.util.Scanner;

// 클래스명 : 비교연산자
public class D_Comparison {

	/*
	 * 비교 연산자, 관계 연산자 (이항연산자)
	 * 두 개의 값을 비교하여 참/거짓을 판단하는 연산자
	 * 참일 경우 : true, 거짓일 경우 : false를 출력한다
	 * 
	 * 대소비교연산자 : >, <, <=, >=
	 * 동등비교연산자 : ==(true), !=(false)
	 */
	
	public void method() {
		
		int a = 10;
		int b = 13;
		
		System.out.println("a == b : " + (a == b)); // false
		System.out.println("a != b : " + (a != b)); // true
		System.out.println("a > b : " + (a > b)); // false 
		System.out.println("a < b : " + (a < b)); // true
		System.out.println("(a / 2) < (b % 10) : " + (a / 2 < b % 10)); 
		// 												5   <   3   : false
		System.out.println();
		System.out.println("a는 짝수인가? : " + (a % 2 == 0)); // true
		System.out.println("b는 홀수인가? : " + (b % 2 == 1)); // true
		System.out.println("b는 홀수인가? : " + (b % 2 != 0)); // true
		System.out.println("a x b는 짝수인가? : " + ((a * b) % 2 == 0)); // 값 : 130, true
		System.out.println("a x b는 홀수인가? : " + ((a * b) % 2 != 0)); // false
		System.out.println("a x b는 홀수인가? : " + ((a * b) % 2 == 1)); // false
		
		System.out.println();
		System.out.println("b / a는 홀수인가? : " + ((b / a) % 2 == 1)); // 몫 : 1, true
		System.out.println("b / a는 짝수인가? : " + ((b / a) % 2 == 0)); // false
		System.out.println("b % a는 짝수인가? : " + ((b % a) % 2 == 0)); // 나머지 : 3, false
		System.out.println("b % a는 홀수인가? : " + ((b % a) % 2 != 0)); // true
		System.out.println("b % a는 홀수인가? : " + ((b % a) % 2 == 1)); // true		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("안녕하세요. 반갑습니다!");		
		System.out.println("문제를 풀어보겠습니다.");
		System.out.print("첫 번째 정수가 짝수가 되도록 입력해주세요 : ");
		int num1  = sc.nextInt();
		
		System.out.print("두 번째 정수가 홀수가 되도록 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력하신 첫 번째 정수가 짝수입니다? : "
				+ ( num1 % 2 == 0) );
		
		System.out.println("입력하신 두 번째 정수가 홀수입니다? : "
				+ ( num2 % 2 == 1) );
		
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("(num1 / num2) : " + (num1 / num2));
		System.out.println("(num1 / num2) >= 0 : " + ((num1 / num2) > 0));
		System.out.println("(num1 / num2) < 0 : " + ((num1 / num2) < 0 ));
		System.out.println("0 < (num1 * num2)  : " + (0 < (num1 * num2)));
		System.out.println("0 < (num1 % num2)  : " + (0 < (num1 % num2)));

		// 문자와 숫자간의 대소비교가 가능하다
		
		System.out.println("============================");
		System.out.println("num1 < a : " + (num1 < 'a'));
		System.out.println("num1 < A : " + (num1 < 'A'));
		System.out.println("num2 > A : " + (num2 > 'A'));
		System.out.println("num2 > m : " + (num2 > 'm'));
		System.out.println("a <= num1 <= z : " + ('a' <= num1 && num1 <= 'z'));
		System.out.println("A <= num2 <= Z : " + ('A' <= num1 && num1 <= 'Z'));

	}
}
