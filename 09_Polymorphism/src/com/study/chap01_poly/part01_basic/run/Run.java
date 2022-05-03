package com.study.chap01_poly.part01_basic.run;

import com.study.chap01_poly.part01_basic.model.vo.Child1;
import com.study.chap01_poly.part01_basic.model.vo.Child2;
import com.study.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {


		// "="를 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야함 => 다른경우 : 형변환을 해야한다
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다르는 경우");
		Parent p1 = new Parent();
		p1.printParent(); // 부모타입 레퍼런스로 부모타입 클래스에 접근 가능
//		p1.printChild1(); // 부모타입 레퍼런스로 부모타입 클래스에 접근 불가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식개체를 다르는 경우");
		Child1 c1 = new Child1();
		c1.printChild1(); // 자식타입 레퍼런스로 자식타입 클래스에 접근 가능 
		c1.printParent(); // 자식타입 레퍼런스로 부모타입 클래스에 접근 가능 => 상속관계
		// c1 레퍼런스로 Child1, Parent 둘 다 바로 접근 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다르는 경우(다형성)");
		Parent p2 = new Child1(); // 자료형이 서로 다름 => 자동형변환됨 왜? 자식객체가 부모객체로 품어지는거니까!
		p2.printParent();
		((Child1)p2).printChild1(); // 강제형변환 => 왜? 부모가 자식에게 의지해야하니까!
		// p2레퍼런스로 Parent에는 쉽게 접근가능하지만
		// Child1에 접근하고자한다면 강제형변환을 해야지 접근 가능!		
		
		// ==> 쉽게정의하자면 자식은 페륜아라고 생각하면됨
		// - 상속관계에서도 부모님꺼 == 내(자식)꺼, 내(자식)꺼 == 내(자식)꺼 이듯이 
		//	 다형성을 집이라고 가정할 때 : 부모님은 자식을 아무것도 필요없이 집에 들어오라고하지만 자식은 부모한테 집에들어오려면 형변환해서 들어오라고하면서 형변환이안되면 거부함
				
		// 상속구조에서는 클래스간의 형변환이 가능하다!
		/*
		 * 1. UpCasting (자식이 부모클래스로 형변환) ==> 부모는 이유없이 자식을 품는다....
		 *  자식 타입 => 부모 타입으로 형변환
		 *  자동형변환
		 *  ex) 자식.부모메소드(); ==> 자식이 부모한테 안기는 것으로 생각하면 편하다!
		 *  
		 * 2. DownCasting (부모가 자식클래스로 형변환) ==> 자식은 부모한테 품기위해 이것저것(형변환)해달라고 한다...
		 *	부모 타입 => 자식 타입으로 형변환
		 *	강제형변환
		 *	ex) ((자식)부모).자식메소드(); ==> 자식에게 부모가 안기기기위해 몸을 자식과 똑같은 크기로 만들었다고 생각하면 편하다!
		 */
		
		System.out.println("================================================");
		
		// * 다형성의 정의
		//	- 부모타입으로부터 파생된 여러 자식타입들의 자식 객체들을 부모 타입 하나로 다룰 수 있는 기술
		// 	ex) 부모가 자식들 호출한것
		
		// * 다형성을 쓰는 목적
		// 다형성을 배우기 전.......
		Child1[] arr = new Child1[2];
		arr[0] = new Child1("가", "나", "다");
		arr[1] = new Child1("마", "바", "사");
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2("아", "차", "타");
		arr2[1] = new Child2("파", "나", "자");
		// 자식클래스 하나하나 다 호출해야함
		// 더불어 오로지 각각의 Child1, Child2클래스에만 담을 수 있음
		
		
		
		// 다형성을 적용한 후...
		Parent[] arr3 = new Parent[4]; // 부모타입 레퍼런스(배열)로 자식객체를 다룸
		
		arr3[0] = new Child1("가", "나", "다");
		arr3[1] = new Child1("마", "바", "사");
		arr3[2] = new Child2("아", "차", "타");
		arr3[3] = new Child2("파", "나", "자");
		// 하나의 타입으로 여러 자식객체를 받아줄 수 있음(객체배열로 활용) => 편리하다, 코드길이 감소
		
		((Child1)arr3[0]).printChild1(); // 강제형변환
		// 부모타입 레퍼런스를 활용하여 자식클래스에 있는 메소드를 호출함
//		((Child2)arr3[1]).printChild2(); // Child1인데 Child2로 실행 => ClassCastException 오류 발생
		((Child1)arr3[1]).printChild1(); 
		((Child2)arr3[2]).printChild2();
		((Child2)arr3[3]).printChild2();
		arr3[2].printParent(); // 부모클래스에 있는 메소드도 호출가능
		
		System.out.println("\n===== 반복문 이용해서 출력 =====");
		
//		for(int i = 0; i < arr3.length; i++) {
//			if(i == 0 || i == 1) { // 어디 인덱스에 위치해있는지 아는 경우
//				((Child1)arr3[i]).printChild1();
//			} else {
//				((Child2)arr3[i]).printChild2();
//			}
//		}	
		
		
			// 어디 인덱스에 위치해있는지 모르는 경우
			// instanceof 연산자 : 현재 레퍼런스가 실직적으로 어떤 클래스타입을 참조하는지 확인할 때 사용
			// [표현법] 배열의변수[i] instanceof 찾고자하는자식클래스
			
		for(int i = 0; i < arr3.length; i++) {
			if(arr3[i] instanceof Child1) { // true 또는 false로 반환
				((Child1)arr3[i]).printChild1();
			} else {
				((Child2)arr3[i]).printChild2();
			}
		}
		
		System.out.println("===== 동적바인딩 =====");
		for(int i = 0; i < arr3.length; i++) {
			arr3[i].print();
		}
		// 동적바인딩 : 프로그램이 실행되기 전에는 컴파일되면서 정적바인딩(레퍼런스 타입의 메소드를 가리킴)됨
		//			단, 실직적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩 되어있다면
		//			프로그램이 실행시 동적으로 그 자식클래스에 오버라이딩된 메소드를 찾아서 실행
		
	}

}
