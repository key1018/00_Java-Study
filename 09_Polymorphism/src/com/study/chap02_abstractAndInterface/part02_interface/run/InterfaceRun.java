package com.study.chap02_abstractAndInterface.part02_interface.run;

import com.study.chap02_abstractAndInterface.part02_interface.model.vo.Baby;
import com.study.chap02_abstractAndInterface.part02_interface.model.vo.Basic;
import com.study.chap02_abstractAndInterface.part02_interface.model.vo.Mother;

public class InterfaceRun {

	public static void main(String[] args) {
		
		// Person에 추상메소드가 있는 경우-------------------------------------------
		
		// 부모 레퍼런스를 통해 자식 객체 생성가능
//		Person mom = new Mother("홍짜라", 53.5, 70, "출산");
//		Person baby = new Baby("홍애기", 3.2, 67);
//
//		System.out.println(mom);
//		System.out.println(baby);
//		
//		mom.eat(); // 몸무게-5 건강+7
//		baby.eat(); // 몸무게+3 건강+1
//		mom.sleep(); // 건강+20
//		baby.sleep(); // 건강+5
//		
//		System.out.println(mom);
//		System.out.println(baby);
		
		
		// 추상클래스 : 일반필드 + 일반메소드 [+ 추상메소드]
		// 인터페이스 : 상수필드 (public static final) + 추상메소드 => 완벽하게 미완성인 상태
		
		
		// 인터페이스를 통해 추상메소드를 오버라이딩하는 경우-------------------------------------
		
		// 인터페이스 레퍼런스를 통해 자식객체 생성가능
		// 레퍼런스 변수로는 사용가능 (단, 객체 생성 불가능)
		Basic mom = new Mother("홍짜라", 53.5, 70, "출산");
		Basic baby = new Baby("홍애기", 3.2, 67);
		
		mom.eat();
		mom.sleep();
		baby.eat();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		 * 클래스에서 클래스를 상속받을때 : 		클래스 extends 클래스 (단일상속만 가능 )					: 화살표 "실선"
		 * 클래스에서 인터페이스를 구현할 때 : 		클래스 implements 인터페이스, 인터페이스, ... (다중상속 가능) 	: 화살표 "점선"
		 * 인터페이스에스 인터페이스를 상속 : 		인터페이스 extends 인터페이스, 인터페이스, ... (다중상속 가능)	: 화살표 "실선"
		 * 
		 * 			|		추상클래스		 |		인터페이스
		 * ================================================================
		 * 상속 개수 	| 		단일 상속		 |		다중 상속
		 * ----------------------------------------------------------------
		 *  키워드		|		extends		 |		implements
		 * ----------------------------------------------------------------
		 * 추상메소드	|	추상메소드 0개 이상	 |	모든 메소드가 추상메소드 (일반메소드 불가능)
		 * 갯수/표현법	| 명시적으로 abstract기술 |	  묵시적으로 abstract (생략 가능)
		 * ----------------------------------------------------------------
		 * 일반메소드	|		 O			 |				X
		 * ----------------------------------------------------------------
		 * 필드		|	일반필드 기술 가능	 |	상수필드만 기술 가능 (묵시적으로 public static final)
		 * 
		 * 
		 * extends 일반클래스 --> extends 추상클래스  --> implements 인터페이스
		 * ---------------------------------------------------------->
		 * 			강제성이 더 짙어짐 (규약이 더 쎄짐) => 강제로 오버라이딩해야함
		 * 
		 */
		
}
}