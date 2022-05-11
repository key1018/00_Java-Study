package com.test1.run;

import java.util.ArrayList;

import com.test1.model.vo.Product;

public class ProductListTest {

	public static void main(String[] args) {

		ArrayList<Product> list = new ArrayList<>();
		
		// 1. add문 통해서 데이터 추가하기
		list.add(new Product("lipstick2", "맥 레드오렌지", "롯데백화점", 35000, 0.01));
		list.add(new Product("posdwer", "입생로랑 파우더", "신세계백화점", 58000, 0.04));
		list.add(new Product("pupp", "디올 퍼프", "현대백화점", 64000, 0.2));
		
		// for each문 활용하여 출력
		for(Product p : list) {
			System.out.println(p.information());
		}
		
		// 2. set문을 통해서 백화점, 가격 변경하기
		
		// for loop문 활용
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setProductArea("태평백화점");
			list.get(i).setPrice(50000);
		}

		System.out.println("===== 변경 후 =====");
		// for loop문 활용하여 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		
		// 3. get문을 활용해서 상품명, 부과세 포함 금액 출력하기
		
		System.out.println("===================");
		
		// for each문 활용하기
//		int sum = 0;
//		for (Product p : list) {
//			sum = (int) (p.getPrice() + (p.getPrice() * p.getTax()));
//
//			System.out.println("상품명 : " + p.getProductName());
//			System.out.println("부과세 포함 금액 : " + sum + "원");
//
//		}
		
		// for loop문 활용하기
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {

			sum = (int) (list.get(i).getPrice() + (list.get(i).getPrice() * list.get(i).getTax()));

			System.out.println("상품명 : " + list.get(i).getProductName());
			System.out.println("부과세 포함 금액 : " + sum + "원");
		}

	}

}
