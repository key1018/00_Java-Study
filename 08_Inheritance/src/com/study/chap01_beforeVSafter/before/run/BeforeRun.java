package com.study.chap01_beforeVSafter.before.run;

import java.util.Scanner;

import com.study.chap01_beforeVSafter.before.model.vo.Job;
import com.study.chap01_beforeVSafter.before.model.vo.Library;
import com.study.chap01_beforeVSafter.before.model.vo.School;

public class BeforeRun {

	public static void main(String[] args) {


		// 방법 1. 직접호출 - School
		// 객체생성 : name, age, address, gender, schoolName, grade, classroom
		School sch = new School("홍길동", 19, "서울시 광진구", '남', "떡잎고등학교", 3, 1);
		System.out.println(sch.information());
		
		
		// 방법 2. 배열을 통해 호출 - Job, Library
		
		// Job
		// 객체생성 : name, age, address, gender, area
		Job[] j = new Job[2];
		
		//Scanner을 통해 사용자가 직접 입력
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i < j.length; i++) {
//			System.out.print("이름 : ");
//			String name = sc.nextLine();
//			System.out.print("나이 : " );
//			int age = sc.nextInt();
//			sc.nextLine();
//			System.out.print("주소 : ");
//			String address = sc.nextLine();
//			System.out.print("성별 : ");
//			char gender = sc.nextLine().charAt(0);
//			System.out.print("일하는 지역 : ");
//			String area = sc.nextLine();
//			
//			j[i] = new Job(name, age, address, gender, area);
//		}
//		
//		// for반복문을 활용하여 호출
//		for(int i = 0; i < j.length; i++) {
//			System.out.println(j[i].information());
//		}
		
		// Library
		// 객체생성 : name, age, address, gender, borrow, date
		Library[] lib = new Library[3];
		
		for(int i = 0; i < lib.length; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : " );
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("주소 : ");
			String address = sc.nextLine();
			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("빌린책 : ");
			String borrow = sc.nextLine();
			System.out.print("대여일 : ");
			String date = sc.nextLine();
			
			lib[i] = new Library(name, age, address, gender, borrow, date);
		}
		
		// for반복문을 활용하여 호출
		for(int i = 0; i < lib.length; i++) {
			System.out.println(lib[i].information());
		}
		
		// 즉, 모든 클래스에 공통적으로 들어가는 필드값은 "name, age, address, gender"로 동일하다!!
		// => 중복된 코드가 있을 경우 "부모"클래스를 통해서 "딱 한번만" 정의해주면 코드를 쓰는 것을 단축시킬 수 있다
		// 	  중복되는 코드 : 필드, setter/getter메소드, information메소드 
		
		//	중복되는 코드를 바탕으로 클래스명 Person인 부모클래스 만들기!
		
		// "부모"클래스를 생성하여 객체를 형성하는 것의 장점
		// => 개발 후 유지보수 요청이나 수정 요청이 들어왔을 때 일일히 찾아서 작성하지 않아도 된다
		// 	  부모클래스를 수정하면 자식클래스에 전체적으로 반영된다!!! (즉, 유지보수에 용이하다)	
		
		
		
		
		
	}

}
