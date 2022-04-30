package com.study.operator;

// 클래스명 : 산술연산
public class C_Arithmetic {

	/*
	 * * 산술연산자 (이항 연산자 == 두개의 값을 가지고 연산)
	 * 	+ - / * %
	 *  / * % 의 우선순위가  + - 보다 높다 
	 *  
	 */
	
	public void method() {

		int num1 = 15;
		int num2 = 2;

		System.out.println("num1 + num2 : " + (num1 + num2)); // 17
		System.out.println("num1 - num2 : " + (num1 - num2)); // 13
		System.out.println("num1 * num2 : " + (num1 * num2)); // 30
		System.out.println("num1 / num2 : " + (num1 / num2)); // 7 (몫)
		System.out.println("num1 % num2 : " + (num1 % num2)); // 1 (나머지)

	}

	public void method2() {

		// quiz 응용편

		int a = 17;
		int b = 5;
		int c = ++a - b;
		int d = a / b;
		int e = a % b;
		int f = b + d++;
		int g = (--f) + (e--);
		int h = 7;
		int i = a + ++b * (--c / d) % (h++ - e) / (g-- - f);

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);

	}

}
