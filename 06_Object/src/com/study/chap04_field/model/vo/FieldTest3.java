package com.study.chap04_field.model.vo;

public class FieldTest3 {

	/*
	 * * 필드부
	 * 접근제한자 [예약어] 자료형 변수형;
	 * 
	 * * static = 공유의 개념
	 *  static이 붙은 것들은 프로그램이 실행됨과 동시에 메모리 상에 static영역에 올라간다
	 *  프로그램 실행과 동시에 메모리상에 올려놓고 여기저기서 가져다 쓰는 '공유의 개념'
	 */
	
	public static String sta = "static C_Field";
	
	// static : 공유의 개념
	// final : 상수의 개념 (값을 절대로 변경할 수 없다)
	
	// 상수 필드 : public static final 자료형 변수명
	public static final String STA_FIN = "static final";
	
	// STA_FIN = "static change";

	// * 메소드부
	// 접근제한자 [예약어] 반황형 메소드명([매개변수, ... ]) {}
	
}
