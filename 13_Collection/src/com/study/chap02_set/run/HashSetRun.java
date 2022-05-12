package com.study.chap02_set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.study.chap02_set.model.vo.Student;

public class HashSetRun {

	public static void main(String[] args) {
		
	
		/*
		 * * List, Set, Map
		 * - List, Set의 특징 : 데이터(value)만 저장
		 * - Map의 특징 : key + 데이터(value)세트로 저장
		 * 
		 * List의 특징 : 순서 유지 (중복값 허용 - 새로운 index로 추가되기 때문에)
		 * Set의 특징 : 순서 유지X (중복값 허용X - 내부에서 자동적으로 중복 제거함)
		 * Map의 특징 : 순서 유지X (Key값 중복 허용X)
		 */
		
		// HashSet에 새로운 데이터 추가시 보따리 같은 공간에 무작위로 추가
		// 이때 동일객체(hashCode값 동일 , equals결과값 true)인지 내부적으로 판단 후 중복된 데이터는 보관 불가능하게함
		
		// Object의 HashCode() => 해당 객체의 "주소값"을 가지고 10진수 반환
		// Object의 equals() => 두 객체의 "주소값"을 가지고 true/fasle 반환
		
		HashSet<String> hs1 = new HashSet<>(); // 제네릭설정이 안되어있는 경우 : <E> = Object 타입
		
		// List와 같이 Collection에 상속되어있으므로 사용하는 메소드도 동일하다
		
		// add(E e)
		hs1.add("안녕하세요"); // Object 타입이므로 문자열 저장가능
		hs1.add(new String("반갑습니다"));
		hs1.add("반갑습니다");
		hs1.add("열심히 공부합시다");
		hs1.add(new String("안녕"));
		hs1.add(new String("안녕"));
		hs1.add(new String("자바를 배워봐요"));
		
		System.out.println(hs1); // 저장 순서 유지 안됨(인덱스 개념 없음), 중복된 데이터(동일객체) 보관 불가능
	
		// Object HashCode와 equals들은 String 클래스에서 오버라이딩(재정의)가 되어있음
		// String의 HashCode() => "실제 담겨있는 문자열"을 가지고 10진수 형태로 만들어서 반환
		// 즉, hs1.add("반갑습니다.");와 hs1.add(new String("반갑습니다."));의 실제 주소값은 다른데 hashCode에 의해서 같은 주소값으로 반환됨
		// String의 equals() => "실제 담긴 문자열"을 비교해서 true/false반환
		
		HashSet<Student> hs2 = new HashSet<>();
		
		// add(E e)
//		hs2.add("홍길동"); // Student가 제네릭설정되어있으므로 삽입 불가능
		hs2.add(new Student("김말똥", 24, 100));
		hs2.add(new Student("홍길동", 28, 90));
		hs2.add(new Student("강순자", 22, 75));
		hs2.add(new Student("홍길동", 28, 90));
		hs2.add(new Student("강순자", 22, 75));
		
		System.out.println(hs2);
		// 중복된 데이터를 제거하지않고 반환됨
		// hashCode와 equals가 String처럼 오버라이딩 안되어있어서 중복값 제거 안됨 => Student클래스에서 오버라이딩(재정의)를 해서 중복값을 제거하자!!
	
		// Student hashCode() 오버라이딩 : "실제 각 필드에 담긴 값"이 일치하면 동일한 10진수 반환
		// Student equals() 오버라이딩 : "실제 각 필드에 담긴 값"이 모두 다 일치하면 true 반환
		
//		hs2.get(0); // HashSet에는 인덱스 개념이 없어서 사용 불가능 => get메소드 자체가 정의되어있지 않음(한 객체만 뽑아올 수 없음)
		
		//--------------------------------------------------------------
		
		// HashSet에 담긴 값을 순서대로 출력하는 방법
		// 1. for문 사용가능(for each문 사용)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("=====================================================");
		// 2. ArrayList에 옮겨담은 후 그 ArrayList를 반복문을 활용하여 접근
		// ArrayList에 옮겨담는 방법 1 => ArrayList 생성 후 addAll 메소드 활용하여 통째로 추가하기
		
//		ArrayList<Student> list = new ArrayList<>();	
//		list.addAll(hs2);
//		
//		// for반복문 활용하여 출력
//		for(int i =0; i< list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// ArrayList에 옮겨담는 방법 2 => ArrayList생성과 동시에 통채로 추가하기
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		
		// for반복문 활용하여 출력
		for(int i =0; i< list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		//--------------------------------------------------------------
		
		System.out.println("=====================================================");
		// 3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator(); // hs2에 담겨있는 객체들을 => Iterator(반복자)에 담는 과정

		// while반복문을 활용하여 출력
		while (it.hasNext()) { // it값에 값이 담겨있으면 true를 반환하여 반복문 실행
//			System.out.println(it.next());
//			Student s = it.next(); // Student 타입에 iterator에 담겨있는 각 객체들 저장
//			System.out.println(s);
			System.out.println(it.next());
		} // it값에 값이 담겨져있지 않아서 false가 되면 반복문 종료

//		it.next(); // NoSuchElementException 예외 발생 => next()는 실행되면 StringToken처럼 하나하나빠지면 완전히 빠지는 개념 => 다 뽑으면 더이상 못 뽑음
		
	}

}
