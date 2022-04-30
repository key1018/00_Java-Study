package com.test3.run;

import java.util.Scanner;

import com.test3.model.vo.Music;

public class MusicTest {

	public static void main(String[] args) {
		
//		private String artist;
//		private String album;
//		private String drop;
//		private double time;
//		private int price;		
		
		/*
		// 1. 기본 및 매개변수 메소드에 직접 값을 입력하여 초기화하기
		
		Music ms1 = new Music();
		
		// 기본생성자로 값 초기화
		
		ms1.setArtist("샘 스미스");
		ms1.setAlbum("Love me more");
		ms1.setDrop("2022.04.29");
		ms1.setTime(3.11);
		ms1.setPrice(42000);
		
		// 매개변수생성자로 값 초기화
		
		Music ms2 = new Music("테일러 스위프트", "willow", "2020.12.11", 4.03, 38900);
		Music ms3 = new Music("오혁", "톰보이", "2017.04.24", 4.08, 16900);
		
		
		// 출력
		
		System.out.println(ms1.information());
		System.out.println(ms2.information());
		System.out.println(ms3.information());
		*/
		
		/*
		// 방법 2. 사용자에게 입력받은 값을 추출하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가수 : ");
		String artist = sc.nextLine();
		
		System.out.print("앨범명 : ");
		String album = sc.nextLine();
		
		System.out.print("발매일 : ");
		String drop = sc.nextLine();
		
		System.out.print("러닝타임 : ");
		double time = sc.nextDouble();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Music ms1 = new Music(artist,album, drop, time, price);
		
		System.out.println(ms1.information());
		*/
		
		// 방법3. for반복문을 활용하여 입력받은 값을 if-else문을 통해 입력하기
		
		Scanner sc = new Scanner(System.in);
		
		//입력받을 메모리 미리 초기화시키기 ==> 객체생성 x
		Music ms1 = null;
		Music ms2 = null;
		Music ms3 = null;
		
		int sum = 0; // 앨범 전체의 가격을 받을 값
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println((i+1)+"번째 앨범 정보 입니다.");
			
			System.out.print("가수 : ");
			String artist = sc.nextLine();

			System.out.print("앨범명 : ");
			String album = sc.nextLine();

			System.out.print("발매일 : ");
			String drop = sc.nextLine();

			System.out.print("러닝타임 : ");
			double time = sc.nextDouble();

			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();

			if (i == 0) { // 객체생성을 통해 입력받은 값 넣기
				ms1 = new Music(artist, album, drop, time, price);
			} else if (i == 1) {
				ms2 = new Music(artist, album, drop, time, price);
			} else {
				ms3 = new Music(artist, album, drop, time, price);
			}
			sum += price;

		}
		
		System.out.println(ms1.information());
		System.out.println(ms2.information());
		System.out.println(ms3.information());
		System.out.println("앨범 총 합계 : " + sum);
		
		// (+) 사용자에게 찾고자하는 앨범명을 입력받아 정보를 추출하는 서비스 기능 구현
		
		System.out.print("찾고자하는 앨범명을 입력하세요 : \n");
		String search = sc.nextLine();
				
		if(ms1.getAlbum().equals(search)) {
			System.out.println("찾으시는 앨범 정보입니다.");
			System.out.println(ms1.information());
		} else if(ms2.getAlbum().equals(search)) {
			System.out.println("찾으시는 앨범 정보입니다.");
			System.out.println(ms2.information());
		} else if(ms3.getAlbum().equals(search)){
			System.out.println("찾으시는 앨범 정보입니다.");
			System.out.println(ms3.information());
		} else {
			System.out.println("찾으시는 앨범 정보가 없습니다.");
		}
		

	}

}
