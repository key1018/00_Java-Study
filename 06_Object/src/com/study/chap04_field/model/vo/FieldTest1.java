package com.study.chap04_field.model.vo;

/*
 *  >> 변수 구분
 *  - 전역변수 : 클래스 영역에 선언한 변수 (즉, public class A_Field{}안에 선언한 변수)
 *  		==> 클래스 내에서 어디서든 전역으로 사용가능 
 *  - 지역변수 : 클래스 내에서 어떤 특정한 메소드 안에서 생선한 변수 (즉, public void method1(){}에 선언한 변수)
 *  		==> 선언된 해당 그 지역에서만 사용 가능  => 특정한 구역 : 제어문(if, for, while, ... ), 메소드{} 등등
 *  
 *  * 변수마다 메모리상에 할당되거나 사라지는 시점이 다르다
 *  
 *  1. 전역변수 
 *  - 멤버변수 == 인스턴스변수 == 필드
 *  	생성시점 : new 연산자를 통해 객체 생성시 메모리영역에 할당
 *  	소멸시점 : 생성된 객체가 소멸시 같이 소멸
 *  
 *  - 클래스변수 == static 변수
 *  	생성시점 : 프로그램이 실행과 동시에 무조건 메모리영역 중 static영역에 할당 => 굳이 객체생성을 하지 않아도 된다
 *  	소멸시점 : 프로그램이 종료될 때 소멸
 *  
 *  2. 지역변수
 *  	생성시점 : 지역변수가 속해있는 특정구역({})이 실행 시 메모리 영역에 할당
 *  	소멸시점 : 특정구역의 실행이 종료될 때 소멸  
 *  
 */

// 클래스 선언

public class FieldTest1 {
	
	// 전역변수 - 멤버변수(클래스 내에서 생성)
			private String test;
			// 접근제한자는 필수로 써야함!!!
		
			public void test2(int num) {
				// 매개변수 또한 지역변수의 한 종류이다 (즉, 메소드 내에서만 사용가능)

			int iNum; // 지역변수 => 지역변수는 선언할 때 접근제한자를 사용X

			System.out.println(test);
			// 멤버변수 == 인스턴스 변수 == 필드 호출
			// 전역변수는 초기화가 안되어있을 경우 JVM이 자동적으로 기본값으로 초기화시킴

			System.out.println(num);
			// 지역변수 : 매개변수 호출
			// 매개변수는 어떠한 값을 반드시 전달되어 올 것이기 때문에 초기화가 되어있다

			// System.out.println(iNum);
			// 지역변수 호출
			// 지역변수는 내가 초기화를 시키지않는 이상 초기화 자체가 안되어있다 ==> 내가 직접 초기화 시켜야함!!!

			iNum = 100; // 지역변수 초기화 진행

			System.out.println(iNum);

		}

	}
