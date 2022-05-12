package com.study.part03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.study.part03_map.part01_hashMap.model.vo.Snack;

public class HashMapRun {

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
		
		/*
		 * 계층구조를 봤을 때
		 * List와 Set은 같은 Collection을 상속
		 * => 객체(value)를 추가하고자 할 때 같은 공통적으로 add메소드 사용
		 * 
		 * Map은 Collection을 상속 X
		 * => 객체(value)를 추가하고자 할 때 put메소드 이용 (key + value값을 세트로 추가)
		 */
		
		// K = String
		// V = Snack
		HashMap<String, Snack> hm = new HashMap<>();
		
		// *** 1. put(K V) : 컬렉션에 키 + 밸류 세트로 추가시켜주는 메소드 ***
		// key 값 : "다이젠", value 값 : new Snack("초코맛", 1500)
		hm.put("다이제", new Snack("초코맛", 1500)); // value 값 중독
		hm.put("새우깡", new Snack("짠맛", 800)); // key 값 중독
		hm.put("빼빼로", new Snack("초코맛", 1500)); // value 값 중독 => key 값이 중복되지 않았으므로 데이터 저장됨
		hm.put("새우깡", new Snack("매운맛", 900)); // key 값 중독 => value값 덮어씌어짐
		hm.put("칸쵸", new Snack("단맛", 700));
		
		System.out.println(hm); // { 키 = 밸류, 키 = 밸류, ... }
		// 저장되는 순서 유지 X, value값이 중복되어도 key값이 중복안되면 데이터 저장됨!
		// 단, key값이 동일할 경우 value값에 덮어씌어져서 저장됨
		// ==> 키 값은 중복이 절대 불가능한 것으로 설정하는 것이 좋다
		
		
		// *** 2. get(Object key) : V => 해당 키값을 가지고 value값 반환시켜주는 메소드 ***
		Snack s = hm.get("다이제");
		System.out.println(s);
		System.out.println(hm.get("새우깡"));
		
		// 3. size()
		System.out.println("HashMap의 총 길이 : " + hm.size());
		System.out.println("HashMap의 마지막 인덱스 : " + (hm.size()-1));
		
		// 4. replace(K key, V value) : key값을 바탕으로 해당 객체의 value값을 수정하는 메소드
		hm.replace("칸쵸", new Snack("초코맛", 750));
		hm.replace("새우깡", new Snack("짭짤한맛", 990));
		
		System.out.println(hm);
		
		// 5. remove(Object key) => key 값을 호출하여 데이터를 제거
		hm.remove("빼빼로");
		System.out.println(hm);
		
		
		// HashMap에 있는 데이터들 순차적으로 출력
		// for each문 사용 불가능 (List와 Set에서는 사용가능)
		
//		for(Snack sn : hm) {
//			System.out.println(s);
//		}
		
		// 같은 Collect를 상속하고있지 않으므로 ArrayList값 사용 불가능
//		ArrayList<Snack> list = new ArrayList<>(hm);
		
		// Iterator 사용 가능
//		Iterator it = hm.iterator(); // 곧바로 iterator() 호출 불가 / 왜? List계열과 Set계열에서만 iterator() 사용 가능, Map에서는 사용불가능
		
		System.out.println("========================================================");
		// *** Map => Set계열로 변경 => Iterator 메소드 호출
		// 방법 1. keySet()을 이용하는 방법 : key값만 따로 빼서 Set계열에 담기
		
		// 1) hm에 있는 key값들만 Set에 담기
		Set<String> keyset = hm.keySet(); // <E> == Object
		// 현재 key값은 String 자료형이므로 <E> == String 으로 설정
		
		// 2) keySet을 Iterator에 담기
		Iterator<String> it = keyset.iterator();  // Set타입으로 반환된 값들을 Iterator에 담기
		
		// 3) while반복문 활용하여 출력하기
		while (it.hasNext()) {
			String key = it.next(); // iterator에 들어가있는 key값을 String 변수에 넣기
			Snack value = hm.get(key); // Snack객체에 get메소드를 활용하여 key값에 따른 객체 넣기
			System.out.println(key + "=" + value); // 출력
		}
		
		System.out.println("========================================================");
		// 방법 2. entrySet()을 이용하는 방법 : key + value 세트로 뽑아서 Set에 담겨짐

		// 1) hm에 있는 키+밸류 값 Set에 담기
		Set<Entry<String, Snack>> entry = hm.entrySet();

		// 2) entrySet을 Iterator에 담기
		Iterator<Entry<String, Snack>> entryIt = entry.iterator();

		// 3) while반복문 활용하여 출력하기
		while (entryIt.hasNext()) {
			Entry<String, Snack> e = entryIt.next();
//			System.out.println(e);
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
