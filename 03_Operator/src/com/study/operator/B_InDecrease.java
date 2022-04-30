package com.study.operator;

import java.util.Scanner;

// 클래스명 : 증감연산자
public class B_InDecrease {
	
public void method1() {
		
		/*
		 * * 증감연산자 (단항 연산자) => 정수값으로만 활용
		 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
		 * 		++변수    변수++
		 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자
		 * 		--변수    변수--
		 * 
		 * (증감연산자)변수 : 전위연산 => "선증감" 후처리
		 * ex) ++1 = 2로 출력 
		 * 	   --3 = 2로 출력	
		 * 변수(증감연산자) : 후위연산 => 선처리 "후증감"
		 * ex) 1++ = 1로 출력되고 2로 저장
		 *     3-- = 3으로 출력되고 2로 저장
		 */
		
		int num1 = 20;
		
		System.out.println("num1 : " + num1); // 20
		System.out.println("num1 증감연산 1회 실행 후 : " + (++num1)); // 21
		System.out.println("num1 증감연산 2회 실행 후 : " + (num1++)); // 21(22)
		
		++num1; // 23
		
		System.out.println("num1의 최종 값 : " + num1); // 23
		
		int num2 = 25;
		
		System.out.println();
		System.out.println("num2 : " + num2); // 25
		System.out.println("num2 증감연산 1회 실행 후 : " + (--num2)); // 24
		System.out.println("num2 증감연산 2회 실행 후 : " + (num2--)); // 24(23)
		
		--num2; // 22

		System.out.println("num2 최종 값 : " + num2); // 22

	}

	public void method2() {

		int a = 15;
		int b = ++a;  // 전위연산이 먼저 실행돼서 a = 15, b = 16 값을 출력됨
		
		// a : xx, b : xx
		
		System.out.printf("a: %d, b : %d \n", a, b);
		
		int c = 19;
		int d = c++; // 19 출력 후(d에 대입) 20으로 증가 => c에 대입
		// 1. int d에 c의 값을 먼저 대입 : d = 19
		// 2. 후에 c에 20이 대입 : c = 20
		
		System.out.printf("c : %d, d : %d \n", c, d);
		System.out.println();
		System.out.println("===============");
		
		int e = 127;
		int f = e++;
		// f에 127이 먼저 대입 후 128이 저장되어 e에 저장됨
		// => f = 127, e = 128
		
		System.out.printf("e : %d, f : %d\n", e, f);
		
		int num1 = 35;
		int result1 = ++num1 * 3;
		// 전위연산(++num1)이 먼저 출력돼서 num1 = 36이 됨
		// result1은 num1 = 36 * 3 => 108의 값이 됨
		
		System.out.printf("num1 : %d, result1 : %d \n"
				, num1, result1);
		
		int num2 = 12;
		int result2 = num2++ * 5; // num2 = 12(13)
		// num2의 값 12가 먼저 출력돼서 result2에 대입 => result값 : 12 * 5 = 60
		//num2에는 후에 출력된 13이 대입 => num2 = 13
				
		System.out.printf("num2 : %d, result2 : %d \n"
				, num2, result2);	
				
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1의 값 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		++num1;
		 
		System.out.print("num2의 값 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		
		// ex) num1 = 10, num2 = 20
		//		=> num1 = 11로 출력되어 총합은 31이 된다.
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num3의 값 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		// num3++; // 10(11)
		// System.out.printf("num3 : %d\n", num3);
		// 10이 출력할 곳이 없으므로 저장된 11의 값이 최종출력된다
		
		System.out.printf("num3 : %d\n", num3++); // 10(11)
		
		System.out.print("num4의 값 : "); // 20
		int num4 = sc.nextInt();
		sc.nextLine();

		System.out.println("num3 + num4 : " + (num3 + num4)); // 11 + 20 = 31
		// num3의 값이 이미 출력됐으므로 마지막에는 저장된 값이 출력된다

	}

}
