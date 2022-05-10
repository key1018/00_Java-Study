package com.study.chap04_assis.part02_object.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.study.chap04_assis.part02_object.model.vo.Phone;

public class ObjectArrayDao {
	
	// 프로그램 --> 외부매체(파일) : 출력
	public void fileSave() {
		
		Phone[] p = new Phone[3];
		p[0] = new Phone("아이폰", 1300000);
		p[1] = new Phone("갤럭시", 1200000);
		p[2] = new Phone("바나나폰", 450000);
		
		// try ~ with ~ resource 구문으로 스트림생성과 동시에 반환하기
		// 1. 폴더 생성하기
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
		folder.mkdir();
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\objectArray"))) {

			// 2. for 반복문을 활용하여 출력하기
			for (int i = 0; i < p.length; i++) {
				oos.writeObject(p[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 프로그램 <-- 외부매출(파일) : 입력
	public void fileRead() {
		
		// try ~ with ~ resource 구문으로 스트림생성과 동시에 반환하기
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\objectArray"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 : EOFException 예외 발생
			*/
			
			// while 무한반복문을 활용
			// 파일의 끝을 만나는 순간 EOFException 예외 발생 => catch예외블럭 작동 => try~catch블럭 종료
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (EOFException e) { // IOException가 부모예외클래스여서 무조건 자식예외클래스가 부모보다 앞에 나와있어야지 출력하고자하는 구문 출력할 수 있음
			System.out.println("파일을 다 읽었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
