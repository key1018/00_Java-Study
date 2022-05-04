package com.study.chap02_string.controller;

public class A_StringPoolTest {
	
	// String 같은 경우는 Object에서 이미 오버라이딩 되어있음
	
	public void method1() {
	
	// 1. 생성자를 통한 문자열 생성
	String str1 = new String("Hello");
	String str2 = new String("Hello");
	// 서로의 주소값은 다르다
	
	// str1, str2만 출력할 경우 주소값이 반영되어야되는데 출력문이 출력됨
	// => String클래스에 toString이 이미 오버라이딩 되어있음 (실제 담긴 문자열을 반환하도록)
	System.out.println(str1);
	System.out.println(str2);
	
	
	// str1과 str2비교하기
	System.out.println("주소값 비교 : " + (str1 == str2)); // false : 주소값이 서로 다르다
	System.out.println("문자열 비교 : " + (str1.equals(str2))); // true : 문자열이 서로 같다
	// String의 equals또한 이미 오버라이딩 되어있음
	// => 주소값이 아닌 담겨져있는 문자열을 비교하여 같으면 true 아니면 false값을 반환하도록
	// 오버라이딩 전 : 주소값으로 비교
	// 오버라이딩 후 : 문자열로 비교
	
	// str1과 str2의 주소값 반환하기
	System.out.println("str1의 문자열 주소값 : " + str1.hashCode());
	System.out.println("str2의 문자열 주소값 : " + str2.hashCode()); // str1과 str2의 문자열주소값은 동일하다
	// String의 hashCode 또한 오버라이딩 되어있음
	// => 주소값이 아닌 실제 담겨있는 문자열을 바탕으로 주소값을 형성하도록
	
	// str1과 str2의 진짜 주소값을 반환
	// System.indentityHashCode(레퍼런스);
	System.out.println("str1의 진짜 주소값 : " + System.identityHashCode(str1));
	System.out.println("str2의 진짜 주소값 : " + System.identityHashCode(str2));
	// str1과 str2의 진짜 주소값은 서로 다르다
	
	// **** 08_Inheritance의 chap02_override를 참조 ****

	}
	
	public void method2() {
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		// 리터럴로 제시시 StringPool(상수풀)영역에 할당
		// StringPool의 특징 : 동일한 문자열을 가질 수 없음
		// => 기존의 중복된 문자열이 있으면 기존에 가지고있는 문자열의 '주소값을 참조'하도록함
		//	  즉, 같은 문자열이면 변수가 다르더라도 '주소값이 서로 동일'하다!!
		
		System.out.println(str1);
		System.out.println(str2);
		
		// str1과 str2의 주소값 비교
		System.out.println("주소값 비교 : " + (str1 == str2)); // true
		// 중복된 문자열이기때문에 같은 주소값을 참조하고있음
		System.out.println("문자열 비교 : " + str1.equals(str2)); // true
		
		// str1과 str2의 진짜 주소값 출력
		String str = new String("안녕하세요");
		System.out.println("str의 주소값 : " + System.identityHashCode(str)); // 주소값 다름
		System.out.println("str1의 주소값 : " + System.identityHashCode(str1)); // 주소값 동일
		System.out.println("str2의 주소값 : " + System.identityHashCode(str2)); // 주소값 동일
		// str의 경우 상수풀에 담기는 것이 아닌 Heap영역에 메모리로 담겨서 개인의 주소값을 가지게됨
		
		
		// str2의 문자값을 변경
//		str2 = "반갑습니다";
//		System.out.println("변경된 str2의 주소값 : " + System.identityHashCode(str2)); // 주소값 변경
		
		str2 += "~";
		System.out.println(str2); // "안녕하세요~"
		System.out.println("변경된 str2의 주소값 : " + System.identityHashCode(str2));
		// 주소값 변경 => 새로운값 참조
		
		/*
		 * * String 클래스 == 불변클래스
		 * 	변경이 가능하나 그 자리에서 수정되는 개념이 아님
		 * 	변경하는 순간 기존의 문자열 자리에서 변경되는 것이 아닌
		 * 	새로운 곳을 참조하도록 하게됨 (새로운 주소값 부여받음)
		 * 	=> 문자열이 변경되면 기존의 문자열은 아무것도 참조하지않는 코드가돼서 GC에 의해서 삭제처리됨
		 * 
		 *  빈번하게 값을 변경할 경우 GC가 계속 기존의 값들을 지워줘야하는 단점이 있다
		 *  변경이 적고 한 번 값을 담아둔 후에 단지 조회할 경우 String클래스가 용이
		 */

	}

