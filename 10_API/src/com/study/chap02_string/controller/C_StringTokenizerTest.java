package com.study.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "김밥,떡볶이,순대,튀김,오뎅,훠궈";
		
		// 구분자를 기준으로해서 분자열을 분리시키는 방법
		
		// 방법 1. 분리된 문자열들을 String[] 배열에 담고자 할 때
		//		 String 클래스에서 제공하는 split 메소드 이용
		
		// 반환형 : String[]
		String[] arr = str.split(",");
		System.out.println("arr배열의 크기 : " + arr.length); 
		// arr[0] = 김밥 arr[1] = 떡볶이 ~ arr[5] = 훠궈
		
		
		// 기존 for문을 활용하여 출력
//		for(int i =0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 향상된 for문을 활용하여 출력
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		// 방법 2. 분리된 문자열들을 각각 토큰으로써 관리하고자 할 때 => 오로지 자바에서만 사용
		//		 java.util.StringTokenizer 클래스를 이용
		//		 StringTokenizer st = new StringTokenizer(분리하고자하는 문자열, 구분자);
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 : " + st.countTokens());
		// 배열의 크기 : xxx.length			StringTokenizer의 크기 : xxx.countTokens()
		
		/*
		System.out.println(st.nextToken()); // 김밥
		System.out.println(st.nextToken()); // 떡볶이
		System.out.println(st.nextToken()); // 순대
		System.out.println(st.nextToken()); // 튀김
		System.out.println(st.nextToken()); // 오뎅
		System.out.println(st.nextToken()); // 훠궈
		// 6개의 값을 모두 가지고옴
		*/
		
		
//		System.out.println(st.nextToken()); 
		// 분리된 문자열의 개수를 초과할경우 : NoSuchElementException 오류발생
		
		// nextToken은 문자를 가지고오면 아예 빼오는 것이기 때문에 문자열의 갯수를 초과하면 더이상 뺴내올 요소가 없다.

		// 토큰이 가지고 있는 문자열의 갯수가 불확실한 경우
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// 문자열 자체를 빼왔기때문에 최종적으로 남은 문자열의 갯수는 0이다
		System.out.println("최종적으로 남은 문자열의 갯수 : " + st.countTokens());
		
		
		// 배열과 Token의 차이점
		// 배열 : 인덱스에 있는 문자열을 호출했다고해서 문자열 자체가 빠지는 것이 아님 
		//		=> 같은 인덱스를 계속 호출할 수 있음
		// Token : 문자열을 호출하면 아예 빠져나와서 호출이 됨
		//		=> 문자열의 갯수를 초과해서 호출하면 더이상 뺴 올 수 있는 요소가 없기때문에 오류발생

	}

}
