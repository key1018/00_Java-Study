package com.study.chap02.loop;

import java.util.Scanner;


// while 반복문
public class B_While {
	
	/*
	 *  * for문 
	 *   : 반복횟수가 정해진 경우 사용
	 *   
	 *  [표현법]
	 *  
	 *  for(초기식; 조건식; 증감식) {
	 * 		반복적으로 실행할 코드;
	 * }
	 * 
	 *  * while문
	 *   : 반복횟수가 안정해져있을 때 사용 => 특정 조건을 만족할 때까지 수행해야되는 경우 사용
	 *   
	 *   [표현법]
	 *   
	 *   [초기식;] => 생략가능
	 *   while (조건식) {
	 *   	반복적으로 실행할 코드;
	 *  	[증감식;] => 생략가능
	 *  }
	 */
	
	
	public void method1() {
		
		// "안녕하세요" 5번 반복
		
		int i = 0;		
		while (i<5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		// "Hello World" 10번 반복
		
		int num = 0;
		while (num<10) {
			System.out.println("Hello World");
			num++;
		}
		
	}
	
	public void method2() {
		
		// 1 3 5 7 9 
		
		
		// 방법 1
		int i = 1;
		while(i<=10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		// 방법 2
		
		int j = 1;
		while(j<=10) {
			if(j % 2 == 1) {
				System.out.print(j + " ");
			}
			j++;		
		}
	
	}
	
	
	public void method3() {
		
		// 0 2 4 6 8 10
		
		// 방법 1
		int i = 0;
		while(i<=10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		// 방법 2
		
		int num = 0;
		while(num<11) {
			System.out.print(num + " ");
			num += 2;
		}
	}
	
	public void method4() {
		
		// 5 ~ 랜덤값(5~99)의 총 합계
		
		/*
		// 표현 1
		int random = (int)(Math.random() * 95 + 5);
		
		int sum = 0;
		
		int i = 5;
		while(i<=random) {
			sum += i;
			i++;
		}
		
		System.out.println("random값 : " + random);
		System.out.printf("1부터 %d까지 총 합 : %d", random, sum);
		*/
		
		// 표현 2
		
		int random = (int) (Math.random() * 95 + 5);

		int sum = 0;
		
		int i = 5;
		while(i <= random) {
			System.out.print(i);
			
			if(i < random) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		System.out.println("random값 : " + random);
		System.out.printf("1부터 %d까지 총 합 : %d", random, sum);
	
	}
	
		public void method5() {
			
			// 사용자에게 문자열 입력받아서 각 인덱스별 문자 뽑아서 출력
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			int num = str.length(); // 문자열의 길이
			int num2 = str.length()-1; // index의 길이
			
			/*
			// 표현 1 
			int i = 0;
			while(i<num) {
				System.out.println(str.charAt(i) + " ");
				i++;
			}
			
			System.out.println(str);
			*/
			
			// 표현 2
			
			int i = 0;
			while (i<num) {
				System.out.print(str.charAt(i));
				if (i < num2) {
					System.out.print(" + ");
				} else {
					System.out.print(" = ");
				} 
				i++;
			}
			
			System.out.println(str);
			System.out.println("문자열의 길이 : " + num);
			System.out.println("문자열 index의 길이 : " + num2);
			
		}
		
		public void method6() {
			
			/*
			 * * 무한반복문
			 * 
			 * for문
			 * 
			 * [표현법]
			 * 
			 *  for( ; ; ) {
			 * 		실행 코드
			 *  }	
			 * 
			 * while문
			 * 
			 * [표현법]
			 * 
			 * while(true) {
			 * 		실행 코드
			 * }
			 */
			Scanner sc = new Scanner(System.in);
			
			
			while(true) {
				
				System.out.println("1. 축구");
				System.out.println("2. 농구");
				System.out.println("3. RPG");
				System.out.println("4. 어드벤쳐");
				System.out.println("5. 공포");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴를 선택하세요 > ");
				int i = sc.nextInt();
				
				switch(i) {
				case 1 : System.out.println("축구 게임을 시작합니다."); break;
				case 2 : System.out.println("농구 게임을 시작합니다."); break;
				case 3 : System.out.println("RPG 게임을 시작합니다."); break;
				case 4 : System.out.println("어드벤쳐 게임을 시작합니다."); break;
				case 5 : System.out.println("공포 게임을 시작합니다."); break;
				case 0 : System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다."); return;
				default : System.out.println("번호를 다시 입력해주세요.");
				}
				System.out.println();
			}
			
		
		}
		
		public void method7() {
			
			// 사용자가 입력한 값에 따라 메소드 출력
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("======프로그램======");
				System.out.println("1. 문자열 5번 반복");
				System.out.println("2. 1부터 10까지 홀수 출력");
				System.out.println("3. 0부터 10까지 쪽수 출력");
				System.out.println("4. 5부토 랜덤값까지의 총 합계");
				System.out.println("5. 문자열의 각 인덱스별 문자 뽑아서 출력");
				System.out.println("6. 게임 프로그램 출력(무한반복)");
				System.out.println("0. 프로그램 종료");
				System.out.println("번호를 입력하세요 > ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1 : method1(); break;
				case 2 : method2(); break;
				case 3 : method3(); break;
				case 4 : method4(); break;
				case 5 : method5(); break;
				case 6 : method6(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				}
				System.out.println();
			}
				
				
			}
		
		public void method8() {
			
			/*
			 * do-while문
			 * 
			 * do {
			 * 		반복적으로 실행할 코드;
			 * } while (조건식);
			 * 
			 * => 최초 한 번은 무조건 실행됨
			 * 
			 */
				
				// 첫 조건이 false인 경우
				
				int num = 1;
				
				do {
					System.out.println(num);
				} while(num < 0);
				
			// 1 ~ 사용자가 입력한 값까지의 합계
				
				Scanner sc = new Scanner(System.in);
				System.out.print("양수 입력 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				int sum = 0;
				
				int i = 1;
				do {
					sum += i;
					i++;
				} while (i <= num2);
				
				System.out.println("1부터 " + num2 +"까지의 합 : " + sum);
				
				// 반복적으로 사용자에게 문자열을 입력받고 해당 문자열의 길이 출력
				// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복 수행 X
				
				String str = "";
				
				do {
					System.out.println("문자열 입력(종료하고자하면 exit입력) : ");
					str = sc.nextLine();

					System.out.println("문자열의 길이 : " + str.length());

				} while (!"exit".equals(str));
				{
					System.out.println("입력을 종료합니다.");
					return;
				}

			}

}
