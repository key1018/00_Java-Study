package com.study.programmers;

import java.util.Scanner;

public class Level1 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
