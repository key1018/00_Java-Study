package com.study.chap04_field.run;

import com.study.chap04_field.model.vo.FieldTest1;
import com.study.chap04_field.model.vo.FieldTest2;
import com.study.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {

		//------------A_Field--------------
		
		FieldTest1 a = new FieldTest1();
				// 전역변수 == 멤버변수 == 인스턴스변수 == 필드 생성
				
				// a.test2(50);
				// 매개변수 int num에 값 대입
				// 호출할 때 ()안에 매개변수의 값을 반드시 입력해주어야함
				
				// 소멸시키고 싶을 때
//				a = null;
//				a.test2(2); 
				// NullPointerException 오류발생
				
				
				//------------B_Field--------------
				
				// FieldRun이랑 다른 패키지
		FieldTest2 b = new FieldTest2();
				
				/*
				System.out.println(b.pub);
				// 다른패키지에서도 접근 가능
				
				System.out.println(b.pro);
				// 다른패키지에서는 상속구조를 통해 접근 가능
				
				System.out.println(b.def);
				// 같은 패키지에서'만'접근 가능, 다른패키지 아예 접근 불가능
				
				System.out.println(b.pri);
				// 같은 패키지, 다른 패키지 모두 접근 불가능 only 같은 클래스에서만 접근가능
				*/
				
				//------------C_Field--------------
				
				// C_Field c = new C_Field(); => 객체없어도 static은 호출가능
				
				System.out.println(FieldTest2.sta);
				System.out.println(FieldTest3.sta);
				System.out.println(FieldTest3.STA_FIN);
				// 어떤 클래스에 있는 static변수를 호출할 것인지에 대해 명확하게 써줘야함
				// 굳이 객체 생성안해도 해당 클래스 변수 가져다 쓸 수 있음
				
				// B_Field.sta 값 변경
				FieldTest2.sta = "안녕하세요";
				
				System.out.println(FieldTest2.sta);
				
				// C_Field.STA_FIN 상수 값 변경
				// C_Field.STA_FIN = "반갑습니다"; => 상수여서 지정된 값 변경 불가능
				
			}

	}


