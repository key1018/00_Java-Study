package com.study.first;

public class A_Method {

	// 진짜 이름 : com.goodee.first.A_MethodPrinter

	// 패키지명은 소문자로 시작한다.
	// 클래스명은 대문자로 시작한다.

		// 일반 메소드를 생성한다.
		// > public void 메소드명() { 소스코드 }
		// 일반메소드는 실행이 되지않는다.
		// static은 메인 or 일반을 구분하는 표시이다.

		// 메소드명은 소문자로 시작한다.
		public void methodA() {
			System.out.println("메소드 A를 시작합니다.");
			methodB(); // 같은 클래스 내에서 methodB호출
		}

		public void methodB() {
			System.out.println("메소드 B를 시작합니다.");
			methodC(); // 같은 클래스 내에서 methodC호출
		}

		public void methodC() {
			System.out.println("메소드 C를 시작합니다.");
		}

	}

