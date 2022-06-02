package com.study.codeup;

import java.util.Scanner;

public class CodeTest {

	public static void main(String[] args) {

		// 1022번
		Scanner sc = new Scanner(System.in);

		System.out.print("문장 : ");
		String str = sc.nextLine();

		// 1023번

		System.out.print("실수 입력 : ");
		String d = sc.nextLine();

		String[] arr = d.split("\\.");

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 숫자 : " + arr[i]);
		}

	}

}
