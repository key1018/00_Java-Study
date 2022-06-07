package com.study.codeup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		// 1022번

		System.out.print("문장 : ");
		String str = sc.nextLine();

		// 1023번

		System.out.print("실수 입력 : ");
		String d = sc.nextLine();

		String[] arr = d.split("\\.");

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 숫자 : " + arr[i]);
		}
		
		
		// 1024번
		
		// 단어를 한 개 입력받기
		
		System.out.print("문장 입력 : ");
		String s = sc.nextLine();
		
		// for 반복문과 charAt(i)를 활용하여 문장 각 위치에 해당하는 문장을 하나씩 출력하기
		for(int i = 0; i < s.length(); i++) {
			System.out.println("'" + s.charAt(i) + "'");
		}
		
		// 1025번	
		
		// 방법 1.
		// 다섯 자리의 정수 문자열로 입력받기
		System.out.print("다섯자리의 정수 입력 : ");
		String str = sc.nextLine();
		
		int arr[] = new int[str.length()];
		
		// 문자열에 있는 문자로된 숫자들 각각의 int형 정수로 변환하기
		for (int i =0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		// int 정수로 바꾼 정수들을 for반복문으로 문자들의 각자리에 맞게 10의 자리수를 곱하여 출력하기
		for(int i = 0; i < arr.length; i++) {
			System.out.println("[" + arr[i] * (int)Math.pow(10, arr.length - (i+1)) + "]");
		}
		
		// 방법 2.
		System.out.print("다섯자리의 정수 입력 : ");
		int i = sc.nextInt(); // 75254

		int num5 = (i / 10000) * 10000; // 70000
		int num4 = ((i / 1000) % 10) * 1000; // 5000
		int num3 = ((i / 100) % 10) * 100; // 200
		int num2 = ((i / 10) % 10) * 10; // 50
		int num = i % 10; // 4

		System.out.println("[" + num5 + "]");
		System.out.println("[" + num4 + "]");
		System.out.println("[" + num3 + "]");
		System.out.println("[" + num2 + "]");
		System.out.println("[" + num + "]");
		
		*/
		
		// 1026번
		System.out.print("시간(시/분/초) : ");
		String time = sc.nextLine();

		String[] arr = new String[3];
		
		// StringTokenizer로 ":"마다 데이터 끊어주기
		StringTokenizer stk = new StringTokenizer(time, ":");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = stk.nextToken();
		}
		System.out.println("분 : " + arr[1]);
		
		
		// 1027번
		
		// 방법 1.
		System.out.print("날짜 : ");
		String date = sc.nextLine();
		
		StringTokenizer stn = new StringTokenizer(date, ".");
		
		Date d = new Date();
		
		d.setYear(Integer.parseInt(stn.nextToken()) - 1900);
		d.setMonth(Integer.parseInt(stn.nextToken()) - 1);
		d.setDate(Integer.parseInt(stn.nextToken()));
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String format = sdf.format(d);
		
		System.out.println(format);
		
		// 방법 2.
		
		System.out.print("날짜 : ");
		String date2 = sc.nextLine();

		String[] arr2 = date2.split("\\.");

		int year = Integer.parseInt(arr2[0]);
		int month = Integer.parseInt(arr2[1]);
		int day = Integer.parseInt(arr2[2]);

		System.out.printf("%02d-%02d-%04d", day, month, year);

	}

}
