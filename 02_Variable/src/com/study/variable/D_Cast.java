package com.study.variable;

//패캐지 뜻 : cast = 형변환
public class D_Cast {
	
public void castTest1 () {
		
		/*
		 * *형변환 : 자료의 값을 바꾸는 것
		 * 
		 * 대입 연산자(=)를 기준으로 같은 자료형에 해당하는 값만 연산이 가능하다
		 * ==> 연산 결과 또한 같은 자료형으로 나온다
		 * ==> 다른 자료형의 값을 연산하고 싶으면 형변환이 필수
		 * 
		 * *형변환의 종류 : 자동형변환, 강제형변환
		 * 
		 * 1. 자동형변환
		 * => 자동으로 형변환이 되기 때문에 개발자가 스스로 형변환을 시킬 필요가 없다.
		 * 2. 강제형변환
		 * => 자동으로 형변환이 안되기 때문에 개발자가 스스로 형변환을 시켜줘야 한다.
		 * 
		 * **주의사항**
		 * 
		 * ==> boolean은 형변환이 불가능하다
		 */
		
		/*
		 * * 자동형변환
		 * 자동형변환 : 자료형이 다른 두 값의 연산 (대입 계산)시 자동으로 형변환되는 것
		 * byte가 작은 것 -> 큰 것으로 자동형변환이 가능하다
		 * 
		 * ==> 큰 박스에 작은 박스를 넣을 수 있지만 작은 박스에 큰 박스를 넣을 수 없기때문에
		 * 작은 것 -> 큰 것으로만 자동형변환이 가능하다
		 */
		
		
		// 1. int -> double
		
		int i = 10; // 4byte
		double d = 21.5; // 8byte
				
		System.out.println(i + d);	// int(4byte) -> double(8byte)로 자동형변환
		
		int i2 = 12;
		double d2 = i2;
		
		System.out.println(d2);
		
		// 2. int -> long
		
		int i3 = 10000; // 4byte
		long l3 = i3; // 8byte
		
		System.out.println(l3);
		
		// 3. float -> double
		
		float f = 3.14f; // 4byte
		double d3 = f; // 8byte
		
		System.out.println(d3);
		
		//====== 특이케이스 =======
		// 4. long -> float 
		// 큰 것 -> 작은 것으로 변형되는 특이케이스
		// ==> float이 실수형이기 때문에 long형보다 표현 가능한 수의 범위가 더 크다
		
		long l4 = 1234567; // 8byte
		float f2 = l4; // 4byte

		System.out.println(f2);
		
		long l5 = 12345678;
		double d4 = l5;
		
		System.out.println(d4);
		
		// 5. char (2byte) <-> int (4byte)
		// char과 int는 서로 자동변환이 가능하다
		// '아스키코드'에 의해 문자에 숫자가 적용되어 있어 자동으로 변환이 가능하다
		
		char ch = 'A';
		int i5 = ch;
		
		System.out.println(i5);
		
		char ch2 = '꽉';
		int i6 = ch2;
		
		System.out.println(i6);
		
		// 6. byte 또는 short 간의 연산
		
		byte b1 = 11; // 
		byte b2 = 20;
		
		// byte b3 = b1 + b2; // 오류발생
		// 에러발생 => byte나 short는 연산시 무조건 int형으로 취급
		//			연산 결과가 범위가 더 큰 int형임 => byte형에 대입 불가
		// int(4byte)를 작은 상자인 byte(1byte)에 넣을 수 없기 때문에 불가능하다
		
		byte b3 = (byte)(b1 + b2); // '강제형변환'을 통해 대입이 가능해진다
		
		System.out.println(b3);
	
	}
	
