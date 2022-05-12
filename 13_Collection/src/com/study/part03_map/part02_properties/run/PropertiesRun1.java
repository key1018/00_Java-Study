package com.study.part03_map.part02_properties.run;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	// 프로그램 --> 외부매체 : 출력
	public static void main(String[] args) {

		
		// Properties : Map계열의 컬렉션 => key + value 세트로 저장 
		// 단, HashMap과의 차이점 : 제네릭 설정 x, key와 value값 모두 String으로 담음
		
		
		// 1. put (Map의 데이터 추가 메소드)
		Properties pp = new Properties();
		
		/*
		pp.put("다이제", new Snack("초코맛", 1500));
		// 객체를 담는 것은 가능
		System.out.println(pp);
		
		// 하지만 Properties를 사용하는 경우는 Properties에 담겨있는 키+밸류 세트를 "외부매체로 출력 또는 입력"받아올 때 사용
		
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties");
		folder.mkdir();
		
		try {
			// store() 메소드 : 바이트 스트림으로 저장된 정보를 파일에 출력 저장
			pp.store(new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties\\test.properties"), "protertiesTest");
			
			// ClassCastException 예외 발생
			// 내부적으로 store메소드 호출시 Properties에 담겨있는 키 + 밸류 세트들을 String으로 형변환해서 출력함 
			// => value값이 Snack형태이므로 String으로 형변환 할 수 없어서 오류 발생
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		// put 대신 사용
		// 1. setProperties(String key, String value)
		pp.setProperty("List", "ArrayList");
		pp.setProperty("Set", "HashSet");
		pp.setProperty("Map", "HashMap");
		pp.setProperty("Map", "HashMap");
		pp.setProperty("Map", "Properties");
		// 순서 유지, 중복값 X => key값이 중복되면 value값 덮어씌어짐
		
		System.out.println(pp);
		
		// 2. getProperties(String key) : String
		System.out.println(pp.getProperty("List")); // value값 출력
		System.out.println(pp.getProperty("Lisy")); // 존재하지 않은 key값 제시 ==> null값 출력
		
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties");
		folder.mkdir();
		
		try {
			
			// 3. store(OutputStream os, String comments) => properties파일에 저장하고 출력
			pp.store(new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties\\test.properties"), "protertiesTest");
			
			// 4. storeToXML(OutputStream os, String comments) => xml파일에 저장하고 출력
			pp.storeToXML(new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties\\testXML.xml"), "xmlTest");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
