package com.study.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * * Wrapper 클래스
		 *  => 기본자료형을 객체로 포장해줄 수 있는 클래스
		 *  
		 *  기본자료형 <-> Wrapper클래스
		 *  boolean		 Boolean (boolean클래스를 Boolean객체로 변환)
		 *   char		Character
		 *   byte		  Byte
		 *   short		  Short
		 *   int 		 Integer
		 *   long		  Long
		 *   float		  Float
		 *   double		  Double
		 *   
		 * * 기본자료형을 객체로 취급해야되는 경우
		 *  - 메소드 호출해야될 때
		 *  - 메소드의 매개변수가 기본자료형이 아닌 객체타입만을 요구할 때
		 *  - 다형성을 적용시키고 싶을 때
		 *   
		 */
		
		
		// Boxing : 기본자료형 => Wrapper클래스 자료형
		// => 기본자료형을 객체로 '포장'한다
		
		int num1 = 15;
		int num2 = 23;
		
		// 1. 객체 생성을 통한 방법
		Integer i1 = new Integer(num1); // num1 => i1인 Integer 자료형으로 변환
		Integer i2 = new Integer(num2); // num2 => i2인 Integer 자료형으로 변환
		
		System.out.println(i1); // Wrapper클래스로 반환
		System.out.println(i2);
		
		System.out.println(i1.equals(i2)); // false : 실제 참조하고있는 숫자값(15,23)으로 비교
		System.out.println(i1.compareTo(i2)); // -1
		// i1와 i2를 비교했을 때 => 앞쪽(i1)이 더 크면 1반환, 값이 같으면 0반환, 뒤쪽(i2)가 더 크면 -1반환
		
		// 2. 객체 생성없이 곧바로 대입하는 방법 (AutoBoxing)
		Integer i3 = num1; // 기본자료형을 Integer자료형 변수에 바로 대입
		Integer i4 = num2;
		System.out.println(i3);
		System.out.println(i4);
		
		// -------------------------------------------------------------------------------
		
		
		// UnBoxing : Wrapper => 기본자료형으로 반환
		
		// 1. 해당 Wrapper클래스에 제공하는 xxxValue()메소드를 이용
		int num3 = i1.intValue(); // 기본자료형으로 반환
		int num4 = i2.intValue(); 
		
		System.out.println(num3);
		System.out.println(num4);
		
		// 2. 메소드를 사용하지않고 바로 대입하는 방법 (AutoUnBoxing)
		
		int num5 = i1;
		System.out.println(num5);
		
		System.out.println("================");
		
		// 기본자료형 <--> String
		
		String str = "가";
		String str1 = "10";
		String str2 = "12.3";
		
		System.out.println(str);
		System.out.println(str1 + str2); // 문자열끼리의 합
		
		// *****웹프로그래밍에서 제일 중요함*****
		// 웹프로그래밍에서 전달되는 값은 항상 '문자열'로 오기 때문에 자바에서 기본자료형으로 바꾸기 위해서는 parse를 하는 것이 중요하다!!
		
		// * String --> 기본자료형
		// "10" --> 10
		// "15.3" --> 15.3
		// 해당 Wrapper클래스.parseXXX();사용
		
		int num = Integer.parseInt(str1); // 숫자로 반환
		double d = Double.parseDouble(str2); // 숫자로 반환
		
		System.out.println(num + d); // 숫자끼리의 합
		
		//*****************************			
		
		// * 기본자료형 --> String
		// 		10  --> "10"
		//	   15.3 --> "15.3"
		// String.valueOf(); 사용
		
		String str3 = String.valueOf(num); // 문자열로 반환
		String str4 = String.valueOf(d);
		
		System.out.println(str3 + str4); // 문자열끼리의 합
		 
		
		
	}

}
