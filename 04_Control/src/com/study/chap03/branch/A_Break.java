package com.study.chap03.branch;

import java.util.Scanner;

public class A_Break {

	
	/*
	 * * break문 : 반복문 안에서 사용되는 분기문
	 * 			  break;문이 실행되면 현재 속해있는 반복문을 빠져나감
	 * 
	 * * 유의사항 : switch문 안에서의 break;문은 오로지 switch문만 빠져나감
	 * 
	 * 반복문() (
	 * 	switch() {
	 * 		실행 코드;
	 * 			break;
	 * 		}				=> 오로지 switch문만 빠져나가고 반복문 다시 실행
	 * }
	 */
	
	
	public void method1() {
		
		// 반복적으로 사용자에게 문자열을 입력받고 해당 문자열의 길이 출력
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복 수행 X
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 입력 (종료하고자 한다면 exit 입력) : ");
			String str = sc.nextLine();

			/*
			switch(str) { 
			case "exit" : System.out.println("입력을 종료합니다.");
			break;
			}
			
			switch문의 경우 break;를 실행했을 때 switch문만 빠져나가고 반복문은 계속 실행된다 => 무한 반복됨
			*/
			
			if ("exit".equals(str)) {
				System.out.println("입력을 종료합니다");
				break;
			}

			System.out.println("문자열" + str + "의 길이는 " + str.length() + "입니다.");
		}

	}

	public void method2() {
		
		// 랜덤값(1~100) 발생시키고 그 랜덤값 출력하여 총 합계 구하기(매번 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우(3으로 나누었을 떄 나머지가 0일 경우) 반복문을 빠져나옴
		
		int total = 0;
		
		while(true) {
			int random = (int) (Math.random() * 100 + 1);

			System.out.print("random값 : " + random);

			total += random;

			if (random % 3 == 0) {
				break;
			}
		}
		System.out.println("랜덤값의 총 합 : " + total);

	}

	public void method3() {

		// 사용자에게 양수를 입력받기
		// => 양수로 잘 입력했을 경우 => 1에서부터 사용자가 입력한 정수까지 1씩 증가되는 값 출력
		// => 양수가 아닌 숫자를 입력했을 경우 => 다시 입력받기

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {
			System.out.print("양수 : ");
			int num = sc.nextInt();

			if (num > 0) {

				for (int i = 1; i <= num; i++) {
					sum += i;
				}
				System.out.println("총 합 : " + sum);
				break;

			} else {
				System.out.println("다시 입력해주세요");
			}

		}
	}
}
