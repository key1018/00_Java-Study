package com.test2.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.test2.model.vo.Aquarium;

public class AquariumController {
	
	Aquarium[] aqua = new Aquarium[3];
	
	// 등록일
	Date regist = new Date();
	
	// 회원권 종료일
	Date lastDate = new Date();
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 사용자에게 회원 정보 입력받기
	 */
	public void insertMember() {

		System.out.println("-----------회원 추가-----------");

		for (int i = 0; i < aqua.length; i++) {

			System.out.printf("=== %d번째 회원 정보 ===\n", i + 1);

			System.out.print("회원명 : ");
			String name = sc.nextLine();

			System.out.print("회원권 등록일(2011-12-01 과 같이 '-'구분자를 이용하여 입력하시오) : ");
			String registDate = sc.nextLine();

			// 1) StringTokenizer을 활용하여 문자열로 받은 등록일 Date에 집어넣기
			StringTokenizer st = new StringTokenizer(registDate, "-");

			// 2) StringTokenizer에 의해 분리된 문자열들 각각 int형 자료에 넣기
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());

			// 3) Date regist를 출력해서 int형으로 변경된 데이터값들 각각 넣기
			regist = new Date(year - 1900, month - 1, day);

			// 3_1) 등록일에 1년을 더해서 오늘날짜에서 남은 일 구하기
			lastDate = new Date(year - 1899, month - 1, day);

			// 4) 사용자에게 입력받은 값들을 Aquarium클래스의 매개변수 생성자를 통해 생성
			Aquarium aq = new Aquarium(name, regist, lastDate);

			aqua[i] = aq;
		}

		System.out.println("\n-----------회원 정보-----------");

		// 5) for반복문을 활용하여 출력
		for (int i = 0; i < aqua.length; i++) {
			System.out.println(aqua[i]);
		}

	}

	/**
	 * 사용자에게 찾고싶은 회원 입력받기
	 */
	public void searchMember() {

		System.out.print("찾고자하는 회원명 : ");
		String searchName = sc.nextLine();

		System.out.println("\n-----------찾는 회원 정보-----------");

		for (int i = 0; i < aqua.length; i++) {
			if (aqua[i].getName().equals(searchName)) {

				// 1) 시스템의 현재 날짜 구하기

				Date today = new Date();

				// 1_1) 현재날짜를 SimpleDateFormat을 통해 문자열 형식으로 반환하기
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String format = sdf.format(today);

				// 1_3) regist와 lastDate에 각 회원들의 회원권 등록일, 종료일 넣기
				regist = aqua[i].getRegist();
				lastDate = aqua[i].getlastDate();

				// 2) 현재날짜에서 회원권 종료일을 빼서 남은 기간 구하기
				long calDate = lastDate.getTime() - today.getTime();

				// 3) 차이값을 절대값으로 출력 후 (24 * 60 * 60 * 1000)로 나누어서 일수로 결과값이 나오도록 설정
				calDate = calDate / (24 * 60 * 60 * 1000);

				// 4) equals를 활용하여 찾고자하는 회원명이 일하면 회원 정보와 남은 회원일 구하기

				if (calDate > 0) { // 회원권 날짜가 남은 경우
					System.out.println(aqua[i]); // 회원정보 출력
					System.out.println("오늘날짜  : " + format); // 오늘날짜 출력
					System.out.println("남은 회원권 일 수 : " + calDate + "일"); // 남은 날짜 출력
				} else { // 회원권 날짜가 종료된 경우
					System.out.println(aqua[i]);
					System.out.println("회원권이 종료되었습니다.");
				}
			}
		}

	}

}
