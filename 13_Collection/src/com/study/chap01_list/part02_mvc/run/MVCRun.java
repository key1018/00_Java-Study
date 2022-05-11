package com.study.chap01_list.part02_mvc.run;

import com.study.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		
		/*
		 * * MVC 패턴 : 각 클래스마다 역할(데이터담당, 화면담당, 요청처리담당)을 부여해서 작업
		 * 			 => 화면이나 데이터에 오류가 생길경우 한 클래스에 담으면 찾고 고치느라 시간이 오래걸리는데
		 * 				MVC처럼 각 역할담당의 클래스로가면 유지 보수하는데 빨리 파악할 수 있고 시간도 단축된다.
		 * 			 ==> 즉, 유지 보수에 용이하다!!!
		 * 
		 * - M (Model) : 데이터를 담당하는 역할(데이터들을 담기위한 클래스(vo), 비즈니스 로직을 처리하기위한 클래스(service),
		 * 				 데이터가 보관되어있는 보관함과 직접적으로 연결해서 입출력하는 클래스(dao)
		 * - V (View) : 화면을 담당하는 역할, 사용자에게 보여지는 시각적인 요소 (출력문(print), 입력문(Scanner))
		 * - C (Controller) : 사용자아 요청한 내용을 처리한 후 그 결과를 돌려주는 역할 (출력문, 입력문 안씀!!)
		 * 
		 */
		
		// 사용자가 보게될 화면 띄우기
		MusicMenu mm = new MusicMenu();
		
		mm.mainMenu();
		

	}

}