	public void castTest2 () {
		
		// 강제형변환
		
		/*
		 * * 강제형변환
		 * 큰 것 -> 작은 것으로 강제적으로 형변환을 시키는 것
		 * 큰 상자에 작은 상자를 넣을 수 없으니 구겨서라도 넣게 만드는 것이 강제형변환이다
		 */
		
		// 1. double (8byte) -> float (4byte) : 강제형변환 필요
		
		double d = 3.14; 
		// float f = d; // 에러발생
		float f = (float)d; 
		
		System.out.println("f : " + f);
		
		// 2. double (8byte) -> int (4byte) : 강제형변환 필요
		
		int iNum = 10;
		double dNum = 23.56;
		// int i = d2; // 에러발생
		int i = (int)dNum; // (int)(23.56) => 소수점 아래를 버린다 => 23 출력
		// double 값을 int로 강제 형변형 => 소수점 밑의 숫자 버려짐
				
		System.out.println("i : " + i); 
		
		// int iSum = iNum + dNum; // 에러발생
		// => iNum + dNum의 값은 133.56으로 double값이어서 에러가 난다
		
		// 해결 방법 1. 연산 결과를 int로 강제형변환하기
		int iSum = (int)(iNum + dNum);  // (int)(23.56) => 소수점 아래를 버린다 => 23 출력
		System.out.println("iSum : " + iSum);
				
		
		// 해결 방법 2. double형 값을 int값으로 변환한 후에 연산 대입하기
		// 2_1
		int iSum2 = iNum + (int)dNum; // (int)(23.56) => 소수점 아래를 버린다 => 23 출력
		System.out.println("iSum2 : " + iSum2);
		
		//2_2
		int iNum2 = (int)dNum; // (int)(23.56) => 소수점 아래를 버린다 => 23 출력
		int iSum3 = iNum + iNum2;
		System.out.println("iSum3 : " + iSum3);
		
		// 실수값을 정수형으로 강제형변환시 소수점 아래 부분은 버려짐 (* 데이터손실이 발생할 수 있다)
		// -> 값이 불명확할 수 있다
		
		// 해결 방법 3. 연산결과를 처음부터 double형 변수에 대입한다
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		// 3. String -> int
		
		// 3_1. int(charAt)으로 바꾸기
		
		String str  = "91283";
		
		int change = (int)str.charAt(2) - '0';
		
		String str2 = "951018";
		
		int change2 = (int)str2.charAt(0) - '0';
		
		// 문자열에서 정수로 바꿀 때의 표현법 : int 변수 = (int)스트링.charAt(0) - '0';
		// charAt(0)은 문자열을 문자로 바꿔주기 때문에 문자의 형식을 나타내는 '0'을 빼주어야 정수가 된다
		
		System.out.println("str : " + str);
		System.out.println("change : " + change);
		
		System.out.println("str2 : " + str2);
		System.out.println("change2 : " + change2);
		
		// 3_2. string전체를 int, double, float형으로 바꾸기 (Integer.parseInt())
		
		String str3 = "12345";
		
		int change3 = Integer.parseInt(str3);
		double do1 = Double.parseDouble(str3);
		float f1 = Float.parseFloat(str3);
		long l1 = Long.parseLong(str3);
		
		/*
		 *  [표현법] int의 경우 : int a = Integer.parseInt(str);
		 *  double의 경우 : double d = Double.parseDouble(str);
		 *  float의 경우 : float f = Float.parseFloat(str);
		 *  Long의 경우 : long l1 = Long.parseLong(str);
		 */
		
		System.out.println();
		System.out.println("str3 : " + str3);
		System.out.println("change3 : " + change3);
		System.out.println("do1 : " + do1);
		System.out.println("f1 : " + f1);
		System.out.println("l1 : " + l1);
		
				
		// 4. int, double, float, long -> String (Integer.toString())
		
		
		// 방법 1.
		// 문자열로 변환하는 것은 변수값 + "" 를 해주면 문자열이 형성된다
		
		int i1 = 123456;
		double do2 = 123.45;
		float f3 = 642.67f;
		long l2 = 2930901702750L;
		
		
		String s1 = i1 + "";
		String s2 = do2 + "";
		String s3 = f3 + "";
		String s4 = l2 + "";
		
		System.out.println();
		System.out.println("i1 : " + i1);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);

		
		// 방법 2. 
		/*
		 * int의 경우 : Integer.toString(str);
		 * double의 경우 : Double.toString(str);
		 * float의 경우 : Float.toString(str);
		 * Long의 경우 : Long.toString(str);
		 */
		
		int i2 = 238092;
		double do3 = 582.9885;
		float f4 = 85028.92f;
		long l3 = 703709840120283L;
		
		String s5 = Integer.toString(i2);
		String s6 = Double.toString(do3);
		String s7 = Float.toString(f4);
		String s8 = Long.toString(l3);
		
		System.out.println();
		System.out.println("s5 : " + s5);
		System.out.println("s6 : " + s6);
		System.out.println("s7 : " + s7);
		System.out.println("s8 : " + s8);

	}

}
