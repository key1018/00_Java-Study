package com.study.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ " ");
		}
	}
	
	public void practice2() {
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		// 사용에게 양의 정수만큼 배열 할당하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		// for 반복문을 활용하여 출력
		
		for(int i = 1; i <= arr.length; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
		
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruits[1]);
		
		}
	
	public void practice5() {
		
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int[] arr = new int[str.length()];

		int sum = 0; // 문자의 개수를 알려줄 변수

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				sum++;
			}
		}

		System.out.printf("%c의 개수 : %d", ch, sum);
	}
	
	public void practice6() {
		
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String[] season = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(0 <= num && num <= 6) {
			for(int i = 0; i <season.length; i++) {
				if(i == num) {
					System.out.println(season[i] + "요일");
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {
		
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0; // arr[i]의 총 합계를 얻을 변수
		
		// for반복문을 활용하여 arr[i]에 값 입력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();		
		}
		
		// for 반복문을 활용하여 arr[i] 값 추출하기
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num % 2 == 0 || num < 3) { // 입력한 정수가 홀수가 아니거나 3 미만일 경우
				System.out.println("다시 입력하세요");
				continue;
			}
			int[] arr = new int[num];

			// 배열의 중간 값 구하기
			int mid = arr.length / 2;
			
			// 출력될 값을 담을 배열
			int result = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i <= mid) { // 인덱스가 중간값보다 작을 경우
					arr[i] = ++result;
					System.out.print(arr[i] + ", ");
				} else { // 인덱스가 중간값보다 클 경우
					arr[i] = --result;
					System.out.print(arr[i] + ", ");
				}
			}
			break;
		}
	}
	
	public void practice9() {
		
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		String[] chicken = {"후라이드", "양념", "뿌링클","슈프림"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		int count = 0; // 치킨유무를 확인할 변수
		
		for (int i = 0; i < chicken.length; i++) {
			if (name.equals(chicken[i])) { // 입력한 값이 chicken[i]와 동일한 경우
				count++; // 변수 값 +1
				System.out.printf("%s치킨 배달 가능",chicken[i]);
			}
		}
		
		if(count == 0) { // 입력한 값이 chicken[i]와 동일하지 않은 경우
			System.out.printf("%s치킨은 없는 메뉴입니다.", name);
		}

	}
	
	public void practice10() {
		
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
	
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		
//		사용자에게 주민등록번호를 입력 받고 해당 문자열의 각 문자들을 char[] 에 옮겨 담은 원본 배열 만들
//		어 둔 후, 원본 배열은 그대로 유지한 채로 복사본 배열을 만들 때 성별 자리 이후부터는 ‘*’을 담은 후
//		하단의 결과처럼 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		for(int i = 0; i<ch.length; i++) {
			if(i <= 7) {
				System.out.print(str.charAt(i));
			} else {
				System.out.print("*");
			}
		}

	}
}

