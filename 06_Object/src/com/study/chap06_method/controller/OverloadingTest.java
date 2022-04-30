package com.study.chap06_method.controller;

public class OverloadingTest {
	
	/*
	 * 같은 클래스내에서 같은 메소드명 사용가능
	 * 
	 *  오버로딩을 적용시키고자 한다면 (즉, 한 클래스내에 동일한 이름의 메소드를 작성하고자 한다면)
	 *  매개변수명, 접근제한자, 반환형을 다 떠나서
	 *  매개변수의 자료형과 갯수, 순서가 다르게 작성되어있어햐된다 
	 */
	
	// "반환형이랑도 상관없음!!" 무조건 매개변수 자료형이 달라야함!!!
	// "접근제한자랑도 상관없음!!" 무조건 매개변수 자료형이 달라야함!!!
	
	
	// 자료형, 매개변수 없는 메소드
	public void test() {
		
	}
	
	// 매개변수 있는 메소드
	public void test(String str) {
		
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	//public void test(int c, int d) {
	//	==> 메개변수내 자료형의 종류, 개수가 모두 동일하므로 오버로딩 불가능
	//}
	
	public void test(char ch) {
		
	}
	
	public void test(String str, char ch) {
		
	}
	
	
	//========다음 중 오버로딩에 성림되는 것은?===========
	
	// 기준
	public void method1(int i) {
		
	}
	
	// 1번
	public void method1(String str) {
		
	} // 성립
	
	// 2번
	public void method1(int i, String str) {
		
	} // 성립
	
	// 3번
//  public void method1(int num) {
//	
//  } // 성립불가능

	// 4번
//	public char method1(int point) {
//		
//	} // 성립불가능
	
	// 5번
	public void method1(int i, int k) {
		
	} // 성립
	
	// 6번
//	public void method1(int num, String string) {
//		
//	} // 성립불가능
	
	// 7번
	public void method1(String str, int i) {
		
	} // 성립

}
