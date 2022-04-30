package com.study.chap02_objectArray.run;

import java.util.Scanner;

import com.study.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {



		Phone[] phones = new Phone[3]; // phone타입의 값을 3개 담을 수 있는 메모리를 만듬
		// ==> 객체생성 x
		//	Heap 공간에 Phone의 주소값만이 들어가는 메모리만 생성됨
		
		// phones[0].setName("아이폰"); // NullPointException 오류 발생
		
		phones[0] = new Phone(); // 기본생성자로 객체생성
		phones[1] = new Phone("아이폰", "사과", 1300000, "12pro"); //매개변수생성자로 객체생성
		phones[2] = new Phone("은하수", "샘송", 1200000, "S20");
		
		phones[0].setName("벨벳폰");
		phones[0].setBrand("헬지");
		phones[0].setPrice(1000000);
		
		int sum = 0;
		
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i].information());
			sum += phones[i].getPrice();
		}

		System.out.println("총 가격 : " + sum + "원");
		System.out.println("평균가 : " + (sum / 3) + "원");
		
		System.out.println("=========================");
		
		// 사용자에게 구매하고자하는 핸드폰명을 입력받아
		// 해당 핸드폰의 가격을 알려주도록 하는 서비스 기능 구현
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();

		for (int i = 0; i < phones.length; i++) {
			if (phones[i].getName().equals(buy)) {
				System.out.println("당신이 구매하고자하는 핸드폰의 가격은 " + phones[i].getPrice() + "원 입니다.");
			}
		}

	}

}
