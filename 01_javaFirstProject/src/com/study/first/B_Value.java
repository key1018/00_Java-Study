package com.study.first;

public class B_Value {
	
	public void printValue() {

		// 1. 숫자 출력
		System.out.println(123);
		System.out.println(123.456);
		System.out.println(1 + 2 + 3 + 4 + 5);

		// 2. 문자 출력 -> 홑따옴표 안에 하나의 단어만
		System.out.println('a');
		// System.out.println('abc'); -> 오류발생
		System.out.println('가');

		// 3. 문자열 출력 -> 쌍따옴표 안에 여러개의 단어 가능
		System.out.println("안녕하세요");
		System.out.println("만나서 반갑습니다!");
		System.out.println("Hi" + " Everyone!");
	}

}
