package com.test3.run;

import java.util.Scanner;

import com.test3.model.vo.Music;

public class MusicForEachTest {

	public static void main(String[] args) {
		
		// 배열의 크기가 3인 배열 생성
		
		Music[] music = new Music[3];
				
				/*
				// 객체생성과 동시게 초기화하기
				
				music[0] = new C_MusicArrayPractice("저스틴 비버", "Stay", "2021.07.09", 3.28, 33500);
				music[1] = new C_MusicArrayPractice("샘스미스", "Love me more", "2022.04.29", 3.11, 46000);
				music[2] = new C_MusicArrayPractice("테일러스위프트", "willow", "2020.12.11", 3.14, 39000);
				
				// for-each문을 활용하여 모든 값 출력하기
				
				for(C_MusicArrayPractice mu : music) {
					System.out.println(mu.information());
				}
				
				// 찾고자하는 노래명을 입력 후 for-each문을 활용하여 출력하기
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("찾고자하는 곡명을 입력해주세요 : ");
				String search = sc.nextLine();
				
				int num = 0; // 찾는 노래의 유무를 확인할 변수
				
				for(C_MusicArrayPractice mu : music) {
					if(mu.getAlbum().equals(search)) {
						System.out.println("찾으시는 노래의 정보는 " + mu.information() + " 입니다.");
						num++;
					}
				}
				
				if(num == 0) {
					System.out.println("찾으시는 노래의 정보가 없습니다.");
				}
				
				// 찾고자하는 노래명을 입력한 후 발매일 수정하기
				
				System.out.print("변경하고자하는 곡명을 입력해주세요 : ");
				String amend = sc.nextLine();
				
				int result = 0; // 변경하고자 하는 노래의 유무를 확인할 변수
				
				for(C_MusicArrayPractice mu : music) {
					if(mu.getAlbum().equals(amend)) {
						System.out.print("발매일 : ");
						mu.setDrop(sc.nextLine());
						System.out.println("변경된 " + mu.getAlbum() + "의 발매일은 " + mu.getDrop() + "입니다.");
						result++;
					}
				}
				
				if(result == 0) {
					System.out.println("변경하고자하는 노래의 정보가 없습니다.");
				}
		 	*/
				
				
				// for반복문을 활용하여 주문할 노래 정보를 입력한 후 for-each문으로 출력하기
				
				Scanner sc = new Scanner(System.in);
				
				music[0] = null;
				music[1] = null;
				music[2] = null;
				
				// for반복문을 활용하여 주문할 노래 정보를 입력
				
				for(int i = 0; i < music.length; i++) {
					
					System.out.println("구매하고자하는 " + (i+1)+"번째 음악 정보 입력");
					
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
					
					if(i == 0) {
						music[i] = new Music(artist, album, drop, time, price);
					} else if (i == 1) {
						music[i] = new Music(artist, album, drop, time, price);
					} else {
						music[i] = new Music(artist, album, drop, time, price);
					}
				}
				
				// for-each문으로 출력하기
				
				System.out.println("\n구매하고자하는 앨범의 정보");
				for (Music mu : music) {
					System.out.println(mu.information());
				}


	}

}
