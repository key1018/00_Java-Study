package com.test1.run;

import com.test1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {


		// 매개변수생성자로 3개 객체 생성
		
		Product pd1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product pd2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product pd3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(pd1.information());
		System.out.println(pd2.information());
		System.out.println(pd3.information());
		
		// 각 객체의 가격을 120만원, 부과세율을 0.05로 변경
		
		pd1.setPrice(1200000);
		pd2.setPrice(1200000);
		pd3.setPrice(1200000);
		pd1.setTax(0.05);
		pd2.setTax(0.05);
		pd3.setTax(0.05);
		
		System.out.println("========================================================================");
		System.out.println(pd1.information());
		System.out.println(pd2.information());
		System.out.println(pd3.information());
		
		System.out.println("상품명 = " + pd1.getProductName());
		System.out.println("부과세 포함 가격 = " + (pd1.getPrice() + (int)(pd1.getPrice() * pd1.getTax())) + "원");
		System.out.println("상품명 = " + pd2.getProductName());
		System.out.println("부과세 포함 가격 = " + (pd2.getPrice() + (int)(pd2.getPrice() * pd2.getTax())) + "원");
		System.out.println("상품명 = " + pd3.getProductName());
		System.out.println("부과세 포함 가격 = " + (pd3.getPrice() + (int)(pd3.getPrice() * pd3.getTax())) + "원");
	}

}
