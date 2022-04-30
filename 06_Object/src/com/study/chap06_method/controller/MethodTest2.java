package com.study.chap06_method.controller;

public class MethodTest2 {
	
	// static 예약어를 활용하여 메소드 실행
	/*
	 * *메소드
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수, 매개변수, ... ]){
	 * 		수행내용;
	 * 		return;
	 * }
	 */
	
	// 1. 반환형, 매개변수 둘 다 없는 static메소드
	public static void method1() {
		System.out.println("반환형, 매개변수 둘 다 없는 static메소드");
		// return "안녕"; => 반환형이 없으므로 return사용 불가능
	}
	
	public static void method2() {
		int random = (int)(Math.random() * 50 + 1);
		int sum = 0;
		for(int i = 0; i <= random; i++) {
			sum += i;
		}
		System.out.printf("0~%d사이의 총 합계 : %d", random,sum);
	}
	
	// 2. 반환형 있고 매개변수 없는 static메소드
	
	// String
	public static String method3() {
		int random = (int)(Math.random() * 50 + 1);
		int sum = 0;
		for(int i = 0; i <= random; i++) {
			sum += i;
		}
		return "0~50 중 랜덤값의 총 합계 : " + sum;
	}
		
	// int
	public static int method4() {
		int random = (int)(Math.random() * 100 + 1);
		return random;
	}
	
	// 3. 반환형 없고 매개변수 있는 static 메소드
	
	// String
	public static void method5(String name) {
		System.out.println("만나서 반습니다");
		System.out.println(name + "님의 방은 101호 입니다.");
	}
	
	// int
	public static void method6(int num){
		
		if(num > 0) {
			if(num  % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수값을 입력해주세요.");
		}
	}
	
	// 4. 반환형, 매개변수 둘 다 있는 static 메소드
	
	// int 
	public static String method7(int num1, int num2) {

		String str = "양수를 입력해주세요";
		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				str = "num1의 값이 더 크다";
			} else {
				str = "num2의 값이 더 크다";
			}
		}
		return str;
	}
	
	// String, int
	public static char method8(String str, int index) {
		return str.charAt(index);
	}

}
