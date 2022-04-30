package com.study.chap02.loop;

import java.util.Scanner;

// for 반복문
public class A_For {
	
	/*
	 * * 반복문 (for문, while문) - 특정 코드를 반복적으로 수행해주는 제어문
	 * 
	 * [표현법]
	 * 
	 * for(초기식; 조건식; 증감식) { 실행 코드; => ()안에 true일 경우 반복적으로 실행됨 }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 딱 한번만 실행되는 구문" 변수를 선언 및 초기화하는데 사용한다 (int i = 0; ==>
	 * 초기식)
	 * 
	 * - 조건식 : "true/false를 구분하여 반복문을 실행시킬 조건" true일 경우 : 반복문 실행 false일 경우 : 반복문 실행
	 * x i <= 5; ==> 조건식 (초기식에 선언된 i = 0이 5가 될떄까지 반복한다)
	 * 
	 * - 증감식 : 초기식에 선언된 변수 값을 증감시키는 구문 (증감을 통해 반복문을 제어한다) 초기식에 선언된 변수를 바탕으로 (++,
	 * --)를 사용한다 i++; 또는 i--;
	 * 
	 * 
	 * * for문의 순서
	 * 
	 * for문 실행 => 초기식 => true일 경우 실행되는 조건식 => 증감식 => 초기식 => true일 경우 실행되는 조건식 => 증감식
	 * => 초기식 => true일 경우 실행되는 조건식 => 증감식 -----------------위 행위를 계속
	 * 반복------------------- => 초기식 => false일 경우 조건식 실행 x
	 */

	public void method1() {

		// "Hello World" 5번 반복

		// 1. 일반적인 경우

		// System.out.println("Hello World"); // 5번 복붙하여 반복

		// 2. for 반복문 사용

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World");
		} // 변수 i가 1에서 5가 될떄까지 반복

		// System.out.println(i); => 변수 i 는 for안에서 선언됐기 때문에 for문 {}안에서만 사용할 수 있다

		// System.out.println("Hello World"); int i = 1(2)
		// System.out.println("Hello World"); int i = 2(3)
		// System.out.println("Hello World"); int i = 3(4)
		// System.out.println("Hello World"); int i = 4(5)
		// System.out.println("Hello World"); int i = 5(6)

		/*
		 * for(int i=1; i<=5; i++) 문이 아닌 for(int i=1; i>=5; i++) 일 때는 실행이 안된다 이유 : i >=
		 * 5 때문이다 => 현재 변수 i 의 값은 1에서부터 증가하는데 조건식인 i = 1 >= 5 를 봤을 때 false여서 실행이 안된다
		 * 그러므로 i = 1 <= 5 를 해줘야 true가 적용돼서 실행된다
		 */

		// 변수 i가 굳이 1부터 시작하지 않아도됨

		for (int j = 10; j < 15; j++) {
			System.out.println("Hello World");
		}

