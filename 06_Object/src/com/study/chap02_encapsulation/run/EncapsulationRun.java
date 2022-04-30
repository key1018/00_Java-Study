package com.study.chap02_encapsulation.run;

import com.study.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {

	public static void main(String[] args) {

		/*
		 * * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게된다.
		 * 
		 * 		* 캡슐화 : 추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나
		 * 				클래스에서의 가장 중요한 목적인 "데이터의 접근 제한"을 원칙으로
		 * 				외부로부터 "데이터의 직접 접근을 막고"   ==> private
		 * 				대신에 "데이테를 간접적으로나마 처리"할 메소드들을 클래스 내부에 작성해서 관리하는 기법  ==> set/get메소드
		 * 
		 * 1) 정보 은닉 : private
		 * 			   직접 접근을 막기 위해 사용 => 데이터의 내부 정보가 보이지 않음
		 * 
		 * 2) setter / getter 메소드
		 * 		setter 메소드 : 해당 빌드에 대입시키고자하는 값을 전달아가 해당 필드에 대입시켜줌
		 * 		getter 메소드 : 해당 필드에 담긴 값을 반환시켜줌
		 */

			
		Student gildong = new Student();	
			
//			private String name;
//			private int age;
//			private double height;
//			private char gender; // 남/여
//			private int korScore;
//			private int mathScore;
				
			
//			gildong.name = "홍길동";
//			gildong.age = 20;
//			gildong.height = 153.5;
//			==> private으로 직접접근은 못하고 setter/getter을 통해 간접접근해야함
			
			// (1) setter 메소드 활용
			
			gildong.setName("홍길동");
			gildong.setAge(20);
			gildong.setHeight(187.5);
			gildong.setGender('남');
			gildong.setKorScore(80);
			gildong.setMathScore(90);

			System.out.println(gildong.getName());
			System.out.println(gildong.getAge());
			System.out.println(gildong.getHeight());
			System.out.println(gildong.getGender());
			System.out.println(gildong.getKorScore());
			System.out.println(gildong.getMathScore());

		}

	}

