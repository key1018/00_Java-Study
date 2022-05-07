package com.test1.run;

import java.util.Scanner;

import com.test1.model.vo.Cat;
import com.test1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		// Dog
		/*
		// 크기 5인 dog배열 만들기
		Dog[] d = new Dog[5];
		
		//사용자에게 정보 입력받기
		Scanner sc = new Scanner(System.in);	
		
		int count = 0; // 입력한 수를 확인할 변수
		
		for(int i = 0; i < d.length; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("종 : ");
			String kinds = sc.nextLine();
			System.out.print("몸무게 : ");
			int weight = sc.nextInt();
			sc.nextLine();
			
			d[i] = new Dog(name, kinds, weight);
			count++;
			
			System.out.print("계속 입력하시겠습니까(Y/N)? ");
			String str = sc.nextLine().toUpperCase();
			
			if(str.equals("N")) {
				break;
			}
		}
		
		for(int i = 0; i < count; i++) {
			d[i].speak();
		}
		*/
		
		// Cat
		
		Cat[] c = new Cat[5];
		
		c[0]= new Cat("야통이", "코리안숏헤어", "충남", "고등어");
		c[1]= new Cat("삼색이", "코리안숏헤어", "서울", "삼색이");
		c[2]= new Cat("무", "코리안숏헤어", "전남", "고등어");
		c[3]= new Cat("뚱땅이", "렉돌", "뉴욕", "검정색");
		c[4]= new Cat("래기", "뱅갈", "상하이", "고등어");
		
		// 향상된 for문을 활용하여 출력
		for(Cat cat : c) {
			cat.speak();
		}
	}

}
