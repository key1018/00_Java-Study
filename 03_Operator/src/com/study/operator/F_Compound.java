package com.study.operator;

//클래스명 : 복합연산자
public class F_Compound {
	
	/*
	 * * 복합 대입 연산자
	 * 
	 * 종류 : +=  -=  *=  /=  %=
	 * 
	 * int 변수 += 3;
	 * ==> 변수에 3을 추가
	 * 
	 * ex) 변수 a 에 5씩 추가하고자 할 경우
	 * 
	 * int a += 5; (5 더하기)
	 * int a -= 5; (5 빼기)
	 * int a *= 5; (5 곱하기)
	 * int a /= 5; (a / 5 의 몫이 출력)
	 * int a %= 5; (a / 5 의 나머지가 출력)
	 */
	
	public void method() {

		int a = 15;

		System.out.println("최초의 a : " + a); // 15

		a += 10;

		System.out.println("a += 10의 값 : " + a); // 25

		a -= 2;

		System.out.println("a -= 5의 값 :" + a); // 23

		a /= 2;

		System.out.println("a /= 3의 값 : " + a); // 11

		a %= 5;

		System.out.println("a %= 5의 값 : " + a); // 1
	}

}
