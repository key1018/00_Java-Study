package com.study.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	
	/*
	 * * continue
	 * 
	 * - 반복문 안에 기술되는 분기문
	 *   break;의 경우 실행되면 반복문 자체를 빠져나가지만,
	 *   continue;의 경우 실행되면 그 뒤의 구문이 실행되지 않고 다시 반복으로 돌아간다 
	 */
		
	public void method1() {
		
		// 1 3 5 7 9
		
		for(int i = 1; i < 10; i++) {
			
			if(i % 2 == 1) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
		
	}
	
	public void method2() {
		
		// 2 4 6 8 10 ... 20
		
		for(int i = 1; i < 21; i++) {
			
			if(i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
	}
	
	public void method3() {
		
		// 1 ~ 50 까지 출력하는데 5의 배수는 출력 x
		
		for(int i = 1; i<51; i++) {
			
			if(i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
	
	public void method4() {
		
		// 1 ~ 사용자가 입력한 숫자까지 출력하여 총 합계 구하기
		// 단, 5의 배수는 출력 x
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.printf("1부터 %d까지 합 : %d",num, sum);
	}
	
	public void method5() {
		
		// 2단 ~ 9단까지 싹 다 출력
		// 단, 3의 배수단은 출력 x 
		
		// 2 ~ 9단까지 1씩 증가 => 바깥쪽 for문
		// 매단마다 곱해진ㄴ 수 1~9까지 1씩 증가 => 안쪽 for문
		
		for (int dan = 2; dan <= 9; dan++) {

			if (dan % 3 == 0) {
				continue;
			}

			System.out.printf("====== %d단 ======\n", dan);

			for (int su = 1; su <= 9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan * su);
			}
		}

	}

}
