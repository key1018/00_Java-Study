package com.study.chap06_method.controller;

public class MethodTest1 {

	/*
	 * * 메소드
	 *   기능을 수행하기 위한 용도
	 *   => 한 번 메소드를 정의해두면(작성해두면)외부에서 해당 메소드를 호출하여 실행시킬 수 있다
	 *   
	 *   접근제한자 [예약어] 반환형 메소드명([매개변수, 매개변수,...])}
	 *   		수행내용;
	 *   		수행내용;
	 *   		[return 결과값;]
	 *   }
	 * 
	 */
	
	// 1. 매개변수 없고 반환값없는 메소드
	// 자료형이 void인 경우 : return을 사용할 수 없다
	
	public void method1() {
		System.out.println("매개변수와 반환값 둘 다 없습니다.");
	}	

	// 2. 매개변수 없고 반환값있는 메소드

	// String자료형
	public String methodString() {
		System.out.println("매개변수없고 반환값 있는 String자료형");
		return "멋쟁이가되자구!";
	}
	
	// int자료형
	public int methodInt() {
		System.out.println("매개변수없고 반환값 있는 int자료형");
		return 1232;
	}
	
	// double자료형
	public double methodDouble() {
			System.out.println("매개변수없고 반환값 있는 double자료형");
			return 1234.5;
	}
	
	// char자료형
	public char methodChar() {
		System.out.println("매개변수없고 반환값 있는 char자료형");
		return 'a';
	}
	
	// 3. 매개변수 있고 반환값 없는 메소드
	
	// String 자료형
	public void method2(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
	}
	
	// int 자료형
	public void method3(int num1, int num2) {
		System.out.println("매개변수 있고 반환값 없습니다");

		if (num1 > 0 && num2 > 0) {

			for (int i = 1; i <= num1; i++) {
				for (int j = 1; j <= num2; j++)
					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				System.out.println();
			}
		} else {
			System.out.println("양수값을 입력하세요");
		}
	}
	
	// int 자료형2
	public void method3_1(int num) {

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				if (i % 2 == 0) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		} else {
			System.out.print("양수를 입력해주세요.");
		}
	}
	
	
	// String, int 혼합 자료형
	public void method4(String str, int i) {
		System.out.println(str.charAt(i));
	}
	
	// 4. 매개변수 있고 반환값 있는 메소드

	// 자료형 : String 반환값 : int

	public String method5(int num) {
		String result2 = "";
		if (num > 0) {
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 0) {
					result2 =  "박"; 
				} else {
					result2 =  "수";
				}
				System.out.print(result2);
			}
		} 
		return result2; // 무조건 출력
	}

	// 자료형 : char 반환값 : String

	public char method6(String str) {
		char ch = ' ';
		if (str.equals("apple") || str.equals("cherry")) {
			ch = 'Y';
		} else {
			ch = 'N';
		}
		return ch;
	}
	
	// 자료형 : String 반환값 : char
	public String method7(char ch) {
		String str = "다시 입력해주세요";
		if ('a' <= ch && ch <= 'z') {
			str = "소문자";
		} else if ('A' <= ch && ch <= 'Z') {
			str = "대문자";
		}
		return str;
	}
}
