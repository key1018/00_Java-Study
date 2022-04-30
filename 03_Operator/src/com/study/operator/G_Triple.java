package com.study.operator;

import java.util.Scanner;

// 클래스명 : 삼항연산자
public class G_Triple {
	
	/*
	 * 삼항연산자 (항목 3개로 대입하는 연산자)
	 * 
	 * [표현법]
	 * 조건식(true/false) ? true 값 ! false 값
	 * 
	 * 조건식은 반드시 true / false 값이어야함 (비교, 논리연산자 사용)
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int num = sc.nextInt();
		
		String str = (0 < num ? "양수이다" : "양수가 아니다");
		
		System.out.println("num의 값은 양수인가요? ");
		System.out.printf("num의 값은 %s", str);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수값 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수값: ");
		int num2 = sc.nextInt();
		
		String result = (num1 % 2 == 0 ? "짝수이다" : "홀수이다");
		String result2 = (num1 % 2 != 0 ? "홀수이다" : "짝수이다");
		String result3 = (num2 % 2 == 0 ? "짝수이다" : "홀수이다");
		String result4 = (num2 % 2 == 1 ? "홀수이다" : "짝수이다");
		String result5 = ((num1+num2) % 3 == 1 ? "3의 배수가 아니다" : "3의 배수이다");
		String result6 = ((num1*num2) % 5 == 0 ? "5의 배수이다" : "5의 배수가 아니다");
		
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반갑습니다. 대회에 참가하시겠습니다?(Y/N) ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("성함을 작성해주세요 : ");
		String name = sc.nextLine();
		
		System.out.println("첫 번째 문제입니다.\n"
				+"1번 4, 2번 5, 3번 12, 4번 18, 5번 26");
		System.out.print("다음 중 짝수가 아닌 것은? : ");
		String num = sc.nextLine();
		
		System.out.println("두 번째 문제입니다.\n"
				+ "1번 5, 2번 9, 3번 103, 4번 72, 5번 99" );
		System.out.print("다음 중 홀수가 아닌 것은? : ");
		String num2 = sc.nextLine();
		
		System.out.println("마지막 문제입니다.\n"
				+ "1번 가, 2번 a, 3번 N, 4번 q, 5번 abd");
		System.out.print("다음 중 영어가 아닌 것은? : ");
		String num3 = sc.nextLine();
		
		String game = (ch == 'y' || ch =='Y' ? "참가합니다" : 
			(ch == 'N' || ch == 'n' ? "참가하지 않겠습니다" : "다시 입력해주세요"));
		

		System.out.println(num);
		String result1 = ("2번".equals(num) ? "정답입니다!" : "틀렸습니다!");
		// 문자열의 경우 : "xx".equals(변수)의 표현법을 통해 true/false를 구분함
		
		String result2 = ("4번".equals(num2) ? "정답입니다!" : "틀렸습니다!");
		
		String result3 = ("1번".equals(num3) ? "정답입니다!" : "틀렸습니다!");
		
		System.out.println();
		System.out.println("참가하시겠습니까? " + game);
		System.out.println("지원가의 성함 : " + name);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 앞자리를 입력해주세요  : ");
		int front = sc.nextInt();
		sc.nextLine();
		
		System.out.print("주민등록번호 뒷자리를 입력해주세요 : ");
		String back = sc.nextLine();
		char ch = back.charAt(0);
		
		String gender = (ch == '1' || ch == '3' ? "남자입니다" 
				: (ch == '2' || ch == '4' ? "여자입니다" : "주민등록번호를 다시 입력해주세요"));
		// char로 인해 문자로 변환되기 때문에 'x'를 이용하여 true/false를 구분한다 
		
		System.out.printf("주민등록번호 : %d-%s입니다\n", front, back);
		System.out.printf("성별 : %s", gender);
		
	}
	
	public void method5 () {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자 입력 ( + 또는 - 또는 * 또는 / 또는 %): ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + ""
				: op == '*' ? num1 * num2 +"" : op == '/' ? num1 / num2 + "" 
				: op == '%' ? num1 % num2 + "" : "다시입력해주세요"));
		// int인 정수를 문자열로 바꾸기 위해서는 연산이 끝난 후에 ""를 붙여줘야된다
		
		System.out.println();
		System.out.println("=====================");
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		System.out.println("연산자 입력 : " + op);
		System.out.println("결과값 : " + result);

	}

}
