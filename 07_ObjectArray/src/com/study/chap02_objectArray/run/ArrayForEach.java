package com.study.chap02_objectArray.run;

import java.util.Scanner;

import com.study.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {


int[] arr = {10,20,30};
		
		//for loop문
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		/*
		 * * for each문 (향상된 for문) => 자바 5버전 이상부터만 사용 가능
		 * - 배열 또는 컬렉션과 함께 사용됨
		 * - 0번인덱스 ~ 마지막인덱스까지 순차적으로 모두 접근하고자 할 때 사용
		 *   => 중간인덱스까지 접근하려고하면 사용 불가능!!!
		 * 
		 * [표현법]
		 * for(순차적으로 접근된 값을 담을 변수 선언 : 순차적으로 접근할 배열) { // 반복횟수 == 배열의 크기
		 * 		
		 * }
		 * 
		 */
		
		//		int   : int[]
		for(int value : arr) { // value=arr[0] => value=arr[1] => value=arr[3]
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3]; // 크기 3칸짜리 배열 생성 ==> 객체 생성 x
		
		phones[0] = new Phone("벨벳폰", "엘지", 1000000, "없음");
		phones[1] = new Phone("아이폰", "애플", 1300000, "12pro");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "노트20");
		
		int sum = 0;
		
		for(Phone p : phones) {
			System.out.println(p.information());
			sum += p.getPrice();
		}
		
		System.out.println("총 가격 : " + sum);
		System.out.println("평균가 : " + (sum/3));
		
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자하는 핸드폰 : ");
		String buy = sc.nextLine();

		//	Phone	:	Phone[]
		for (Phone p : phones) {
			if (p.getName().equals(buy)) {
				System.out.println("가격 : " + p.getPrice() + "원");
			}
		}

	}

}
