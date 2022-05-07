package com.test2.run;

import java.util.Scanner;

import com.test2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		// 크기가 10인 배열생성
		Student[] std = new Student[10];

		// while 무한반복문을 통해 사용자 입력받기

		Scanner sc = new Scanner(System.in);
		int count = 0; // 학생 수를 체크할 변수
		int sum = 0; // 학생들의 총 점수를 출력하기위한 변수

		while (true) { // 무한반복문을 통해 사용자에게 정보 입력받기

			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();

			System.out.print("학생 정보를 계속 입력하시겠습니까?(Y/N) : ");
			String str = sc.nextLine().toUpperCase(); // String method중 입력하면 모두 대문자로 변경하도록 코드생성

			std[count++] = new Student(grade, classroom, name, kor, eng, math);
			// 학생들의 수 만큼 객체 생성

			if (str.equals("N")) {
				break;
			}

		}

		for (int i = 0; i < count; i++) { // for반복문을 활용하여 학생들의 수 만큼 정보 입력
			sum = std[i].getKor() + std[i].getEng() + std[i].getMath();
			System.out.println(std[i].information() + ",  평균점수 : " + (sum / 3) + "점");
		}

	}

}
