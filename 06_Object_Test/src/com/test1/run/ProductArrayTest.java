package com.test1.run;

import java.util.Scanner;

import com.test1.model.vo.Product;

public class ProductArrayTest {

	public static void main(String[] args) {

		Product[] pd = new Product[3];
		/*
		// 방법 1. 입력한 값을 for 반복문을 통해 추출하기
		
		// 각 객체 생성
		
		pd[0] = new Product("lipstick2", "맥 레드오렌지", "롯데백화점", 35000, 0.01);
		pd[1] = new Product("posdwer", "입생로랑 파우더", "신세계백화점", 58000, 0.01);
		pd[2] = new Product("pupp", "디올 퍼프", "현대백화점", 64000, 0.01);
		
		// for 반복문을 활용하여 결과값 출력
		
		for(int i = 0; i <pd.length; i++) {
			System.out.println(pd[i].information());
		}
		
		System.out.println();
		// setter메소드를 통해 모든 객체의 가격 및 부과세 수정
		
		for(int i = 0; i < pd.length; i++) {
			pd[i].setPrice(70000);
			pd[i].setTax(0.03);
			System.out.println("변경후 => " + pd[i].information());
		}
		System.out.println();
		// for반복문을 활용하여 모든 객체의 상품명 및 부과세포함금액 출력
		
		for(int i = 0; i < pd.length; i++) {
			System.out.println("상품명 = " + pd[i].getProductName());
			System.out.println("부과세 포함 금액 : " + (pd[i].getPrice() + (int)(pd[i].getPrice() * pd[i].getTax())) + "원");
		}
		*/
		
		// 방법 2. 사용자에게 값을 입력받가 객체 생성과 동시에 초기화
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 입력한 값들의 총 합계 금액을 확인하는 변수
		
		for(int i = 0; i<pd.length; i++) {
			System.out.print("ID : ");
			String id = sc.nextLine();
			
			System.out.print("상품명 : ");
			String name = sc.nextLine();
			
			System.out.print("지역 : ");
			String area = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("부과세율 : ");
			double tax = sc.nextDouble();
			sc.nextLine();
			
			pd[i] = new Product(id, name, area, price, tax);
			
			sum += pd[i].getPrice(); // 입력한금액의 총 합계
		}
		
		for(int i = 0; i < pd.length; i++) {
			System.out.println(pd[i].information());
			System.out.println("상품 총 합계 금액 : " + sum);
		}
		
		// 사용자가 찾고자하는 상품명을 입력하면 정보가 추출되는 서비스 기능 구현
		
		System.out.print("찾고자하는 상품명을 입력하세요 : ");
		String search = sc.nextLine();
		
		int result = 0; // 찾고자하는 상품의 유무 확인하는 변수
		
		for(int i = 0; i < pd.length; i++) {
			if(pd[i].getProductName().equals(search)) {
				System.out.println(pd[i].information());
				result++; // 있으면 +1
			}
		}
		
		if(result == 0) {
			System.out.println("찾으시는 상품이 없습니다.");
		}

	}

}