		// System.out.println("Hello World"); int j = 10(11)
		// System.out.println("Hello World"); int j = 11(12)
		// System.out.println("Hello World"); int j = 12(13)
		// System.out.println("Hello World"); int j = 13(12)
		// System.out.println("Hello World"); int j = 14(15)

	}

	public void method2() {

		// i 값이 1씩 증가하는 경우

		System.out.print("i 값이 1씩 증가하는 경우 : ");
		for (int i = 0; i <= 10; i++) {
			System.out.print(+i + " ");
		}

		System.out.println();

		System.out.print("i 값이 1씩 감소하는 경우2 : ");
		for (int i = -1; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}

		System.out.println();

		// i 값이 1씩 감소하는 경우
		System.out.print("i 값이 1씩 감소하는 경우 : ");
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("i 값이 1씩 감소하는 경우2 : ");
		for (int i = 11; i > 0; i--) {
			System.out.print(i - 1 + " ");
		}

		System.out.println();

		// i 값이 2부터 증가하는 경우
		System.out.print("i 값이 2씩 증가하는 경우 : ");
		for (int i = 0; i <= 50; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();

		// i 값이 2씩 감소하는 경우

		System.out.print("i 값이 2씩 감소하는 경우 : ");
		for (int i = 50; i >= 0; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// i 값이 2배속 증가하는 경우
		System.out.print("i 값이 2배속 증가하는 경우 : ");
		for (int i = 1; i <= 100; i *= 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 곱하기 또는 나누기를 할 때는 변수 i = 0 / i >= 0 / i <= 0 실행 x
		// => 0 * 2 = 0 이 계속 나오기 때문에 무한반복됨
		// => 0 / 2 = 0

		// i 값이 2배속 감소하는 경우
		System.out.print("i 값이 2배속 감소하는 경우 : ");
		for (int i = 100; i > 0; i /= 3) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public void method3() {

		// i = 1 ~ 10까지 홀수 값만 출력

		// 방법 1. for문안에 if문 넣기
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 방법 2. 증감문 활용하기
		for (int i = 1; i < 11; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		// i = 1 ~ 10까지 짝수 값만 출력

		// 방법 1. for문안에 if문 넣기
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 방법 2. 증감문 활용하기
		for (int i1 = 0; i1 < 11;) {
			System.out.print(i1 + " ");
			i1 += 2;
		}

		/*
		 * for 무한반복문
		 * 
		 * for(; ;) { System.out.println("안녕하세요"); }
		 */

	}

	public void method4() {

		// 1~10까지 모두 합한 값을 구하기

		// 방법 1.
		// int num = 1+2+3+4+....+ 9+10;

		// 방법 2. for문을 사용해서 더하기
		/*
		 * int sum = 0;
		 * 
		 * sum += 1; sum += 2; sum += 3; .... sum += 9; sum += 10; ==> 최종 계산식 : 0 + 1 +
		 * 2 + 3 + 4 + ...... + 9 + 10
		 * 
		 * 규칙 : 변수 sum = 0 에서 1씩 증감한 값을 누적해서 더하는 것이 반복적으로 실행함
		 * 
		 */

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum += i; // i값이 1~10까지 증가되기 때문에 반복을 통해 누적해서 더함
			// System.out.println("sum : " + sum); // i 값이 증가될 때마다 누적되는 합의 값 반복돼서 출력됨
			// ex) i = 1 => sum = 1, i = 2 => sum = 1 + 2; i = 3 => sum = 1 + 2 + 3 ...
			// 결국 i = 10까지 누적된 합이 10번 반복됨
		}

		System.out.println("1 ~ 10까지의 총 합 : " + sum);
		System.out.println();

		int sum2 = 0;

		for (int i = 2; i < 11; i *= 2) {
			sum2 += i;
			System.out.println("1~10까지 2의 배수 값의 합 : " + sum2);
		}

		System.out.println("1~10까지 2의 배수 값의 합 : " + sum2);
		// 2 + 4 + 8

	}

	public void method5() {

		Scanner sc = new Scanner(System.in);

		// 사용자한테 받은 값의 누적 합을 구하기

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		sc.nextLine();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += num;
		}

		System.out.println("num의 제곱값 : " + sum);
		// ex) num = 4일 경우 num은 i가 4가 될 때 까지 4번 반복한다
		// => sum은 i가 4가 될 때 까지 num = 4를 4번 더하므로 최종적으로 16값이 된다
		// 즉, num의 값을 x로 입력했을 때 i가 x가 될 때까지 x값을 x번 더하는 것으로 누적되어 합한 값은 "제곱값"이 된다

		int sum2 = 0;

		for (int i = 1; i <= num; i++) {
			sum2 += i;
		}

		System.out.println("1~num까지 합한 값 : " + sum2);
	}

	public void method6() {

		// if-else문을 이용하여 사용자한테 받은 값의 누적 합을 구하기

		Scanner sc = new Scanner(System.in);

		System.out.print("양수 : ");
		int num = sc.nextInt();
		sc.nextLine();

		int sum = 0;

		// 표현 1.
		if (num > 0) {

			for (int i = 1; i <= num; i++) { // if문이 true일 경우 for반복문 실행
				sum += i;

			}

			System.out.printf("1부터 %d까지 합 : %d\n", num, sum);

		} else {
			System.out.println("양수를 입력해주세요");
			return;
		}

		System.out.println();

		// 표현 2.

		int sum2 = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum2 += i;
				System.out.print(i);

				if (i <= num - 1) { // num = 10일 경우 : i <= 9 i는 1,2,3...10까지 증가
					System.out.print("+"); // i는 1,2,3...10까지 증가
				} else { // ==> i가 1~9까지는 i <= 9에 true므로 if안에 있는 구문 실행
					System.out.print("="); // ==> i가 10에 도달했을 때 i <= 9에 false므로 else안에 있는 구문 실행
				}
			}
		} else {
			System.out.println("양수를 입력해주세요.");
			return;
		}

		System.out.println(sum2);
		System.out.printf("1부터 %d까지 합 : %d\n", num, sum2);

	}

	public void method7() {

		/*
		 * * 랜덤값
		 * 
		 * java.lang.Math클래스에서 제공하는 random() 메소드 호출해서 실행할 때마다 매번 다른 랜덤값을 얻어낼 수 있음!
		 * 
		 * Math.random() 으로 호출시 ( import문 선언 필요 x) => 0.0 ~ 0.9999999 사이 실수인 랜덤값 발생 (
		 * 0.0 <= < 1.0 )
		 * 
		 */

		// int random = (int)(Math.random(); => Math.random()은 double형이므로 강제형변환 해줘야함

		/*
		 * 예시) 1 ~ 10까지의 랜덤값을 구하고 싶을 때
		 * 
		 * int random = (int)(Math.random() * 10 + 1); 0.0 <= < 1.0 0.0 * 10 == 0.0 <= <
		 * 1.0 + 10 == 10.0 0.0 <= <= 9.9999999 0.0 + 1 == 1 <= <= 9.9999999 + 1 ==
		 * 10.999999 최종 : (int) 1 <= < 10
		 * 
		 * int형으로 강제형변환을해서 소수점 아래값이 떨어짐
		 */

		/*
		 * Tip! 랜덤값 발생 범위 지정
		 * 
		 * (int)(Math.random() * 발생시킬 랜덤값 갯수 + 시작수)
		 * 
		 * ex) 11 ~ 20 (int)(Math.random() * 10 + 11) 0.0 <= < 1.0 0.0 * 10 = 0.0 <= <
		 * 1.0 * 10 = 10.0 ==> 0.0 ~ 9.9999999 0.0 + 11 = 11.0 <= < 10.0 + 11 = 21.0 ==>
		 * 11.0 ~ 20.99999999
		 */

		// 1~random의 누적 합 구하기

		// 표현 1
		int num = (int) (Math.random() * 10 + 1);

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println("1부터 " + num + "까지 누적 합 : " + sum);

		// 표현 2 if-else문 사용

		int sum2 = 0;

		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				sum2 += i;
				System.out.print(i);
				if (i <= num - 1) {
					System.out.print("+");
				} else {
					System.out.print("=");
				}

			}
		} else {
			System.out.println("잘못된 값입니다");
			return;
		}

		System.out.println(sum2);
		System.out.printf("1부터 %d까지의 합 : %d", num, sum2);

	}

	public void method8() {

		// 각 index 값을 뽑아서 출력하기

		String str = "Hello";
		// index = 01234

		/*
		 * H => str.charAt(0) 출력 e => str.charAt(1) 출력 l => str.charAt(2) 출력 l =>
		 * str.charAt(3) 출력 o => str.charAt(4) 출력
		 * 
		 * 0번 인덱스에서부터 4번 인덱스(문자열의 마지막)까지 매번 1씩 증가하는 인덱스
		 */

		for (int i = 0; i < 5; i++) {
			System.out.println(str.charAt(i));
		}

		String str2 = "안녕하세요";

		for (int i = 0; i < 5; i++) {
			System.out.print(str2.charAt(i));
		}

	}

	public void method9() {

		// 사용자에게 문자열을 받아서 출력

		/*
		 * apple => 5글자 (마지막인덱스 : 4) 01234
		 * 
		 * pineapple => 9글자 (마지막인덱스 : 8) 012345678
		 * 
		 * kiwi => 4글자 (마지막인덱스 : 3) 0123
		 * 
		 * 마지막인덱스 == 문자열의 길이 - 1
		 * 
		 * [문자열의 길이 표현식] str.length();
		 * 
		 * [문자열 index의 길이 표현식] str.length()-1;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("index의 길이 : " + (str.length() - 1));

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}

		/*
		 * for(int i=0; i<=str.length(); i++) { System.out.print(str.charAt(i)); }
		 * ======> 오류 발생
		 * 
		 * ex) str = apple인 경우 : index의 길이는 4, str.length()의 길이는 5 증감연산자에 의해
		 * str.charAt(5)까지 넘어가야하는데 출력받은 str의 index길이가 5로 넘어갈 수 없기 때문에 오류남 그러므로
		 * i<str.length() 로 수정을 해야한다
		 */
	}

	public void method10() {

		// 구구단 출력하기

		// 1. 2단 출력

		int dan = 2;

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		System.out.println();

		// 2. 사용자가 입력한 단을 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("단(2~9단)을 입력하세요 : ");
		int dan2 = sc.nextInt();
		sc.nextLine();

		if (dan2 >= 2) {
			for (int su = 1; su < 10; su++) {
				System.out.printf("%d x %d = %d\n", dan2, su, dan2 * su);
			}
		} else {
			System.out.println("단을 잘못입력하셨습니다. 다시 작성해주세요");
			return;
		}
		System.out.println();

		// 3. 3~12까지 random값으로 입력된 단을 출력하기

		int dan3 = (int) (Math.random() * 10 + 3);

		for (int su = 1; su < 10; su++) {
			System.out.printf("%d x %d = %d\n", dan3, su, dan3 * su);
		}
	}

	public void method11() {

		// 문자열, 문자열 및 인덱스 길이 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		int num = str.length(); // 문자열의 길이

		for (int i = 0; i < num; i++) { // i = index의 길이
			System.out.print(str.charAt(i));
			if (i < str.length() - 1) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}

		}
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("문자열 index의 길이 : " + (str.length() - 1));

	}

	public void method12() {

		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5

		// for 중첩문

		/*
		 * 바깥쪽 for문 : 고정된 행 안쪽 for문 : 고정된 행 안에서 반복적으로 실행되는 열
		 */

		for (int j = 1; j <= 3; j++) { // 고정된 행

			for (int i = 1; i < 10; i++) { // 행 안에서 반복적으로 실행되는 열
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// j가 1행일 때 i인 열은 j안에서 1~9까지 반복
		// j가 2행일 때 i인 열은 j안에서 1~9까지 반복
		// j가 3행일 때 i인 열은 j안에서 1~9까지 반복

	}

	public void method13() {

		/*
		 * // **** 문 출력
		 * 
		 * for(int i=1; i<=4; i++) { System.out.print("*"); }
		 */

		// ****
		// ****
		// ****
		// **** 출력

		for (int j = 1; j <= 4; j++) {

			for (int i = 1; i <= 4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 1*** => 1행 1열일 때 1출력
		// *2** => 2행 2열일 때 2출력
		// **3* => 3행 3열일 때 3출력
		// ***4 => 4행 4열일 떄 4출력
		// 즉, i == j 일 때 i 또는 j의 숫자출력

		for (int j = 1; j <= 4; j++) {

			for (int i = 1; i <= 4; i++) {

				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public void method14() {
		
		// 별찍기
		
//		      *  => 0000* ==> 1행 5열
//		     **	 => 000** ==> 2행 4,5열
//		    ***  => 00*** ==> 3행 3,4,5열
//		   ****  => 0**** ==> 4행 2,3,4,5열
//		  *****  => ***** ==> 5행 1,2,3,4,5열
//						  ==> i값에 따라 나타나는 *의 갯수도 똑같음			
		
		for(int i = 1; i <= 5; i++ ) { // 고정된 행
			
			for(int j = 1; j <= 5-i; j++) { // 고정된 행 안에서 반복되는 열1
				System.out.print(" ");		 
			}
			for(int k = 1; k <= i; k++) { // 고정된 행 안에서 반복되는 열2
				System.out.print("*");
			}
			System.out.println();
		}

//			int i = 1인 경우
//			for(int j = 1; j <= 5-i; j++) { // 고정된 행 안에서 반복되는 열1
//			System.out.print(" ");	
//			1 <= 4까지진행돼서 j가 5로 증감됐을 경우 false로 나와서 아래에 있는 for문으로 넘어감
//			이때, 나온 값의 1,2,3,4는 공백처리
//			
//			for(int k = 1; k <= i; k++) { // 고정된 행 안에서 반복되는 열2
//			System.out.print("*");		
//			1 <= 1 까지 진행돼서 k가 2로 증감됐을 때 fasle로 빠져나옴
//			이때, 나온 값의 1은 * 처리
//			
//			즉, [    *] 은 print문으로 인해 서로 옆으로 출력돼서 12341 순으로 출력된 것을 확인할 수 있다
		
	}
	
	 	public void method15() {
	 		
//	 		*
//	 		**
//	 		***
//	 		****
//	 		*****	
	 		
	 		
	 		for(int i = 1; i <= 5; i++) {
	 			
	 			for(int j = 1; j <= i; j++) {
	 				System.out.print("*");
	 			}
	 			System.out.println();
	 		}

	 	}
	 	
	 	
	 	public void method16() {
	 		
//			  ***** 	
//			   **** 	
//			    *** 	
//			     ** 	
//			      * 	
	 		
			for (int i = 1; i <= 5; i++) {

				for (int j = 5; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = 5; i >= 1; --i) {

				for (int j = 1; j <= i; ++j) {

					System.out.print("*");
				}

				System.out.println();
			}

		}
	 	
	 	public void method17() {
	 		
//	 	    *		*의 개수 : 1 	(2-1)
//	 	   ***		*의 개수 : 3	(4-1)
//	 	  *****		*의 개수 : 5	(6-1)
//	 	 *******	*의 개수 : 7	(8-1)
//	 	*********	*의 개수 : 9	(10-1) ==> 2의배수 - 1
	 			
			for (int i = 1; i <= 5; i++) {

				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (i * 2) - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

		public void method18() {

			// 2 ~ 9단까지 모든 구구단 총 출력

			for (int i = 2; i <= 9; i++) {
				System.out.println("====== " + i + "단 ======");

				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
				System.out.println();
			}

		}

		public void method19() {

			// 짝수만 구구단 출력

			for (int i = 1; i <= 9; i++) {

				if (i % 2 == 0) {
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j <= 9; j++) {

						System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
				}

			}
		}

		public void method20() {

			// 홀수만 구구단 출력

			for (int dan = 1; dan <= 9; dan++) {
				if (dan % 2 == 1) {
					System.out.println("=====" + dan + "단=====");
					for (int su = 1; su <= 9; su++) {
						System.out.printf("%d x %d = %d\n", dan, su, dan * su);
					}
				}
			}
		}

}
