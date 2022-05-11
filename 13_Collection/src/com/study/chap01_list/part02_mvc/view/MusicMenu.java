package com.study.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.study.chap01_list.part01_basic.model.vo.Music;
import com.study.chap01_list.part02_mvc.controller.MusicController;

// V(View) : 사용자가 보게될 화면 클래스 (출력문, 입력문)
public class MusicMenu {
	
	// 클래스구역에 입력함으로써 메소드 전역에 사용가능하도록 설정
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() { // mainMenu 메소드 시작
		
		while(true) { // while 무한반복문을 활용하여 계속 입력받기
		
		System.out.println("\n=== 음악관리메뉴 ===");
		System.out.println("1. 새로운 곡 추가");
		System.out.println("2. 곡 전체 조회");
		System.out.println("3. 특정 곡 삭제");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 수정");
		System.out.println("0. 프로그램 종료");
		
		System.out.print(">> 메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1 : insertMusic(); break;
		case 2 : selectMusic(); break;
		case 3 : delectMusic(); break;
		case 4 : searchMusic(); break;
		case 5 : /*modifyMusic();*/ break;
		case 0 : System.out.println("프로그램을 종료합니다."); return;
		default : System.out.println("잘못 선택하셨습니다. 다시 선택해주세요."); break;
		}

	}
} // mainMenu 메소드 끝
	
	// 1. 새로운 곡 추가하는 서브화면
	public void insertMusic() { // insertMusic 메소드 시작
		
		// 새로운 곡 추가받을 값 입력받기
		
		System.out.println("\n=== 새로운 곡 추가 ===");
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청보내기! ==> MusicController의 메소드 중 하나 호출
		// 사용자가 입력한 곡, 가수명 데이터 넘기면서 호출하기
		ArrayList<Music> insert = mc.insertMusic(title, artist);
		
		// 추가한 곡 불러들이기
		for (int i = 0; i < insert.size(); i++) {
			if (title.equals(insert.get(i).getTitle())) {
				// 입력받은 곡 명이 ArrayList에 성공적으로 추기돼서 곡 명이 일치하면 출력하기
				System.out.println(insert.get(i));
				// 입력받은 곡 출력
			}
		}
		System.out.println("성공적으로 추가되었습니다.");

	} // insertMusic 메소드 끝
	
	
	
	// 2. 전체 곡 조회하는 서브화면
	public void selectMusic() { // selectMusic 메소드 시작
		
		System.out.println("\n=== 전체 곡 리스트 ===");
		
		// 전체 곡 조회요청! => ArrayList 객체 만들어서 담은 후 출력하기
		ArrayList<Music> list = mc.selectMusic();
		
		// 곡이 list에 담겨져있는지 먼저 확인 후 있으면 출력 없으면 출력x
		// 곡의 유무 isEmpty(); 로 확인하기
		if (list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다. 곡을 추가해주세요.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	} // selectMusic 메소드 끝
	
	
	// 3. 특정 곡 삭제하는 서브화면
	public void delectMusic() { // delectMusic 메소드 시작
		
		System.out.println("\n=== 특정 곡 삭제 ===");
		
		System.out.print("삭제할 곡명 또는 가수명 입력 : ");
		String str = sc.nextLine();
		
		// 삭제 요청 보내기
		
		int result = mc.delectMusic(str);
		if(result > 0) {
			System.out.println("\n성공적으로 삭제되었습니다.");
			selectMusic();
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}

	} // delectMusic 메소드 끝
	
	
	
	// 4. 특정 곡 검색하는 서브화면
	public void searchMusic() { // searchMusic 메소드 시작
		
		
		System.out.println("\n=== 특정 곡 검색 ===");
		
		System.out.print("검색할 곡명 또는 가수명 입력(키워드만 입력) : ");
		String keyword = sc.nextLine();
		
		// 검색 요청 보내기
		ArrayList<Music> search = mc.searchMusic(keyword);

		if (search.isEmpty()) {
			System.out.println("찾는 곡이나 가수가 없습니다.");
		} else {
			for (int i = 0; i < search.size(); i++) {
				System.out.println(search.get(i));
			}
		}

	} // searchMusic 메소드 끝

}
