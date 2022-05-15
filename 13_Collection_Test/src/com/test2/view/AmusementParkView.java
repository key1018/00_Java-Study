package com.test2.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.test2.controller.AmusementParkController;
import com.test2.model.vo.AmusementPark;

public class AmusementParkView {
	
	AmusementParkController amc = new AmusementParkController();
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 사용자의 로그인 View
	 */
	public void login() {

		while (true) {

			System.out.print("아이디를 입력하세요 : ");
			String userId = sc.nextLine();
			System.out.print("비밀번호를 입력하세요 : ");
			String userPw = sc.nextLine();

			String id = amc.loginID(userId);
			String pw = amc.loginPw(userPw);

			if (userId.equals(id) && userPw.equals(pw)) {
				mainMenu();
			} else if (userId.equals(id)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (userPw.equals(pw)) {
				System.out.println("아이디가 틀렸습니다.");
			} else {
				System.out.println("로그인에 실패했습니다.");
			}
			System.out.println();
		}
		
	}

	public void mainMenu() {
		
		while(true) {

			System.out.println("\n=== 농농놀이동산 회원 정보 메뉴판(사내용) ===\n");

			System.out.println("1. 회원 정보 추가");
			System.out.println("2. 전체 회원 정보 조회");
			System.out.println("3. 회원 정보 검색");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 수정");
			System.out.println("0. 로그아웃");

			System.out.print("\n>> 메뉴를 선택하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
		
			switch(menu) {
			case 1 : insertMember(); break;
			case 2 : selectMember(); break;
			case 3 : searchMember(); break;
			case 4 : delectMember(); break;
			case 5 : updateMember(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("메뉴를 다시 선택해주세요.");
			}

		}

	}
	
	/**
	 * 1. 회원 정보 추가 View
	 */
	public void insertMember() {
		
		System.out.println("\n=== 회원 정보 추가 ===");
		System.out.print("회원명 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		// 멤버십
		String membership = "";
		// 회원 할인율
		String discount = "";
		

		ArrayList<AmusementPark> list = amc.insertMember(name, age, membership, discount);
		
		System.out.println("\n성공적으로 추가되었습니다.");

		for(int i = 0; i < list.size(); i++) {
			if((list.get(i).getName()).equals(name)) {
				System.out.println(list.get(i));
			}
		}
		System.out.println();
		
	}
	
	
	/**
	 * 2. 전체 회원 정보 조회 View
	 */
	public void selectMember() {

		ArrayList<AmusementPark> list = amc.selectMember();

		System.out.println("\n=== 전체 회원 정보 ===");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

	}
	
	
	/**
	 * 3. 특정 회원 정보 조회 View
	 */
	public void searchMember() {
		
		System.out.print("찾는 회원명 : ");
		String name = sc.nextLine();
		
		ArrayList<AmusementPark> searchList = amc.searchMember(name);
		
		for(int i = 0; i < searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
		
		System.out.println();
		
	}
	
	/**
	 * 4. 특정 회원 정보 삭제
	 */
	public void delectMember() {
		
		System.out.println("\n=== 회원 정보 삭제 ===");
		
		System.out.print("삭제하고자하는 회원명 : ");
		String name = sc.nextLine();
		
		int result = amc.delectMember(name);
		
		if(result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
			selectMember();
		} else {
			System.out.println("삭제할 회원을 찾지 못했습니다.");
		}
		
		System.out.println();
		
	}
	
	/**
	 * 5. 특정 회원 정보 수정 View
	 */
	public void updateMember() {
		
		System.out.println("\n=== 회원 정보 수정 ===");
		System.out.print("수정하고자하는 회원명 : ");
		String name = sc.nextLine();
		
		System.out.print("수정 내용(회원명, 나이) : ");
		String update = sc.nextLine();
		
		ArrayList<AmusementPark> updateList = amc.updateMember(name);
		
		// 수정 전 회원 정보 출력
		for(int i = 0; i < updateList.size(); i++) {
			if((updateList.get(i).getName()).equals(name)) {
				System.out.println(updateList.get(i));
			}
		}
		
		System.out.println();
		
		int result = amc.updateMember(name, update);
		
		
		// 수정 후 회원 정보 출력
		if(result > 0) {
			for(int i =0; i < updateList.size(); i++) {
				System.out.println("성공적으로 수정했습니다.");
				System.out.println(updateList.get(i));
			}
		} else {
			System.out.println("회원 정보를 수정하지 못했습니다.");
		}

		System.out.println();
	}
	
	
	
	
	

}