	public void method3() {
		
		/*
		 * * StringBuilder, StringBuffer == 가변클래스 (그 자리에서 값이 변경되는 개념)
		 * - 두 개의 크래스 모두 생성자나 제공하고있는 메소드는 동일함
		 * - 유일한 차이점 : 동기화가 되냐 안되냐의 차이 => 속도차이
		 * 
		 * > StringBuilder : 동기화 제공 X
		 * > StringBuffer : 동기화 제공 O
		 * 
		 * * 동기화 : 한 자원(데이터)에 대해 여러 스레드(일의 단위)가 접근하려 할 때 한 시점에서 하나의 스레드만 사용할 수 있도록 하는 것
		 * 
		 *  멀티스레드환경 (여러개의 일 처리를 병행해서 동시다발적으로 수행하는 환경) => 동기화처리를해야 안전하게 업무를 수행할 수 있다 => StringBuffer 권장
		 *  단일스레드환경 (한 번에 하나의 일만 처리하는 환경) => 동기화 작업을 하게되면 속도 저하가 발생 됨 => StringBuilder 권장
		 */
		
		// 1. 기본생성자로 생성
		StringBuilder stb = new StringBuilder(); // 기본생성자일 때 수용할 수 있는 문자 개수의 기본값 : 16개
		System.out.println("stb의 수용량 : " + stb.capacity());
		System.out.println("stb의 문자열의 길이 : " + stb.length());
		
		// 2. 정수값 하나 전달가능한 매개변수 생성자로 생성
		StringBuilder stb2 = new StringBuilder(100); // 수용량을 직접 지정 => 100개의 문자까지 수용가능
		System.out.println("stb2의 수용량 : " + stb2.capacity());
		System.out.println("stb2의 문자열의 길이 : " + stb2.length());
		
		// 3. 문자열하나 전달가능한 매개변수 생성자로 생성
		StringBuilder stb3 = new StringBuilder("반갑습니다!!!");
		System.out.println("stb3의 수용량 : " + stb3.capacity()); // 기본수용량(16) + 문자열의길이(8) = 24
		System.out.println("stb3의 문자열의 길이 : " + stb3.length());

		StringBuilder stb4 = new StringBuilder("반갑습니다!!!");
		System.out.println("stb3의 주소값 : " + System.identityHashCode(stb3));
		System.out.println("stb4의 주소값 : " + System.identityHashCode(stb4));
		System.out.println(stb3 == stb4);
		// 리터럴값으로 생성된 것이 아닌 Heap메모리 영역에 각자의 주소값으로 생성 => 주소값이 서로 다르다
		
		
	}
	
	public void method4() {
		
		// 가변클래스가 맞는지 확인 => 주소값 변경 x
		
		StringBuilder stb = new StringBuilder("반갑습니다!!!");
		System.out.println("stb : " + stb);
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb));
		System.out.println("stb의 수용량 : " + stb.capacity()); // 기본수용량(16) + 문자열의길이(8) = 24
		System.out.println("stb 문자열의 길이 : " + stb.length());
		
		System.out.println("=============================");
		
		// StringBuilder로 문자열을 변경하고자 할 때는 메소드를 통해서 작업
		
		// 1. append(String str) : StringBuilder
		//	 기존의 문자열에 새로운 문자열 추가하고 싶을 때
		
//		stb = "안녕하세요"; // 불가능
		stb.append(" 만나서 기뻐요");
		System.out.println("stb : " + stb);
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb)); // 주소값 동일
		System.out.println("stb의 수용량 : " + stb.capacity()); // 기본수용량(16) + 문자열의길이(8) = 24
		System.out.println("stb 문자열의 길이 : " + stb.length());
		
		System.out.println("=======================");
		stb.append(" 배고파요 밥주세요");
		System.out.println("stb : " + stb);
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb)); // 주소값 동일
		System.out.println("stb의 수용량 : " + stb.capacity()); // 수용량이 50으로 늘어남
		// 기존 수용량(24) * 2 + 2 = 50글자
		// 50글자를 초과한 경우 : 기존 수용량(50) * 2 + 2 = 102글자
		System.out.println("stb 문자열의 길이 : " + stb.length()); // 26
		
		
		System.out.println("=======================");
		// 2. delete (int start, int end) : StringBuilder
		// 문자열 삭제하기 	start <=	< end
		stb.delete(2, 9);
		System.out.println("stb : " + stb); // 인덱스 2 ~ 끝인 9 바로 직전인 8까지 삭제
		// "습니다!!! " 부분 삭제
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb)); 
		System.out.println("stb의 수용량 : " + stb.capacity()); 
		System.out.println("stb 문자열의 길이 : " + stb.length()); 
		
		
		System.out.println("=======================");
		// 3. insert(int offset, String str) : StringBuilder
		// 추가하고자하는 인덱스 위치 자리에 추가하고자하는 문자열 넣기
		stb.insert(3, "졸려"); 
		System.out.println("stb : " + stb); // 인덱스 3자리에 바로 추가하고자하는 문자열 추가
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb)); 
		System.out.println("stb의 수용량 : " + stb.capacity()); 
		System.out.println("stb 문자열의 길이 : " + stb.length()); 
		
		
		System.out.println("=======================");
		// 4. reverse() : StringBuilder
		// 기존의 문자열을 거꾸로 출력
		stb.reverse();
		System.out.println("stb : " + stb); 
		// 기존 : "반갑만졸려나서 기뻐요 배고파요 밥주세요" => reverse후 : "요세주밥 요파고배 요뻐기 서나려졸만갑반"
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb)); 
		System.out.println("stb의 수용량 : " + stb.capacity()); 
		System.out.println("stb 문자열의 길이 : " + stb.length()); 

		
		System.out.println("=======================");
		// 메소드체이닝 == 메소드들을 연속으로 호출 가능
		stb.reverse().append("메롱").delete(0,4).insert(2, "바보양");
		System.out.println("stb : " + stb); 
		System.out.println("stb의 주소값 : " + System.identityHashCode(stb)); 
		System.out.println("stb의 수용량 : " + stb.capacity()); 
		System.out.println("stb 문자열의 길이 : " + stb.length()); 

	}

}
