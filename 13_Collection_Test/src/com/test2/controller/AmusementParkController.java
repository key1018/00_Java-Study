package com.test2.controller;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.test2.model.vo.AmusementPark;

public class AmusementParkController {
		
	ArrayList<AmusementPark> list = new ArrayList<>(); {
	
	list.add(new AmusementPark("홍길동", 23, "성인 회원", 0.2));
	list.add(new AmusementPark("김말자", 17, "청소년 회원", 0.3));
	list.add(new AmusementPark("강동원", 22, "성인 회원", 0.2));
	list.add(new AmusementPark("이지은", 12, "어린이 회원", 0.5));

	}
	/**
	 * 0_1. 로그인을 위한 아이디 입력 요청 처리
	 * @param userId 로그인을 위한 사용자의 아이디
	 * @return 사용자의 아이디
	 */
	public String loginID(String userId) {

		String id = "key1018";

		return id;

	}
	
	/**
	 * 0_2. 로그인을 위한 비밀번호 입력 요청 처리
	 * @param userPw 로그인을 위한 사용자의 비밀번호
	 * @return 사용자의 비밀번호
	 */
	public String loginPw(String userPw) {

		String pw = "12345d!";

		return pw;

	}

	/**
	 * 1. 회원 정보 추가 요청 처리
	 * @param name : 추가하는 회원명
	 * @param age : 추가하는 회원 나이
	 * @param membership : 추가하는 회원 멤버십
	 * @param discount : 추가하는 회원 할인율
	 * @return : 추가된 회원 정보 출력
	 */
	public ArrayList<AmusementPark> insertMember(String name, int age, String membership, double discount) {

		
		if(age <= 13) {
			membership = "어린이 회원";
		} else if(age <= 19) {
			membership = "청소년 회원";
		} else {
			membership = "성인 회원";
		}
		
		switch(membership) {
		case "어린이 회원" : discount = 0.5; break;
		case "청소년 회원" : discount = 0.3; break;
		case "성인 회원" : discount = 0.2; break;
		}
		
		list.add(new AmusementPark(name, age, membership, discount));
		
		return list;
	}
	
	/**
	 * 2. 회원 전체 정보 조회 요청 처리
	 * @return 회원 전체 정보
	 */
	public ArrayList<AmusementPark> selectMember() {

		return list;

	}
	
	
	/**
	 * 3. 특정 회원 정보 조회 요청 처리
	 * @param name 찾고자하는 회원명
	 * @return 전체 회원 정보 리스트
	 */
	public ArrayList<AmusementPark> searchMember(String name){
		
		ArrayList<AmusementPark> searchList = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			AmusementPark park = list.get(i);
			if(park.getName().equals(name)) {
				searchList.add(park);
				break;
			}
		}
		return searchList;
		
	}
	
	/**
	 * 4. 특정 회원 삭제 요청 처리
	 * @param name 삭제하고자하는 회원명
	 * @return 삭제 처리가 됐는지 확인하는 숫자
	 * 		   result = 0 (삭제x) | result = 1 (삭제o)
	 */
	public int delectMember(String name) {
		
		int result = 0;
		
		for(int i =0; i < list.size(); i++) {
			if((list.get(i).getName()).equals(name)) {
				list.remove(i);
				result++;
				break;
			}
		}
		return result;
		
	}
	
	/**
	 * 5_1. 특정 회원 정보 수정 전,후 출력 요청
	 * @param name 수정하고자하는 회원명
	 * @return 수정 전,후 회원정보
	 */
	public ArrayList<AmusementPark> updateMember(String name) {
		
		ArrayList<AmusementPark> update = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			AmusementPark park = list.get(i);
			if ((park.getName()).equals(name)) {
				update.add(list.get(i));
			}
		}
		
		return update;

	}
	
	/**
	 * 5_2. 특정 회원 정보 수정 요청 처리
	 * @param name 수정하고자하는 회원명
	 * @param update 수정 요청하는 회원명,나이
	 * @return 성공적으로 수정됐는지 확인하는 숫자
	 * 		   result = 0 (수정x) | result = 1 (수정o)
	 */
	public int updateMember(String name, String update) {

		StringTokenizer st = new StringTokenizer(update, ",");
		int result = 0; // 결과값을 반환할 변수
		int age = 0; // 회원들의 나이를 담을 변수

		for (int i = 0; i < list.size(); i++) {
			AmusementPark park = list.get(i);
			if ((park.getName()).equals(name)) {
				park.setName(st.nextToken());

				age = Integer.parseInt(st.nextToken());
				park.setAge(age);

				if (age <= 13) {
					park.setMembership("어린이 회원");
					park.setDiscount(0.5);
				} else if (age <= 19) {
					park.setMembership("청소년 회원");
					park.setDiscount(0.3);
				} else {
					park.setMembership("성인 회원");
					park.setDiscount(0.2);
				}
				result++;
				break;

			}
		}

		return result;
	}

}
