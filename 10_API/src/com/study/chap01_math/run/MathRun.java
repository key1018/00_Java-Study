package com.study.chap01_math.run;

// import java.lang.*; 가 생략외어있음

public class MathRun /* extends Objects */{

	public static void main(String[] args) {

		/*
		 * * java.lang.Math
		 * - 자바에 기본으로 생성되어있는 클래스
		 *   ==> import를 하지않고 호출할 수 있다
		 */
		
		// 상수필드 : 파이
		System.out.println("파이 : " + Math.PI); // 파이는 절대 값이 변하지 않는다
		
		// 절대값을 알고자 할 때 : abs 메소드
		int num = 10-20; // -10
		System.out.println("정수값 : " + Math.abs(num)); // 10
		double d = 12.3 - 24.6; // -12.3
		System.out.println(Math.abs(d)); // 12.3
		double d2 = 12.3 - 24.3; // -12
		System.out.println((int)Math.abs(d2)); // 12
		
		
		System.out.println("===== 올림 : ceil 메소드 =====");
		// 올림 : ceil메소드
		// 반올림이 아닌 무조건 일의자리가 올림처리됨
		double d3 = 13.4;
		System.out.println((int)Math.ceil(d3)); // 14
		double d4 = 12.001;
		System.out.println((int)Math.ceil(d4)); // 13
		double d5 = 123.00009;
		System.out.println((int)Math.ceil(d5)); // 124
		
		System.out.println("===== 버림 : floor메소드 =====");
		// 버림 : floor메소드
		// 소수점아래자리를 버림 (반올림X)
		double d6 = 12.9;
		System.out.println((int)Math.floor(d6)); // 12
		double d7 = 4.3002;
		System.out.println((int)Math.floor(d7)); // 4
		double d8 = -13.5;
		System.out.println((int)Math.floor(d8)); // -14
		
		System.out.println("===== 가장 가까운 수 알아내서 반환 : rint 메소드 =====");
		// 가장 가까운 수 알아내서 반환 : rint 메소드
		System.out.println((int)Math.rint(d6)); // 13
		System.out.println((int)Math.rint(d7)); // 4
		System.out.println(Math.rint(d8)); // -14
		
		System.out.println("===== 제곱근(루트) : sqrt 메소드 =====");
		// 제곱근(루트) : sqrt 메소드

		System.out.println("4의 루트값 : " + (int)Math.sqrt(4)); // 2
		System.out.println("9의 루트값 : " + (int)Math.sqrt(9)); // 3
		
		System.out.println("===== 제곱 : pow 메소드 =====");
		// 제곱 : pow 메소드
		// [표현법] : Math.pow(제곱하고자하는숫자, 제곱수);
		System.out.println("4의 4제곱 : " + Math.pow(4, 4));
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		// Math m = new Math(); // 객체 생성 불가능
		
		/*
		 * * Math특징
		 * - 모든 필드 상수필드, 모든 메소드 static메소드 (싹다 static)
		 * 	=> 프로그램 시작할 때 이미 static 메모리 영역에 올라가있다
		 *	=> 그렇기에 클래스명. 으로 바로 접근 가능
		 *	=> 굳이 객체 생성할 필요가없다!!! : 접근제한자가 private으로 되어있어서 생성불가능
		 *
		 * ** 한 번 메모리 영역에 올려두고 재사용하는 개념 : 싱글톤 패턴
		 */
		
		
		
		
	}

}
