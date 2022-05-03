package com.study.chap02_abstractAndInterface.part01_abstract.run;

import com.study.chap02_abstractAndInterface.part01_abstract.model.vo.BasketBall;
import com.study.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.study.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class AbstractRun {

	public static void main(String[] args) {

		/*
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부 ({})가 구현되지않은 메소드
		 * - 자식클래스에서 해당 메소드를 오버라이딩해서 완성시켜줘야함
		 * 
		 * * 추상클래스
		 * - 미완성된 클래스
		 * - 객체 생성 불가(단, 레퍼런스 변수로는 선언 가능)
		 * - 일반필드 + 일반메소드 [+ 추상메소드]
		 *   => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		 *   
		 *  추상메소드없어도 추상클래스로 정의하는 경우 : 단순히 클래스가 미완성됐다고 판단될 때 선언할 수 있다
		 */
		
//		Sports s = new Sports(); // 추상클래스는 객체생성 불가능
		Sports s; // 레퍼런스 변수로는 선언 가능
		s = new FootBall(); // 다형성 적용은 가능
		
		Sports[] arr = new Sports[2]; // 배열 선언 가능
		arr[0] = new BasketBall(); // 부모타입으로 자식객체를 받아줄 수 있음
		arr[1] = new FootBall();
		
		//for반복문을 활용하여 출력
		// 방법 1 기본 for문
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule(); 
			// 부모객체에 있는 메소드를 오버라이딩을 함으로써 
			// 동적라이딩이 된 것이므로 형변환(DownCasting)을 안해도됨
		}
		
		// 방법 2 => instanceof를 활용하여 출력
		for(int i =0; i<arr.length; i++) {
			if(arr[i] instanceof BasketBall) {
				arr[i].rule();
			} else {
				arr[i].rule();
			}
		}
		
		// 방법 3 향상된for문을 활용하여 출력
		for(Sports sp : arr) {
			sp.rule();
		}
		
		/*
		 * * 추상클래스를 사용하는 이유
		 * - 부모클래스에 추상메소드(미완성된메소드)가 존재할 경우
		 * 	 자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게됨!
		 * 	 => 메소드 통일성 확보
		 *   => 표준화된 틀을 제공할 목적
		 */

	}

}
