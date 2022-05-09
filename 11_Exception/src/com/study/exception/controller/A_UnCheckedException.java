package com.study.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;


public class A_UnCheckedException {
	
	/*
	 * RuntimeException
	 * - 프로그램 실행시 발생하는 예외들 (런타임에러)
	 * 
	 * - IndexOutOfBoundsException : 부적절한 인덱스 제시시 발생하는 예외
	 * - NullPointerException : 레퍼런스가 null로 초기화된 상태에서 어떤거에 접근할 때 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생하는 예외
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생하는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
	 * - ....
	 * 
	 * 	=> RuntimeException 관련된 예외들은 충분히 예측가능한 상황
	 * 		=> 조건문 if로 충분히 예외 발생하는것을 사전에 방지할 수 있음
	 * 
	 */
	
	// 클래스에 Scanner 생성하여 전체 메소드에 활용할 수 있도록 설정
	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		// ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		/*
		int result = num1 / num2;
		System.out.println("나누기 결과 : " + result);
		// num2가 0인 경우 ArithmeticException 예외 발생
		*/
		
		//문제해결1. if 조건문을 활용하여 예외 처리
		
		/*
		int result = 0; // num2 가 0인경우 출력
		if(num2 != 0) {
			result = num1 / num2;
		}
		System.out.println("나누기 결과 : " + result);
		*/
		
		//문제해결2. try ~ catch문을 활용하여 예외 처리구문을 작성하는 방법
		// * 예외처리 : 예외가 "발생했을때" 실행할 내용을 미리 작성해놓는 것
		
		/*
		 * try { // try안에있는 구문은 무조건 실행된다
		 * 		예외가 발생할 수 있는 구문;
		 * 	} catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생했을 경우 실행할 구문 미리 작성; ==> 생략가능
		 * 	}
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("나누기 결과 : " + result);
		} catch(ArithmeticException e) { // 매개변수명은 아무거나해도 상관없음
			System.out.println("정수2에 0이외의 숫자를 입력해주세요.");
			e.printStackTrace(); // 오류난 내역을 보고자할 때 실행
		}
		System.out.println("계산을 종료합니다.");
		
	}
	
	public void method2() {
		
		// NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생하는 예외
		// IndexOutOfBoundsException : 부적절한 인덱스 제시시 발생하는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		/*
		int[] arr = new int[size];
		
		// 입력한 배열의 크기가 음수인 경우 : NegativeArraySizeException 예외 발생
		
		System.out.println(arr[40]); 
		// 입력한 배열의 크기가 40이하인 경우 : ArrayIndexOutOfBoundsException 예외 발생
		*/
		
		// 문제해결1. if조건문 활용하여 예외처리
		/*
		if(size > 0) {
			int[] arr = new int[size];
			if(size > 40) {
				System.out.println(arr[40]); 
			}
		}
		System.out.println("프로그램을 종료합니다.");
		*/
		
		// 문제해결2. try ~ catch문을 활용하여 예외처리
		
		try {
			int[] arr = new int[size];
			System.out.println("40번 인덱스 값 : " + arr[40]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("41이상의 인덱스값을 입력하세요."); // 40을 입력할 경우 0~39까지밖에 인덱스가 실행됨
		} catch(NegativeArraySizeException e) { 
			System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
		} catch(InputMismatchException e ) { // java.util에 있는 예외클래스이므로 import필요
			System.out.println("숫자만 입력해주세요.");
			// int 자료형에 다른 자료형도 함께 입력했을 경우 발생 => ex) 10을 입력해야되는데 '10크기'라고 입력한 경우
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void method3() {
		
		/*
		try {
			int[] arr = new int[size];
			System.out.println("40번 인덱스 값 : " + arr[40]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("41이상의 인덱스값을 입력하세요."); // 40을 입력할 경우 0~39까지밖에 인덱스가 실행됨
		} catch(NegativeArraySizeException e) { 
			System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
		} catch(InputMismatchException e ) { // java.util에 있는 예외클래스이므로 import필요
			System.out.println("숫자만 입력해주세요.");
			// int 자료형에 다른 자료형도 함께 입력했을 경우 발생 => ex) 10을 입력해야되는데 '10크기'라고 입력한 경우
		}
		*/
		
		// 다중 클래스를 사용하는 것이 아닌 다형성을 적용하여 모든 자식예외클래스 발생시 '부모예외클래스로 처리'하기
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		} catch(RuntimeException e) {
			System.out.println("배열의 크기가 음수거나 100을 초과하지 못했거나 배열의 크기를 다른 자료형으로 잘못입력하셨습니다.");
			 // RuntimeException은 '부모예외클래스'로 자식예외클래스가 발생했을 경우 모든 것을 처리할 수 있다
			// 단, 어떠 예외가 발생했는지 정확하게 파악할 수 없기 때문에 에외사항을 정확하게 말하기 어렵다.
		}
		
	}
	
	
	
	
	public void method4() {
		
		// NullPointerException : 레퍼런스가 null로 초기화된 상황에서 어떤거에 접근할 때 발생되는 예외
		
//		String str = null;
//		System.out.println("str의 길이 : " + str.length()); 
		// NullPointerException 예외 발생
		

		// 해결방법. try~catch문 활용하기

		try {
			String str = null;
			System.out.println("문자열 길이 : " + str.length());
		} catch (NullPointerException e) {
			System.out.println("문자열의 값 : " + e.getMessage());
			System.out.println("null을 참조할 수 없습니다.");
		}
		System.out.println("프로그램을 종료합니다.");

	}
	
		/*
		 * RuntimeException관련 애들은 UncheckedException (예외 처리구문이 필수는 아님)
		 * if문(조건문) : 애초에 예외자제가 발생되기 전에 소스코드로 핸들링하는 거임 (예외처리구문x)
		 * try ~ catch문 : 예외가 "발생됐을 경우" 실행할 구문을 미리 작성해두는 것 (예외처리구문)
		 * 
		 * 예측가능한 상황은 try ~ catch문보다는
		 * if문(조건문)으로 조건검사로 해결하는게 권장사항임
		 */
}
