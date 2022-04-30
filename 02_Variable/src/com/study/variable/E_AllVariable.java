package com.study.variable;

import java.util.Scanner;

public class E_AllVariable {

	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();

		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double weight = sc.nextDouble();
		sc.nextLine();

		System.out.print("세로 : ");
		double height = sc.nextDouble();

		System.out.println("면적 : " + (weight * height));
		System.out.println("둘레 : " + ((weight + height) * 2));

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		// 방법 1.

		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);

		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);

		// 방법 2.

		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));

	}

	public void method5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		System.out.print("소수 : ");
		double num2 = sc.nextDouble();

		String result = (0 < num && 0 < num2 ? "양수다" : "양수가 아니다");

		System.out.println("result : " + result);

	}

	public void method6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (0 < num ? "양수다" : (num == 0 ? "0이다" : "음수다"));

		System.out.println("result = " + result);

	}

	public void method7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0 ? "짝수다" : "홀수다");

		System.out.println("result : " + result);

	}

	public void method8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int people = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : " + (candy % people));
	}

	public void method9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();

		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		sc.nextLine();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);

		String result = (gender == 'm' || gender == 'M' ? "남학생" : "여학생");

		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();

		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, group, num, name, result, score);

	}
	
	public void method10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = (13 >= age ? "어린이" : (13 < age && age <= 19 ? "청소년" : "성인"));

		System.out.printf("%s님의 나이는 %d살입니다. %s회원입니다.", name, age, result);
	}

	public void method11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kr = sc.nextInt();
		sc.nextLine();

		System.out.print("영어 : ");
		int eng = sc.nextInt();
		sc.nextLine();

		System.out.print("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();

		int total = kr + eng + math;
		double avg = (kr + eng + math) / 3.0;

		String result = (40 <= kr && 40 <= eng && 40 <= math && 60 <= avg ? "합격" : "불합격");
		System.out.println("================");
		System.out.println("국어 점수 : " + kr);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println();
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println(result);

	}

	public void method12() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호 앞자리를 입력하세요 : ");
		int front = sc.nextInt();
		sc.nextLine();

		System.out.print("주민번호 뒷자리를 입력하세요 : ");
		String back = sc.nextLine();
		char num = back.charAt(0);

		String gender = (num == '1' || num == '3' ? "남성입니다" : (num == '2' || num == '4' ? "여성입니다" : "주민번호를 다시 입력해주세요"));

		System.out.printf("주민등록번호 : %d-%s\n", front, back);
		System.out.println(gender);

	}

}
