package com.study.chap04_field.model.vo;

public class FieldTest2 {
	
	/*
	 * * 접근제한자 4종류 (전역변수 쓸 떄 반드시 써야함)
	 * 
	 * 1. ( + ) public => 같은 패키지, 다른 패키지 어디서든 모두 접근 가능
	 * 2. ( # ) protected => 같은 패키지 접근 가능, 다른 패키지는 상속구조에서만 접근 가능
	 * 3. (생략) default => 같은 패지키에서'만' 접근 가능, 다른 패키지 접근 아예 불가능
	 * 4. ( - ) private => 같은, 다른 패키지 모두 접근 불가능, only 같은 클래스에서만 접근가능 
	 */
	
	// 1. ( + ) public
	public String pub = "public 접근";
	
	// 2. ( # ) protected
	protected String pro = "protected 접근";
	
	// 3. (생략) default
	/*default*/ String def = "default 접근";
	
	// 4. ( - ) private
	private String pri = "private 접근";

	public void method1() {

		System.out.println(pri);

	}

	public static String sta = "static B_Field";

}
