package com.study.chap02_override.run;

import com.study.chap02_override.model.vo.Bakery;

public class OverrideRun {

	public static void main(String[] args) {


		Bakery b1 = new Bakery("곰보빵", 1000, true);
		System.out.println(b1/*.toString*/); 
		// Object에 있는 toString()을 오버라이딩해서 재정의함을 통해 변수명만 작성해도됨
		
		Bakery b2 = new Bakery("소세지빵", 2500, false);
		Bakery b3 = new Bakery("케이크", 30000, false);
		
		System.out.println(b2);
		System.out.println(b3);
		
		// --------------------------------------------------------------
		// 중복객체로 판단돼서 중복 삭제됐으면 좋겠는 경우
		
		Bakery b4 = new Bakery("소세지빵", 2500, false);
		// b2랑 동일한 필드갑을 가진 b4객체 생성
		
		System.out.println("b2와 b4가 같은 빵인가요? " + (b2 == b4)); // 주소값비교
		// 레퍼런스를 비교할 때 "=="를 사용하는 것이 아닌 equals()를 사용
		
		System.out.println("b2와 b4가 같은 빵인가요? " + (b2.equals(b4)));
		System.out.println("b2와 b4가 같은 빵인가요? " + (b2.equals(b4))); // 오버라이딩 후
		// 오버라이딩 전 : Object클래스의 equals() 메소드 실행 => 두 주소값을 동등 비교해서 반환
		// 오버라이딩 후 : Book클래스의 equals() 메소드 실행 => 두 객체의 주소값 비교가 아닌 실제 필드값들이 다 같으면 true반환
		// 				==> b2와 b4의 각 '필드'를 비교하는 것이지 '주소값'은 서로 다르다
		
		// 동일 객체(중복 객체) : 실제 필드값들도 같고(equals메소드 호출시 true) 해쉬코드값도 같은 경우
		System.out.println("bk1의 해쉬코드 : " + b1.hashCode()); 
		System.out.println("bk2의 해쉬코드 : " + b3.hashCode()); 
		System.out.println("bk3의 해쉬코드 : " + b2.hashCode()); // b2와 b4는 각 필드값이 동일하다
		System.out.println("bk2의 해쉬코드 : " + b4.hashCode()); 
		// 주소값이 똑같아보이지만 '필드'를 통해서 만들어지 것이므로 엄연히 b1, b2, b3, b4의 각 "주소값은 다르다"!!!

		// 오버라이딩 전 : Object클래스의 hashCode() 메소드 실행 => 해당 객체의 실제 "주소값"을 10진수로 계산한 결과값 반환
		// 오버라디이 후 : Bakery클래스의 hashCode() 메소드 실행 => 해당 객체의 "필드값"을 가지고 10진수로 반환
		// equals와 hashCode는 항상 똑같이 움직인다
		
		
	}

}
