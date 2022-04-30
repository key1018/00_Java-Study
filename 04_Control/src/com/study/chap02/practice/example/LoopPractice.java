package com.study.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		
//		practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}

	}
	
	public void practice3() {
		
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	public void practice4() {
		
//		practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못입력했습니다. 다시입력해주세요.");
				continue;
			}

		}
	}
	
	public void practice5() {
		
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i);
				if(i < num) {
					System.out.print(" + ");
				} else {
					System.out.print(" = ");
				}
				sum += i;
		}
		} else {
			System.out.println("양수를 입력하세요.");
		}
		System.out.print(sum);
		
	}
	
	public void practice6() {
		
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		if(num1 > 0 && num2 > 0) {
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice7() {
		
//		practice6() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);

			if (num1 > 0 && num2 > 0) {
				for (int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
		}
	}
	
	public void practice8() {
		
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", dan);
		
		for(int su =1; su <=9; su++) {
			System.out.printf("%d x %d = %d\n", dan, su, dan * su);
		}
		
	}
	
	public void practice9() {
		
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(2 <= num && num <= 9) {
			for(int dan = num; dan <= 9; dan++) {
				System.out.printf("===== %d단 =====\n",dan);
				for(int su = 1; su <= 9; su++) {
					System.out.printf("%d x %d = %d\n", dan, su, dan*su);
				}
			}
		} else {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		
//		practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
//		“2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(2 <= num && num <= 9) {
				for(int dan = num; dan <= 9; dan++) {
					System.out.printf("===== %d단 =====\n", dan);
					for(int su = 1; su <= 9; su++) {
						System.out.printf("%d x %d = %d\n", dan, su, dan*su);
					}
				}
				break;
			} else {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
				continue;
			}
		}

	}
	
	public void practice11() {
		
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int allow = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(start + " ");
			start += allow;
		}

	}
	
	public void practice12() {
		
//		정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+,-,*,/,%) : ");
			String op = sc.nextLine();
			
			// 해당 프로그램은 연산자 입력에 “exit”가 들어올 경우
			
			if(op.equals("exit") || op.equals("EXIT")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			
			//연산자가 나누기이면서 두 번째 정수가 0인 경우
			
			if((op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			int result = 0;
			
			switch(op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요."); continue;
			}
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
		}
		
	}
}
