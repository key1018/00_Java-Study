package com.study.chap01_list.part02_mvc.controller;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.study.chap01_list.part01_basic.model.vo.Music;

// C(Controller) : 사용자아 요청한 내용을 처리한 후 그 결과를 돌려주는 요청처리담당 클래스
public class MusicController {
	
	// 클래스구역에 입력함으로써 메소드 전역에 사용가능하도록 설정
	ArrayList<Music> list = new ArrayList<>(); {
	
	list.add(new Music("이 밤", "아이유"));
	list.add(new Music("톰보이", "혁오"));
	list.add(new Music("One Last Song", "Sam Smith"));
	
	}
	
	/**
	 * 1. 새로운 곡 추가 요청 처리
	 * @param title : 사용자가 입력한 추가하고자하는 곡명
	 * @param artist : 사용자가 입력한 추가하고자하는 가수명
	 * @return
	 */
	public ArrayList<Music> insertMusic(String title, String artist) { // insertMusic 메소드 시작
		// 사용자에게 입력받은 값을 받은 후 다시 넘기기때문에 매개변수 필요함
		
		// 입력받은 값 추가하기
		list.add(new Music(title, artist));
		return list;

	} // insertMusic 메소드 끝
	
	
	
	/**
	 * 2. 곡 전체 출력 요청 처리
	 * @return : 현재 곡들이 담겨있는 ArratList (텅비어있을수도있음)
	 */
	public ArrayList<Music> selectMusic() { // selectMusic 메소드 시작

		return list;

	} // selectMusic 메소드 끝
	
	
	
	/** 
	 * 3. 특정 곡 삭제 요청 처리
	 * @param str : 사용자가 입력한 삭제하고자하는 곡명
	 * @return : 사용자가 입력한 곡이 삭제됐는지 확인하는 int 자료형 result 반환 
	 * 			 성공적으로 삭제시 1 | 삭제할 곡을 못찾았을시 0
	 */
	
	public int delectMusic(String str) { // delectMusic 메소드 시작
		
		// 삭제는 신중하게해야하므로 equals를 활용하는것이 좋다
		
		int result = 0; // 제대로 삭제됐는지 확인하는 변수
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getTitle()).equals(str) || (list.get(i).getArtist()).equals(str)) {
				list.remove(i);
				result++;
				break; 
			}
		}
		return result;
		
		/*
		// contains로 확인하기
		int result = 0; // 제대로 삭제됐는지 확인하는 변수
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getTitle()).contains(str) || (list.get(i).getArtist()).contains(str)) {
				list.remove(i);
				result++;
			}
		}
		
		return result;
		*/
		
	} // delectMusic 메소드 끝
	
	
	
	/**
	 * 4. 특정 곡 검색 요청 처리
	 * @param keyword : 사용자가 입력한 검색하고자하는 곡명(키워드)
	 * @return : 사용자가 입력한 키워드가 들어있는 곡들이 담겨있는 ArrayList
	 */
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

	
	/**
	 * 5_1. 수정되기 전과 수정된 후의 노래 호출하는 요청 처리
	 * @param title : 사용자가 입력한 수정하고자하는 곡명
	 * @return : 수정되기 전 ArrayList와 수정된 후의 ArrayList
	 */
	public ArrayList<Music> updateMusic(String title) { // updateMusic 메소드 시작

		ArrayList<Music> origin = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			if (m.getTitle().equals(title)) {
				origin.add(m);
			}
		}
		return origin;

	} // updateMusic 메소드 시작

	/**
	 * 5_2. 특정 곡 수정 요청 처리
	 * @param title : 사용자가 입력한 수정을 원하는 곡명
	 * @param update : 사용자가 입력한 수정하고자하는 곡, 가수명
	 * @return : 사용자가 입력한 곡이 삭제됐는지 확인하는 int 자료형 result 반환 
	 * 			성공적으로 수정 = 1 | 수정할 곡을 못찾은 경우 = 0
	 */
	public int updateMusic(String title, String update) { // updateMusic 메소드 시작

		int result = 0; // 수정됐는지 확인하는 변수
		for (int i = 0; i < list.size(); i++) {

			Music m = list.get(i);

			if (m.getTitle().equals(title)) {
				
				/*
				// 1) split메소드 사용해서 수정하기
				 * 
				String[] str = update.split(",");

				m.setTitle(str[0]);
				m.setArtist(str[1]);
				result++;
				break;
				*/
				
				// 2) StringTokenizer 사용해서 수정하기

				StringTokenizer st = new StringTokenizer(update, ",");

				m.setTitle(st.nextToken());
				m.setArtist(st.nextToken());
				result++;
				break;

			}

		}

		return result;

	} // updateMusic 메소드 끝

}
