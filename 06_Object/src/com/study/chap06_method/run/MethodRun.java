package com.study.chap06_method.run;

import com.study.chap06_method.controller.MethodTest1;
import com.study.chap06_method.controller.OverloadingTest;

public class MethodRun {

	public static void main(String[] args) {

		MethodTest1 mt1 = new MethodTest1();

		// 매개변수 없고 반환값없는 메소드
//		mt1.method1();

		// 매개변수 없고 변환값있는 메소드
		//String
		//mt1.methodString(); // return값 출력x
		//System.out.println(mt1.methodString()); // return값 출력o
		
		// int
//		mt1.methodInt();
//		System.out.println(mt1.methodInt());
		
		//double
//		mt1.methodDouble();
//		System.out.println(mt1.methodDouble());
		
		//char
//		mt1.methodChar();
//		System.out.println(mt1.methodChar());
		
		// 매개변수 있고 반환값 없는 메소드
		
		//String
		//mt1.method2("Hello", "Java");
		
		//int
		//mt1.method3(4,4);		
		//mt1.method3_1(10);
		
		//String, int 혼합형
		//mt1.method4("strawberry",3);
		
		// 매개변수 있고 반환값 있는 메소드
		
		//String, int
		//mt1.method5(3);
		//System.out.println(mt1.method5(4));
		
		//char, String
		//System.out.println(mt1.method6("strawberry"));
		//System.out.println(mt1.method6("cherry"));
		
		//String, char		
		//String str = mt1.method7('b');
		//System.out.println(str);
		
		//System.out.println(mt1.method7('X'));
		
		//-------------MethodPractice2-----------------
		
		// static은 공유의 개념으로 객체생성없이 호출할 수 있다
		// 단, 어디에 위치해있는지 정확하게 써줘야 한다!!!
		
		// 1. 반환형, 매개변수 둘 다 없는 static메소드		
		
		//MethodTest2.method1();
		//MethodTest2.method2();
		
		// 2. 반환형 있고 매개변수 없는 static메소드

		//System.out.println(MethodTest2.method3());
		//System.out.println(MethodTest2.method4());
		
		// 3. 반환형 없고 매개변수 있는 static 메소드
		
		//MethodTest2.method5("김홍자");
		//MethodTest2.method6(12);
		
		// 4. 반환형, 매개변수 둘 다 있는 static 메소드
		
		//int 
		//String str = MethodTest2.method7(13,4);
		//System.out.println(str);
		
		//System.out.println(MethodTest2.method7(6,-6));
		//System.out.println(MethodTest2.method7(8,10));
		
		// String, int
		//char ch = MethodTest2.method8("willow", 1);
		//System.out.println(ch);
		
		//System.out.println(MethodTest2.method8("Taylor", 2));
		
		// -------------OverloadingPractice-----------------

		OverloadingTest op = new OverloadingTest();

		op.test();
		op.test("Hello");
		op.test(10);
		op.test(12, 20);
		op.test('a');
		op.test("안녕", 'ㅋ');

	}

}
