package com.study.operator;

import java.util.Scanner;

public class H_AllOperator {
	
	

		public void quiz1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 값 : ");
			int num = sc.nextInt();
			
			String result = (num > 0 ? "양수이다." : (num == 0 ? "0이다" : "음수이다."));
			
			System.out.println("결과값 : " + result);
			
		}
		
		public void quiz2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("num1 : "); // 9
			int num1 = sc.nextInt(); // 7
			
			System.out.print("num2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			boolean bool1 = num1 >= num2; // true
			boolean bool2 = num1 <= num2; // false
			boolean bool3 = num1 * 8 <= num2 * 3;
			// num1 = 72, num2 = 21 ==> false
			boolean bool4 = num1 / 8 <= num2 * 3;
			// num1 = 1, num2 = 21 ==> true
			boolean bool5 = num1 / 8 == num2 % 3;
			// num1 = 1, num2 = 1 ==> true
			boolean bool6 = num1 / 8 != num2 % 3;
			// num1 = 1, num2 = 1 ==> false
			
			System.out.println("result1 : " + bool1);
			System.out.println("result2 : " + bool2);
			System.out.println("result3 : " + bool3);
			System.out.println("result4 : " + bool4);
			System.out.println("result5 : " + bool5);
			System.out.println("result6 : " + bool6);	
			
		}
		
		public void quiz3() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("num1 : "); // 8
			int num1 = sc.nextInt();
			
			System.out.print("num2 : "); // 2
			int num2 = sc.nextInt();
		
			int num3 = ++num2; // 3
			
			int num4 = num1++ + num2; // 8(9) + 3 == 11, num1 = 9

			System.out.println("num1의 값 : " + num1); //9
			System.out.println("num2의 값 : " + num2); //3
			System.out.println("num3의 값 : " + num3); //3
			System.out.println("num4의 값 : " + num4); //11
		}
		
		public void quiz4() {
			
			
			Scanner sc = new Scanner(System.in);		
			
			System.out.print("a의 값 : "); // 12
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.print("b의 값 : "); // 20
			int b = sc.nextInt();
			sc.nextLine();
			
			int c = ++a;
			int d = c--;
			int e = a + d;
			int f = (d++) + (--a);
			int g = e / f;
			int h = e % c;
			System.out.println("================");
			System.out.println("a의 값 : " + a);
			System.out.println("b의 값 : " + b);
			System.out.println("c의 값 : " + c);
			System.out.println("d의 값 : " + d);
			System.out.println("e의 값 : " + e);
			System.out.println("f의 값 : " + f);
			System.out.println("g의 값 : " + g);
			System.out.println("h의 값 : " + h);
			System.out.println(5 % 11);
			System.out.println("최종 값 : " + ((a++) + b * (--c) % d - (++f) - (g--) + e / h));
			
			
		}
		
		public void quiz5() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.print("영문자를 입력하세요 : ");
			char ch = sc.nextLine().charAt(0);
			
			boolean result = (-100 <= num && num <= 100);
			boolean result2 = ('A' <= ch && ch <= 'Z' ) || ('a' <= ch && ch <= 'z');
			
			System.out.println("숫자를 입력했습니까? " + result);
			System.out.println("영문자를 입력했습니까? " + result2);
			
		}
		
		public void quiz6() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("인원 수 : ");
			int people = sc.nextInt();
			
			System.out.print("사탕 수 : ");
			int candy = sc.nextInt();
			
			System.out.println("1인당 사탕 수 : " + (candy / people));
			System.out.println("남는 사탕 수 : " + (candy % people));
			
			
		}
		
		public void quiz7() {
			
			Scanner sc = new Scanner(System.in);
			
			int a = 12;
			int b = 15;
			
			System.out.println("a : " + a); // 12
			System.out.println("b : " + b); // 15
			
			boolean result1 = (a >= b) && (a++ <= b); // false true
			boolean result2 = (a <= b) && (a <= b++); // true true
			
			System.out.println("result1 : " + result1); // false
			System.out.println("result2 : " + result2); // true
			System.out.println("연산 후의 a : " + a); // 12, 첫 번째 조건이 false므로 두 번째 조건 실행 x
			System.out.println("연산 후의 b : " + b); // 16, 첫 번째 조건이 true므로 두 번째 조건 실행 o
			
			boolean result3 = (a == b) || (a++ >= b); // false false
			// 첫 번째 조건이 false면 두 번째 조건이 실행된다 ==> a = 13
			boolean result4 = (a <= b) || (a++ >= b); // true false
			// 첫 번쨰 조건이 true면 두 번째 조건이 실행되지 않는다 ==> a = 13
			boolean result5 = (a >= b) || (a <= b++); // false true
			// 첫 번째 조건이 false면 두 번째 조건이 실행된다 ==> b = 17
			
			System.out.println("result3 : " + result3); // false
			System.out.println("result4 : " + result4); // true
			System.out.println("result5 : " + result5); // true
			System.out.println("연산 후의 a : " + a); // 13
			System.out.println("연산 후의 b : " + b); // 17
				
		}
		
		public void quiz8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("반 : ");
			int group = sc.nextInt();
			sc.nextLine();
			
			System.out.print("성별(남/여) : ");
			char gender = sc.nextLine().charAt(0);

			
			System.out.print("국어 점수 : ");
			int kr = sc.nextInt();
			sc.nextLine();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			sc.nextLine();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			int total = kr + eng + math;
			double avg = (kr + eng + math)/3.0;
			
			
			String result = (gender == '남' ? "남학생" : (gender == '여' ? "여학생" : "다시 입력해주세요"));
			String result2 = (60 <= kr && 60 <= eng && 60 <= math && 180 <= total && 70 <= avg
					? "합격이다" : "불합격이다");
			
			System.out.printf("%d학년 %d반 %s %s의 시험성적이 나왔다.\n", grade, group, name, result);
			System.out.printf("국어 점수는 %d점, 영어 점수는 %d점, 수학 점수는 %d점이다.\n"
					+ "평균 점수는 %.2f점, 총 합점은 %d점으로 시험에서 %s", kr, eng, math, avg, total, result2);

		}
		
		public void quiz9() {
			
			int a = 10;
			
			System.out.println("a : " + a); // 10
			
			a +=7;
			
			System.out.println("7증가시킨 a : " + a); // 17
			
			a /= 2;
			
			System.out.println("2나눈 a : " + a); // 8
			
			a *= 8;
			
			System.out.println("8곱한 a : " + a); // 64
			
			a %= 3;
			
			System.out.println("3을 나눈 후의 나머지인 a : " + a); // 1
			
			a -= 10;
			
			System.out.println("10을 뺸 최종 a : " + a); // -9
			
		}
		
		public void quiz10() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("사랑도서관에 오신 것을 환영합니다");
			System.out.print("회원등록을 하시겠습니다?(네/아니요) ");
			String register = sc.nextLine();
			
			System.out.print("이름을 입력해주세요 : ");
			String name = sc.nextLine();
			
			System.out.print("주민번호를 입력하세요(-포함) : ");
			String gender = sc.nextLine();
			char ch = gender.charAt(7);
			
			System.out.print("나이를 입력해주세요(숫자만) : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			String entry = ("네".equals(register) ? "회원가입을 진행합니다" : "다음에 다시 방문해주세요");
			
			String result1 = (ch == '2' || ch == '4' ? "여자" 
					: (ch == '1' || ch == '3' ? "남자" : "다시 입력해주세요" ));
			
			String result2 = (age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인"));
			
			
			System.out.println("======================");
			System.out.println("회원등록을 하시겠습니까? : " + entry);
			System.out.printf("%s님의 주민등록번호는 %s이고, %s입니다. 현재 나이는 %d살로 %s회원 입니다.%n",name, gender, result1, age, result2);

			System.out.print("회원정보가 바르게 입력되었습니까?(Y/N) ");
			char check = sc.nextLine().charAt(0);

			String result3 = (check == 'y' || check == 'Y' ? "가입이 완료되었습니다" : "다시 입력해주세요");

			System.out.println(result3);

		}

	}

