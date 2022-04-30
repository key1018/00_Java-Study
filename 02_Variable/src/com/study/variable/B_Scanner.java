package com.study.variable;

//Scanner을 하기 전에는 import를 통해 선언문을 작성해야 한다.

import java.util.Scanner;
//ctrl + shift + o를 통해 쉽게 선언할 수 있다.


// 클래스명은 대문자로 시작한다.
public class B_Scanner {

	// 메소드명은 소문자로 시작한다.
	public void methodA() {

		// 선언문을 통해 작성할 스캐너를 부른다.
		// import 선언문과 Scanner sc = new Scanner(System.in)
		// => 기본적으로 작성해야하는 문장들(약속된 문장)이므로 기억하는 것이 좋다!
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		// nextLine() : 입력공간(버퍼)에 입력된 값 + "엔터"를 함께 비워주는 역할을 한다.

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// nextInt 및 그 외 : 입력공간(버퍼)에 입력된 값만 비워주는 역할을 한다.
		// ==> sc.nextLine()을 후에 입력해야 "엔터"를 비워줘서 값을 입력하지 못했는데 다음 라인으로 넘어가는 것을 방지한다.
		sc.nextLine(); // 비워지지않은 "엔터"를 비워주는 역할을 한다.

		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();

		System.out.print("성별(남/여)를 입력하세요 : ");
		char gender = sc.nextLine().charAt(0);
		// char '문자'의 경우 char = gender = sc.nextChar();은 오류가 난다.
		/*
		 * [해결방법] 1. Scanner을 통해 값을 '문자열'로 입력받는다. 2. '문자열'로 입력받은 값을 charAt()을 통해 문자열의 특정
		 * 위치를 '문자'로 바꿔서 출력한다. ex) 문자열 "apple"" => charAt(0);을 사용 => 문자 'a'로 변환
		 */
		System.out.println();
		System.out.println("=====================");
		System.out.println(name + "님의 정보");
		System.out.println("나이 : " + age + "살");
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + gender);

	}

	public void methodB() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학교명 : ");
		String school = sc.nextLine();

		System.out.print("학점 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		System.out.print("회사명 : ");
		String company = sc.nextLine();

		System.out.print("현재 회사에 만족하십니까?(Y/N)  : ");
		char happy = sc.nextLine().charAt(0);

		System.out.print("희망 연봉은 얼마입니까?(초봉) : ");
		int money = sc.nextInt();

		System.out.println();
		System.out.println("=============");
		System.out.println(name + "님의 설문조사 답변");
		System.out.println("학교명 : " + school);
		System.out.println("학점 : " + score + "점");
		System.out.println("회사명 : " + company);
		System.out.println("만족 or 불만족 ? " + happy);
		System.out.println("희망연봉 : " + money + "만원");

	}

	public void methodC() {

		Scanner sc = new Scanner(System.in);

		System.out.println("스핑크스 퀴즈대회에 오신 것을 환영합니다!");
		System.out.println("문제를 풀어 상금을 획득하세요!");
		System.out.println();
		System.out.println("[조건1] x + y 의 값이 30이 된다");
		System.out.println("[조건2] x - y 의 값이 16이 된다");
		System.out.println("[조건3] x * y 의 값이 161이 된다");
		System.out.println("[조건4] x / y 의 값이 3이 된다");
		System.out.println("[조건4] x % y 의 값이 2이 된다");

		System.out.println();
		System.out.println("1_1. 첫 번째 숫자를 입력하세요"); // 23
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("1_2. 두 번째 숫자를 입력하세요"); // 7
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("=======================");
		System.out.println("정답을 확인하겠습니다!");
		System.out.println("x 의 값 : " + num1 + ", y 의 값 : " + num2);
		System.out.println("x + y = " + (num1 + num2));
		System.out.println("x - y = " + (num1 - num2));
		System.out.println("x * y = " + (num1 * num2));
		System.out.println("x / y = " + (num1 / num2));
		System.out.println("x % y = " + (num1 % num2));

	}

	public void methodD() {

		/*
		 * charAt() : 데이터의 특정 위치에 있는 index의 값을 출력하는 것이다. ex) "apple"의 index순서는 01234이다
		 * -> charAt(2); => index 2 번을 출력하는 것이므로 'p'가 출력된다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("특정 단어의 위치에 속해있는 알파벳을 구하시오.");
		System.out.println();

		System.out.print("특정 단어 : ");
		String str = sc.nextLine();

		System.out.println("=================");
		System.out.println("index(1)의 알파벳은?");
		System.out.println(str.charAt(1));
		System.out.println();

		System.out.println("index(4)의 알파벳은?");
		System.out.println(str.charAt(4));
		System.out.println();

		System.out.println("index(6)의 알파벳은?");
		System.out.println(str.charAt(6));
		// 만약 데이터의 길이가 index(6)까지 안된다면 오류가 난다.

	}

}
