package com.study.chap05_constructor.run;

import com.study.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		// 1. 기본객체자로 객체 생성한 후 setter메소드를 활용하여 값 대입

		User a = new User();

		a.setUserId("user01");
		a.setUserPwd("pass01");
		a.setUserName("홍길동");
		a.setAge(23);
		a.setGender('남');

		// 1_1. setter메소드를 통해 입력받은 값 호출
		System.out.println(a.information());

		// 2. 매개변수 3개짜리 생성자로 객체 생성

		User a1 = new User("user02", "pass02", "이말숙");
		System.out.println(a1.information());

		// 3. 매개변수 5개짜리 생성자로 객체 생성

		User a2 = new User("user03", "pass03", "박명자", 24, '여');
		System.out.println(a2.information());

		// setter메소드를 통해 변경
		// 객체 a2의 이름 변경 : 박명자 -> 박사랑

		a2.setUserName("박사랑");

		// getter메소드를 통해 변경된 값만 호출

		System.out.println("개명 후 이름 : " + a2.getUserName());

		// a2 전체값 부르기
		System.out.println(a2.information());
	}

}
