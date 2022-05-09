package com.study.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * * CheckedException은 반드시 예외처리(try ~ catch / throws)를 해야하는 구문들
	 *  => 조건문 미리제시할 수 없음 (에측 불가한 곳에서 문제가 발생하기 때문에)
	 *  => 외부매체와 입출력이 일어날 때 발생됨 (IOException : InputOutputException)
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		// Scanner 개발 전 사용하던 입력받는 객체
		// BufferedReader의 경우 : 무조건 문자열로만 읽여들여짐
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 사용자에게 값 입력받기
		System.out.print("아무거나 입력해주세요 : ");
		
		// 1. try~catch문 활용하여 예외처리
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace(); 
		}
		System.out.println("입력을 종료합니다.");
		*/
		
		// 2. throws을 활용하여 예외처리
		// 지금 이자리에서 예외를 처리하지 않고 현재 이 메소드를 호출하는 곳으로 예외처리를 떠넘기는것
		// JVM이 처리하는 것 이기때문에 어떻게 처리하는지 알 수 없으므로 권장 X
		String str = br.readLine();
		System.out.println(str); // 메소드를 호출하는 곳 전체에 throws을 설정해야지 예외 처리 할 수 있음
	}

	/*
	 * 						예외클래스						예외발생시점					예외처리
	 * UnCheckedException : RuntimeException 관련		런타임에러(프로그램실행시)		세모(개발자가 케바케로 처리=> if조건문으로 애초에 예외가 발생안되도록/예외처리구문)
	 * 	 CheckedException : RuntimeException 외 관련  	  컴파일에러(빨간줄)			필수(조건문 기술 못함 => 예외처리구문(try~catch / throws)으로만 해결)
	 */
}
