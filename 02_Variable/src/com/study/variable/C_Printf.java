package com.study.variable;

import java.util.Scanner;

public class C_Printf {

	public void printfTest() {

		/*
		 * System.out.printf = (포맷 , 값, 값) 을 넣는 형식이다 출력하고자 하는 값들이 출력 형식에 맞춰서 출력된다 하지만,
		 * 줄바꿈이 안되므로 \n 또는 %n을 사용하여 줄바꿈을 해주어야한다
		 * 
		 * 
		 * * 키워드 * 1. %d : 정수 2. %f : 실수 3. %c : 문자 4. %s : 문자열 (문자도 가능)
		 */

		int num1 = 10;
		int num2 = 20;

		// 출력받고자 하는 값 : 10 20
		System.out.println(num1 + " " + num2);
		System.out.printf("%d + %d%n", num1, num2);

		// 위와 아래의 소스코드는 동일하다
		// 첫 번째 %d에는 num1의 숫자가 삽입되고, 두 번째 %d에는 num2의 숫자가 출력된다

		System.out.printf("%d%n", num1, num2); // 에러발생 x
		// System.out.printf("%d %d%n", num1); // 에러발생 o
		// => 두 번째 %d에 들어가야할 값이 없어서 에러가 발생한다

		System.out.printf("%5d%n", 123);
		// 5칸의 공간을 확부 후 오른쪽정렬 (음수면 왼쪽)
		// ex) %5d = 123 => [ ] 공간 확보 후 오른쪽부터 정렬 => [ 1] => [ 12] => [ 123]
		System.out.printf("%-5d%n", 123);
		// 5칸의 공간을 확부 후 왼쪽정렬
		// ex) %-5d = 123 => [ ] 공간 확보 후 오른쪽부터 정렬 => [3 ] => [23 ] => [123 ]
		System.out.printf("%10d%n", num1);
		System.out.printf("%-10d%n", num1);
		System.out.printf("%3d%n", 123456);
		System.out.printf("%6d%n", 250);

		double dNum = 3.145;
		float fNum = 123.478f;
		char ch = 'n';
		String str = "rainbow";

		System.out.printf("dNum : %f, fNum : %.3f, ch : %c, str : %s\n", dNum, fNum, ch, str);

		// %c와 %s의 경우 소문자, 대문자에 따라 출력되는 값이 다르다
		// ==> %c %s : 소문자 출력, %C %S : 대문자 출력
		System.out.println("============");
		System.out.printf("문자 : %c, 문자열 : %s\n", ch, str);
		System.out.printf("문자 : %C, 문자열 : %S\n", ch, str);

	}

	public void printfTest2() {

		String 이름 = "홍길동";
		int 학번 = 20220414;
		String 수강과목 = "회계원리";
		double 점수 = 98.7;
		char 학점 = 'A';

		System.out.printf("%s님(학번 : %d)의 수강과목은 %s입니다.\n" + "중간 및 기말 평균 점수는 %.1f점입니다. 학점은 %c입니다.%n", 이름, 학번, 수강과목, 점수,
				학점);

		/*
		 * %f는 항상 소수점 여섯번째 자리까지 모두 출력이 된다 %.1f의 경우 : %.xf일 때 소수점 뒤에 x번 까지만 출력이 된다 ex)
		 * double = 183.45678967 => %f : 183.456790 ( 소수점 7번째인 6이 반올림된다 ) => %.3f :
		 * 183.457 ( 소수점 4번째인 7이 반올림된다 )
		 */

	}

	public void printfTest3() {

		// Scanner을 통해 printf에 대입하기

		Scanner sc = new Scanner(System.in);

		System.out.print("반갑습니다. 성함을 입력해주세요 : ");
		String name = sc.nextLine();

		System.out.print("몸무게를 입력해주세요 : ");
		double weight = sc.nextDouble();
		sc.nextLine();

		System.out.print("하고있는 운동이 있나요(Y/N)? ");
		char what = sc.nextLine().charAt(0);

		System.out.print("무슨 운동을 하고 있나요? ");
		String exercise = sc.nextLine();

		System.out.print("일주일 중 운동하는 일은 며칠인가요? ");
		int time = sc.nextInt();
		sc.nextLine();

		System.out.printf(
				"==========\n성함 : %s%n몸무게 : %.2fkg\n" + "운동 여부 : %c\n현재 하고있는 운동 : %s\n" + "일주일 중 운동하는 일 : %d\n", name,
				weight, what, exercise, time);
	}

}
