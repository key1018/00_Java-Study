package com.study.chap04_assis.part02_object.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.study.chap04_assis.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 --> 외부매체(파일) : 출력
	public void fileSave() {
		
		// 출력시킬 데이터 (Phone 객체)
		Phone p = new Phone("갤럭시", 1300000);
		
		// FileOutputStream : 파일과 연결해서 1byte 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림
		// Object 출력 관련한 보조스트림은 ObjectOutputStream만 존재  (ObjectWriter 보조스트림 존재X)
		
		// 1. 폴더 생성
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
		folder.mkdir();
		
		// try ~ with ~ resource 구문으로 스트림생성과 동시에 반환하기
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\object.txt"))){
			// object 파일 생성
			
			// 2. 객체를 출력하기 위한 구문 생성
			oos.writeObject(p);
			// ObjectOutputStream은 1byte를 출력하는 좁은 통로 => 현재 phone객체는 문자열,127이상의 숫자가 담겨있는 객체로 NotSerializableException 오류 발생
			// NotSerializableException 직렬화 오류 발생 => 직렬화(phone객체를 일렬로 나열)를 해서 오류해결해야함(Phone파일에서 'Serializable' 인터페이스는 구현 하기!)
			// 직렬화 후에도 파일이 깨져보이지만 제대로 기록된 것 => 입력용 스트림을 통해 객체 활용
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <-- 외부매치(파일) : 입력
	public void fileRead() {
		
		// fileInputStream : 파일과 연결해서 1byte 단위의 데이터를 입력해주는 기반스트림
		// ObjectInputStream : 객체 단위로 입력할 수 있도록 도움을 주는 보조스트림
		// ObjectReader 입력보조스트림 존재 X
		
		// try ~ with ~ resource 구문으로 스트림생성과 동시에 반환하기
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\object.txt"))){
			
//			Phone ph = (Phone)ois.readObject(); // 부모객체(Object)가 자식객체(Phone)으로 들어가기위해서는 강제형변환을 해주어야함
//			System.out.println(ph);
			
			// 위의 문장 하나로 출력하기
			System.out.println(ois.readObject()); // 굳이 phone으로 강제형변환 안해도됨
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
