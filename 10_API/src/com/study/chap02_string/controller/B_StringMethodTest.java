package com.study.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		
		// 메소드명(매개변수) : 반환형
		
		// 1. charAt(int index) : char
		String str1 = "Hello java";
		System.out.println(str1.charAt(6)); // j 호출
		
		// 2. concat(String str) : String
		// 문자열과 전달된 또다른 문자열을 하나도 합쳐서 새로운 문자열로 return
		
		String str2 = str1 + "!!!";
		String str3 = str1.concat("!!!");
		
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		// 같은 문자열값이 반환됨
		
		System.out.println("str2와 str3의 주소값 비교 : " + (str2 == str3)); // false, 주소값이 다르다
		
		// 3. equals(Object obj) : boolean
		// 문자열과 전달된 또다른 문자열을 가지고 주소값 비교가 아닌 실제 문자열 값을 가지고 동등비교
		System.out.println("str2와 str3의 문자열 비교 : " + (str2.equals(str3))); // true, 오버라이딩
		
		
		// 4. contains(CharSequence s) : boolean
		// 문자열에 전달된 특정문자열이 포함되어있는지 아닌지 확인 => 키워드 확인
		// 포함되어있으면 true 아니면 false
		
		System.out.println("str1에 java라는 단어가 포함되어있습니까? " + str1.contains("java"));
		System.out.println("str1에 apple라는 단어가 포함되어있습니까? " + str1.contains("apple"));
		
		// 5. subString(int beginIndex) : String
		//	  subString(int beginIndex, endIndex) : String
		//					beginIndex <= 		< endIndex
		
		System.out.println(str1.substring(3)); // 시작인덱스인 3부터 끝까지 반환
		System.out.println(str1.substring(3,7)); // 시작인덱스인 3부터 끝인덱스 바로전(6)까지 반환
		
		// 6. replace(char oldChar, char newChar) : String
		// 문자열에서 oldChar을 대신하여 newChar을 삽입
		// 즉, 문자열에서 특정 문자를 찾아서 다른 문자로 교체
		
		System.out.println("a를 e로 교체하기 : " + (str1.replace('a', 'e'))); // Hello java => Hello jeve
		
		// 7. toUpperCase() : String 
		//	  해당 문자열을 다 대문자로 변경하여 새로운 문자열 리턴 => 원본훼손x
		//	  toLowerCase() : String
		//	  해당 문자열을 다 소문자로 변경하여 새로운 문자열 리턴 => 원본훼손x
		
		System.out.println("대문자로 반환 : " + str1.toUpperCase());
		System.out.println("소문자로 반환 : " + str1.toLowerCase());
		
		// 8. trim() : String
		// 문자열의 앞 뒤 공백을 지워서 반환
		
		String str4 = "   Hello Java   ";
		System.out.println("문자열의 앞 뒤 공백 지우기 : " + str4.trim());
		// 단점은 문자열 사이의 공백은 안사라짐
		// => 웹사이트 로그인 및 회원가입할 때 : 사용자가 실수로 비밀번호 앞이나 뒤에 공백을 넣었을 경우 많이 사용

		
		// 기존의 문자열 str1의 원본훼손은 발생되지 않음 => 메소드를 활용하여 새로운 문자열을 생성했기때문에
		System.out.println(str1); // Hello java으로 원본훼손 X
		
	}

}
