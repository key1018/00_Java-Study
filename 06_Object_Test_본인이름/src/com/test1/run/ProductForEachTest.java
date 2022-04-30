package com.test1.run;

import java.util.Scanner;

import com.test1.model.vo.Product;

public class ProductForEachTest {

	public static void main(String[] args) {

		// 배열 생성 ==> 객체x
		Product[] pro = new Product[3];
		
		// 객체생성
		pro[0] = new Product();
		pro[1] = new Product("ssgnote20X12", "갤럭시S20", "한국", 1200000, 0.01);
		pro[2] = new Product("lgpgoesX123", "샤오미", "중국", 890000, 0.02);
		
		pro[0].setProductId("iphones");
		pro[0].setProductName("아이폰13");
		pro[0].setProductArea("미국");
		pro[0].setPrice(1490000);
		pro[0].setTax(0.1);
		
		// for-each문을 활용하여 전체 값 출력하기
		
		for(Product product : pro) { // 배열이 아닌 객체를 호출해야함
			System.out.println(product.information());
		}
		
		// for-each문을 활용하여 구매하고자하는 물건의 가격 출력하기
		
		Scanner sc = new Scanner(System.in);

		System.out.print("구매하고자하는 핸드폰명을 입력해주세요 : ");
		String buy = sc.nextLine();

		int count = 0; // 구매하고자하는 핸드폰명의 유무를 확인하는 변수

		for (Product product : pro) {
			if (product.getProductName().equals(buy)) {
				System.out.println("구매하고자하는 " + product.getProductName() + "의 가격은 " + product.getPrice() + "원 입니다.");
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("구매하고자하는 핸드폰이 없습니다.");
		}
		
		// for-each문을 활용하여 찾는 물건의 가격을 변경한 후 출력하기
		
		int result = 0; // 변경하고자하는 물건의 유무를 확인하는 변수
		
		System.out.print("\n변경하고자하는 핸드폰명 : ");
		String change = sc.nextLine();
		
		for (Product product : pro) {
			if (product.getProductName().equals(change)) {
				System.out.print("\n변경된 가격 : ");
				product.setPrice(sc.nextInt());
				System.out.println("변경된 " + product.getProductName() + "의 정보 - " + product.information());
				result++;
			}
		}

		if (result == 0) {
			System.out.println("변경하고자하는 핸드폰의 정보가 없습니다.");
		}

	}

}
