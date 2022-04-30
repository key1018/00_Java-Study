package com.study.variable;

public class A_Variable {

	// 변수는 데이터를 저장하는 그릇 
	
		public void variablePrinter1() {
			
			System.out.println("변수 사용 전");
			System.out.println(13300);
			System.out.println(13300 * 9);
			System.out.println(13300 * 9 * 5);
			System.out.println(13300 * 9 * 5 * 4);
			System.out.println(13300 * 9 * 5 * 4 * 0.1);
			variablePrinter2();
		}
		
		/* 변수를 사용하는 이유
		 * 1. 데이터의 의미를 파악하기 쉽다.
		 * 2. 유지보수가 쉽다 -> 값이 변경될 때 한 번만 바꿔주면 된다.
		 * 3. 값이 한 번 저장되면 변경되지 않는다.
		 */
			
			// int => 정수 , double => 상수
			// int 선언하는변수이름 = 값(정수);
			// double 선언하는변수이름 = 값(상수);
		
		public void variablePrinter2() {
			// 변수명은 소문자로 시작한다
			int pay = 10000; // 시급
			int hour = 9; // 일한 시간
			int day = 5; // 일주일 중 일한 날
			int week = 4; // 한달 중 일한 주
			int year = 12; // 일한 달
			double tax = 0.1; // 상수, 내야되는 세금
			
			// int pay의 값을 전체로 올라가서 바꾸는 것이 아닌 선언된 변수만을 사용하여 값을 변경할 수 있다.
			pay = 13000;
			
			System.out.println();
			System.out.println("변수 사용 후");
			System.out.println("내 시급은" + pay + "원"); // 시급
			System.out.println(pay * hour); // 일급
			System.out.println(pay * hour * day); // 주급
			System.out.println(pay * hour * day * week); // 월급(세전)
			System.out.println(pay * hour * day * week * tax); // 내야할 세금
			System.out.println((pay * hour * day * week)-(pay * hour * day * week * tax)); // 월급(세후)
			System.out.println("내 연봉은 " + (pay * hour * day * week * year)+ "원"); // 연봉

		}
		
		
		public void declareVariable() {
			
			/*
			 * 3. 변수의 "선언" (저장할 값을 기록하기 위한 변수를 메모리상에 확보하는 과정)
			 *  ==> 변수(박스)를 만들겠다!
			 *  [표현법] 자료형 변수명;
			 * 
			 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수의 크기 및 모양을 정하는 부분
			 * 변수명 : 변수의 이름 (박스의 이름) => 의미를 부여하는 것이 좋다! 
			 * ==> 지정한 이름으로 앞으로 호출하게 된다
			 * 
			 * 	*주의할 점 *
			 *  - 변수명의 시작은 소문자로
			 *  - 여러 단어로 엮어 있는 경우 낙타표기법 지키기 (ex : userName, userAge)
			 *  - 해당 영역 ({})에 선언한 변수는 해당 영역 안에서만 꺼내 쓸 수 있음 => 다른영역은 사용 불가능 ==> 지역변수 개념
			 *  - 해당 영역({})에 동일한 변수명으로 선언 불가
			 *  
			 *  > 변수의 "대입"
			 *   [표현법] 변수명 = 값;
			 *  
			 *  > 변수의 선언과 대입
			 *   [표현법] 자료형 변수명 = 값;
			 */
			
			
			// *자료형
			
			// 1. 논리형 (논리값 : true/false)
//			boolean bool; // 변수의 "선언"
//			bool = true; // 변수의 "대입"

			boolean bool = true; // 변수의 "선언과 대입"
			
			System.out.println(bool); // true
			System.out.println(!bool); // false
			
		}
	
}
