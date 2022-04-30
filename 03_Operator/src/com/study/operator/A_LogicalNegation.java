package com.study.operator;

// 클래스명 : 논리부정형
public class A_LogicalNegation {

	public void method1() {

		/*
		 * 논리부정형 논리를 부정할 때 쓰는 기호 : ! 
		 * => 논리값 (true / false)를 바꿔주는 연산자 => 결과값 마저도 논리값이다
		 * 
		 * ex) !true => false로 변환 !false => true로 변환
		 */

		System.out.println("true의 반대 : " + !true);

		System.out.println("false의 반대 : " + !false);

		// 단, 연산자 !가 뒤에 오는 것은 불가능하다
		// => true! or false!는 불가능

		boolean bool1 = true;
		System.out.println("bool1의 반대 : " + !bool1);

		boolean bool2 = !bool1; // bool1 = true => false로 출력
		System.out.println("bool2의 값 : " + bool2);

		boolean bool3 = (7 > 3); // true
		boolean bool4 = !(7 > 3);
		// !(7 < 3) => !(true) => false로 출력
		// ex: !(7 < 3) => !(false) => true로 출력

		System.out.println("bool3의 값 : " + bool3);
		System.out.println("bool4의 값 : " + bool4);
	}

}
