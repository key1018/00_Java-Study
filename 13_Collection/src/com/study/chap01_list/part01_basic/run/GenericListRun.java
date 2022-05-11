package com.study.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.study.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// ListRun에서는 제네릭 설정을 하지 않았다면 GenericListRun에서는 제네릭을 설정함
		
		/*
		 * * 제네릭 <>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장할 수 있도록 제한을 둘 수 있음 (보안 강화)
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환하는 절차를 없앨 수 있음 (코드 간결화)
		 */
		
		ArrayList<Music> list = new ArrayList<>();
		
		// 1. add(E e)
		list.add(new Music("블루밍", "아이유"));
		list.add(new Music("톰보이", "여자아이들"));
		list.add(new Music("One Last Song", "Sam Smith"));
//		list.add("입력 끝"); // 제네릭을 <Music>으로 설정했기때문에 music타입 이외의 데이터 추가 불가능
		
		
		System.out.println(list);
		
		// 2. add(int index, E e)
		list.add(0, new Music("깊은 밤을 날아서", "이문세"));
		list.add(3, new Music("덤덤", "오마이걸"));
		System.out.println(list);
		
		
		// 3. set(int index, E e)
		list.set(0,new Music("꿈과 책과 힘과 벽", "잔나비"));
		System.out.println(list);
		
		
		// 4. subList(int index1, int index2)
		List<Music> sub = list.subList(2,4);
		System.out.println(sub); // 오로지 Music타입의 객체만 나옴
		
		
		// 5. get(int index) : E
		Music m = list.get(0); // 이미 제네릭을 Music으로 설정했기때문에 강제형변환 안해도됨
		Music mu = list.get(3);
		
		System.out.println(m);
		System.out.println(mu);
		
		// 제목만 출력할 경우
		System.out.println(list.get(0).getTitle());

		// 곡명만 출력할 경우
		System.out.println(list.get(0).getArtist());
		
		System.out.println("=============================================");
		// 설정한 객체의 데이터가 몇개인지 모르는 경우 
		
		// for loop문을 활용하여 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============================================");
		
		// for each문을 활용하여 출력
		for(Music music : list) {
			// 단점 : 인덱스에 대한 개념이 없기 때문에 인덱스 수를 활용할 수 없음
			System.out.println(music);
		}
		
		System.out.println("=============================================");
		// 곡명만 출력하기
		for(Music music : list) {
			System.out.println(music.getTitle());
		}
		
		System.out.println("=============================================");
		// 가수만 출력하기
		for(Music music : list) {
			System.out.println(music.getArtist());
		}
		
	}

}
