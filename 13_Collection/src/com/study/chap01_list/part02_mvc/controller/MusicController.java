package com.study.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.study.chap01_list.part01_basic.model.vo.Music;

// C(Controller) : 사용자아 요청한 내용을 처리한 후 그 결과를 돌려주는 요청처리담당 클래스
public class MusicController {
	
	// 클래스구역에 입력함으로써 메소드 전역에 사용가능하도록 설정
	ArrayList<Music> list = new ArrayList<>(); {
	
	list.add(new Music("이 밤", "아이유"));
	list.add(new Music("톰보이", "혁오"));
	list.add(new Music("One Last Song", "Sam Smith"));
	
	}
	
	// 1. 새로운 곡 추가 요청 처리
	public ArrayList<Music> insertMusic(String title, String artist) { // insertMusic 메소드 시작
		// 사용자에게 입력받은 값을 받은 후 다시 넘기기때문에 매개변수 필요함
		
		// 입력받은 값 추가하기
		list.add(new Music(title, artist));
		return list;

	} // insertMusic 메소드 끝
	
	
	
	// 2. 곡 전체 출력 요청 처리
	public ArrayList<Music> selectMusic() { // selectMusic 메소드 시작

		return list;

	} // selectMusic 메소드 끝
	
	
	
	// 3. 특정 곡 삭제 요청 처리
	public int delectMusic(String str) { // delectMusic 메소드 시작
		
		/*
		int result = 0; // 제대로 삭제됐는지 확인하는 변수
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getTitle()).equals(str) || (list.get(i).getArtist()).equals(str)) {
				list.remove(i);
				result++;
			}
		}
		return result;
		*/
		
		// contains로 확인하기
		int result = 0; // 제대로 삭제됐는지 확인하는 변수
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getTitle()).contains(str) || (list.get(i).getArtist()).contains(str)) {
				list.remove(i);
				result++;
			}
		}
		return result;

	} // delectMusic 메소드 끝
	
	
	
	// 4. 특정 곡 검색 요청 처리
	public ArrayList<Music> searchMusic(String keyword) { // searchMusic 메소드 시작
		
		// 키워드를 통해서 검색을 할 것이기 때문에 여러개 출력할 수 있다
		// => 새로운 ArrayList 객체 만든 후 담아서 데이터 내보내기
		ArrayList<Music> searchList = new ArrayList<>();
		// 처음 : 텅 빈 리스트
		
		
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getTitle()).contains(keyword) || (list.get(i).getArtist()).contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		// searchList => 텅 비어있을 수 있음(검색결과가 없는 경우)
		//			  => 뭐라도 담겨있을 수 있음(검색결과가 있는 경우)
		return searchList;
		
		
	} // searchMusic 메소드 끝
	
	

}
