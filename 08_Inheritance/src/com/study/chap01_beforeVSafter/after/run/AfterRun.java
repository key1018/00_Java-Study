package com.study.chap01_beforeVSafter.after.run;

import com.study.chap01_beforeVSafter.after.model.vo.Job;
import com.study.chap01_beforeVSafter.after.model.vo.Library;
import com.study.chap01_beforeVSafter.after.model.vo.School;

public class AfterRun {

	public static void main(String[] args) {

		/*
		 * * 상속의 장점
		 * - 공통적인 코드들을 부모클래스에 정의해두면 새로운 클래스를 작성하는 것보다 적은 양의 코드로 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이
		 * 	 (프로그램의 생산성과 유지보수에 크게 용이하다)
		 */
		
		Library l = new Library("홍길동", 12, "서울시 강남구", '남', "파과", "2022.04.25");
		System.out.println(l.information());
		
		School sch = new School("강개똥", 15, "경기도 오산시", '여', "떡잎중학교", 2, 1);
		System.out.println(sch.information());
		
		Job j = new Job("이말순", 28, "경기도 평택", '남', "서울시 강남구");
		System.out.println(j.information());
		
		// Library에서 주소, 빌린책이랑 대여일이 변경된 경우
		l.setAddress("부산"); // 부모클래스에 있는 메소드 호출
		l.setBorrow("아가미"); // 자식클래스에 있는 메소드 호출
		l.setDate("2022.05.03");
		
		System.out.println("변경 후 ==> " + l.information());

	}

}
