package com.study.chap01_poly.part02_electronic.run;

import com.study.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.study.chap01_poly.part02_electronic.model.vo.Desktop;
import com.study.chap01_poly.part02_electronic.model.vo.Electronic;
import com.study.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.study.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {
		
		/*
		// 1. 다형성이 적용안된 경우 (ElectronicShop1)----------------------------------
		ElectronicShop1 es = new ElectronicShop1();	
		
		// 납품하기
		
		es.insert(new Desktop("삼송", "짱장데스크탑", 1200000, "Geforce1080"));
		es.insert(new NoteBook("엘쥐" , "1키로보다가벼운노트북", 1800000, 4));
		es.insert(new Tablet("사과", "눈패드", 800000, true));
		
		// 조회하기
		
		// 방법 1
//		Desktop d = es.selectDesktop();
//		NoteBook n = es.selectNoteBook();
//		Tablet t = es.selectTablet();
//		
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
		
		// 방법 2		
		System.out.println(es.selectDesktop());
		System.out.println(es.selectNoteBook());
		System.out.println(es.selectTablet());
		*/
		
		
		// 2. 다형성이 적용된 경우 (ElectronicShop2)------------------------------------
		
		ElectronicShop2 es = new ElectronicShop2();	
		
		es.insert(new Desktop("삼송", "짱장데스크탑", 1200000, "Geforce1080"));
		es.insert(new NoteBook("엘쥐" , "1키로보다가벼운노트북", 1800000, 4));
		es.insert(new Tablet("사과", "눈패드", 800000, true));
		
		// 조회
		
//		// 어떤 자식개체가 들어가있는지 명확할 경우
//		Desktop d = (Desktop)es.select(0); // 강제형변환
//		NoteBook n = (NoteBook)es.select(1);
//		Tablet t = (Tablet)es.select(2);
//		
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
		
		// 어떤 자식개체가 들어가있는지 불명확할 경우
		Electronic d = es.select(0);
		Electronic t = es.select(1);
		Electronic n = es.select(2);
		// 부모 타입을 통해 자식 객체를 출력할 수 있다 ==> 부모님의 자식 찾기
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		// for 반복문을 활용하여 출력
		es.test();
		
		/*
		 * * 다형성을 사용하는 이유
		 * 1. 부모타입의 배열로 다양한 자식객체들을 받을 수 있음
		 * 2. 메소드 정의시 매개변수로 다형성을 적용하면 메소드 개수가 확 줄어듬
		 * 	  => Object 클래스에 equals 메소드의 매개변수가 Object타입으로 되어있음
		 * 		 도서객체.equals(도서객체)
		 * 		 학생객체.equals(학생객체)
		 * 		 제품객체.equals(제품객체)
		 * 		 ...
		 */

	}

}
