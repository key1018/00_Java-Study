package com.test1.run;

import java.util.Scanner;

import com.test1.model.vo.Employee;
import com.test1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		
		// Student
		Student[] s = new Student[3];
		
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		// Employee
		
		Employee[] e = new Employee[10];
		int count = 0; // 입력한 정보 수를 확인할 변수
		Scanner sc = new Scanner(System.in);
		
		// while(true) 무한 반복문을 활용하여 출력
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			e[count++] = new Employee(name, age, height, weight, salary, dept);
			// 한 명씩 추가될 때마다 count수가 증가하도록 설정
			// count의 크기에 따라 입력한정보 담기
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			// ‘n’일 경우 더 이상 그만 입력 받기
			
			System.out.print("계속 추가하시겠습니까(Y/N)? ");
			String str = sc.nextLine().toLowerCase();
			
			if(str.equals("n")) {
				break;
			}
			
		}
		System.out.println("=============================================");
		for(int i = 0; i < count; i++) {
			// count수에까지 반복문 출력하도록 설정 
			System.out.println(e[i]);
		}

	}

}
