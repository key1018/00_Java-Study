package com.study.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.study.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	
		
		/*
		 * * 컬렉션이란?
		 * 
		 * 컬렉션이란 자료구조가 내장되어있는 클래스로
		 * 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"
		 * 
		 * - 자료구조 : 방대한 데이터를 효율적(구조적)으로 다루고자할 때 필요한 개념
		 * - 프레임워크 : 기능들을 더 다루기 쉽게 제공하는 틀
		 * 
		 * * 배열 VS 컬렉션
		 * > 배열의 단점
		 * 1. 배열을 사용하고자 할 때 반드시 크기 지정을 해주어야함. 한 번 지정된 크기는 변경불가능
		 * 	  새로운 데이터를 추가하고자 할 때 새로운 크기의 배열을 만들고 기존껄 복사하고 이어서 담는 구문 직접 작성
		 * 
		 * 2. 배열 중간 위치에 새로운 데이터를 추가하거나 기존의 데이터를 삭제하고자 할 때 기존의 데이터를 밀거나 땡겨주는 구문을 직접 작성해야함(굉장히 복잡함)
		 * 
		 * 3. 한 타입의 데이터만 저장 가능하다
		 * 
		 * > 컬렉션의 장점
		 * 1. 크기를 지정해줄 필요도 없고 새로운 데이터를 추가하고자 할 때 복잡한 구문을 직접 작성할 필요 없음
		 * 
		 * 2. 중간에 데이터를 추가하거나 삭제하고자 할 때 기존의 데이터를 땡겨주는 구문을 직접 작성할 필요 없음
		 * 	  이미 알고리즘(메서드 정의)을 제공해주기 때문에 해당 메서드 호출만 하면 됨
		 * 
		 * 3. 여러 타입의 데이터를 저장할 수 있음 (단, 객체만 저장 가능)
		 * 
		 * ==> 방대만 양의 데이터를 관리할 때 삭제나 추가, 정렬과 같은 수정 기능들이 빈번한 경우 : 컬렉션 권장
		 * 	   단지 보관만한채로 값을 조회만 할 경우 : 배열 권장
		 * 
		 * * List, Set, Map
		 * - List, Set의 특징 : 데이터(value)만 저장
		 * - Map의 특징 : key + 데이터(value)세트로 저장
		 * 
		 * List의 특징 : 순서 유지 (중복값 허용 - 새로운 index로 추가되기 때문에)
		 * Set의 특징 : 순서 유지X (중복값 허용X - 내부에서 자동적으로 중복 제거함)
		 * Map의 특징 : 순서 유지X (Key값 중복 허용X)
		 * 
		 */
		
	public static void main(String[] args) {
		
		// 별도의 제네릭 설정을 하지 않으면 <Object> 	=> E == Object
		// ArrayList<Music> list = new ArrayList(); 로 명시하는 순간 오로지 Music객체만 담을 수 있음
		ArrayList/*<E>*/ list = new ArrayList(3);
		// list계열의 컬렉션인 ArrayList의 경우 배열 기반의 컬렉션이기에 기본적으로 크기 10짜리로 설정됨
		// 즉, ArrayList list = new ArrayList(); 의 경우 배열의 크기는 10
		
		System.out.println(list); // 배열에 아무것도 담기지 않았기에 '[]'로 출력됨
		
		// E == Element == 리스트에 담긴 데이터들(요소들)
		
		// 1. add(E e) : 리스트공간 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("톰보이", "혁오"));
		list.add(new Music("꿈과 책과 힘과 벽", "잔나비"));
		list.add(new Music("블루밍", "아이유")); // 배열의 크기 3초과
		list.add("더 추가할까?");
		list.add('a');
		list.add("끝내자");
		
		System.out.println(list); // 배열에 담긴 값을 전체 출력
		// 리스트에 담길 데이터들 뿐만 아니라 추가적으로 크기를 늘릴 수 있음
		// 또한 객체뿐만 아니라 문자열, 문자로 추가 가능
		
		// 장점1. 지정된 크기보다 더 많이 넣어도 오류 안남 => 크기의 제약 없음
		// 장점3. 다양한 타입의 데이터를 담을 수 있다 => Music객체와 문자열을 한 공간에 담음
		
		
		// 2. add(int index, E e) : 해당 인덱스 위치에 데이터를 추가시키는 메소드
		// ex) 1번 인덱스 자리에 새로 추가하면 기존의 1,2,3,.. 인덱스 자리의 데이터들은 자동으로 뒤로 밀려남
		
		list.add(1,new Music("Love me more", "Sam Smith"));
		list.add(3,"자바 컬렉션 연습");
		System.out.println(list);
		
		// 장점2. 중간 위치에 데이터 추가시 복잡한 알고리즘을 직접 구현 안함		
		// 장점3. 다양한 타입의 데이터를 담을 수 있다 => Music객체와 문자열을 한 공간에 담음
		
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		// ex) 1번 인덱스 자리의 데이터를 삭제하면 하면 기존의 2,3,4,.. 인덱스자리의 데이터들은 자동으로 앞으로 땡겨짐
		
		list.remove(1);
		list.remove(2);
		System.out.println(list);
		
		
		// 4. set(int index, E e) : 해당 인덱스 위치의 데이터를 새로이 전달된 데이터로 수정시켜주는 메소드
		list.set(3, new Music("Lover", "Taylor Swift"));
		System.out.println(list);
		
		
		// 5. size() : 리스트의 사이즈를 반환시켜주는 메소드 (즉, 몇개의 데이터가 담겨있는지)
		System.out.println("리스트의 총 데이터 수 : " + list.size());
		System.out.println("리스트의 최종 인덱스 값 : " + (list.size()-1)); // 0번 인덱스부터 시작하므로 -1를 해줘야 진짜 마지막인덱스 수를 확인할 수 있음
		
		// 6. get(int index) : E => 해당 인덱스 위치에 담겨있는 객체를 반환시켜주는 메소드
//		Music m = (Music)list.get(5); // 인덱스 5번은 String 값이므로 Music 객체로 반환할 수 없음
		String s = (String)list.get(5); // list의 타입은 Object인 부모클래스이므로 자식클래스(String)으로 반환해야함
		char ch = (char)list.get(4);
		Music m = (Music)list.get(2);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(m);
		
		
		// 7. subList(int index1, int index2) : List<E> => index1에서부터 index2이전까지 데이터를 추출해서 새로운 List로 반환
		List sub = list.subList(0,3); // 0 <=   < 3
		// List는 interface로 객체생성은 불가, 레퍼런스 변수로는 생성 가능
		System.out.println(sub);
		

		// 8. addAll(Collection c) : 컬렉션에 있는 모든 데이터를 통채로 뒤에 추가시켜주는 메소드
		list.addAll(sub); // sub에 담겨있는 데이터 list뒤에 추가됨
		System.out.println(list);
		
		
		// 9. isEmpty() : boolean	=> 컬력센이 비어있는지 물어보는 메소드
		// 비어있으면 true, 채워져있으면 false반환
		System.out.println(list.isEmpty()); // false
		
		if(list.isEmpty()) {
			System.out.println("현재 리스트는 비워져있습니다.");
		} else {
			System.out.println("현재 리스트는 채워져있습니다.");
		}
		
		
		// 10. clear() : 싹 비워주는 메소드
		
//		list.clear();
//		System.out.println(list);
//		
//		if(list.isEmpty()) {
//			System.out.println("현재 리스트는 비워져있습니다.");
//		} else {
//			System.out.println("현재 리스트는 채워져있습니다.");
//		}
		
		
		System.out.println("================================================");
		
		// list 안에 얼마만큼의 데이터가 들어있는지 모르는 경우
		// 반복문 활용해서 출력 => 컬력센의 경우 데이터의 크기 : size()로 파악
		
		// for loop반복문 활용하기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("================================================");
		
		// for each반복문을 활용하여 출력
		for(Object o : list) { // 제네릭을 설정안했기때문에 기본값인 Object로 설정해야함
			System.out.println(o);
		}

	}

}
