package com.test3.run;

import java.util.Scanner;

import com.test3.model.vo.Music;

public class MusicArrayTest {
	
	public static void main(String[] args) {
		
		// Heap메모리에 저장할 배열 만들기
		
		Music[] music = new Music[3];
				
				/*
				// 방법 1. for 반목문을 활용하여 입력한 값 추출하기
				
				// index 0에 기본생성자로 객체 생성
				
				music[0] = new C_Music();
				
				//set메소드를 활용하여 값 입력하기
				music[0].setArtist("샘 스미스");
				music[0].setAlbum("To die for");
				music[0].setDrop("2022.02.13");
				music[0].setTime(3.22);
				music[0].setPrice(36900);
				
				// index 1,2에 매개변수생성자로 객체 생성
				
				music[1] = new Music("혁오", "톰보이","2018.08.23", 3.11, 18900);
				music[2] = new Music("테일러 스위프트", "willow", "2020.12.11", 4.12, 42000);		
				
				for(int i = 0; i < music.length; i++) {
					System.out.println(music[i].information());
				}
				
				// for반복문 활용하여 앨범 총 합계액 구하기
				int sum = 0;
				for(int i = 0; i < music.length; i++) {
					sum += music[i].getPrice();
				}
				
				System.out.println("\n앨범 총 합계액 : " + sum + "원");
				*/
				
				// 방법 2. for반복문을 활용하여 사용자에게 입력받아 값 추출하기
				
				Scanner sc = new Scanner(System.in);
				
				
				// for 반복문을 활용하여 값 입력하기
				for(int i = 0; i<music.length; i++) {
					System.out.println((i+1)+"번째 음악 정보 입력");
					
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
					
					music[i] = new Music(artist, album, drop, time, price);
					
					}
				
				// for 반복문을 활용하여 값 출력하기
				
				//(+) 앨범 총 합계 금액 구하기
				int sum  = 0;
				for(int i = 0; i < music.length; i++) {
					System.out.println(music[i].information());
					sum += music[i].getPrice();
				}
				
				System.out.println("앨범 총 합계 금액 : " + sum + "원");
				
				//(+) 사용자가 찾고자하는 앨범명 입력받아 출력하기
				System.out.print("찾고자하는 앨범명을 입력해주세요 : ");
				String search = sc.nextLine();
				
				int count = 0; // 찾고자하는 앨범의 유무를 확인하는 변수
				
				for(int i = 0; i < music.length; i++) {
					if(music[i].getAlbum().equals(search)) {
						System.out.println(music[i].information());
						count++;
					}
				}
				
				if(count == 0) { // 찾고자하는 앨범이 없는 경우
					System.out.println("찾으시는 앨범이 없습니다.");
				}
				
				//(+) 사용자가 찾고자하는 앨범명을 입력받아 값 변경 후 출력하기
				
				System.out.print("변경하고자하는 가수를 입력해주세요 : ");
				String change = sc.nextLine();
				
				int result = 0; // 변경하고자하는 가수의 유무를 확인할 변수

				for (int i = 0; i < music.length; i++) {
					if (music[i].getArtist().equals(change)) {
						music[i].setArtist("아이유");
						music[i].setAlbum("Blueming");
						music[i].setDrop("2019.11.18");
						music[i].setTime(3.41);
						music[i].setPrice(13800);
						System.out.println("변경된 정보 - " + music[i].information());
						result++;
					}
				}

				if (result == 0) {
					System.out.println("변경할 앨범이 없습니다.");
				}

	}

}
