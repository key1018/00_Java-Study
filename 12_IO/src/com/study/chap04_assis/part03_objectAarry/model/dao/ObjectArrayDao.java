package com.study.chap04_assis.part03_objectAarry.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.study.chap04_assis.part03_objectAarry.model.vo.Employee;
import com.study.chap04_assis.part03_objectAarry.model.vo.Student;

public class ObjectArrayDao {
	
	// 프로그램 --> 외부매체(파일) : 출력
	public void fileSave() {
		// Student, Employee의 객체 배열 할당
		Student[] s = new Student[3];
		s[0] = new Student("홍길동", 24, "경영학과");
		s[1] = new Student("김말똥", 23, "정보통신학과");
		s[2] = new Student("강순자", 20, "국문학과");

		Employee[] ep = new Employee[4];
		ep[0] = new Employee("유날덕", 45, "총무팀");
		ep[1] = new Employee("김마달", 29, "기획팀");
		ep[2] = new Employee("박봉건", 33, "재무팀");
		ep[3] = new Employee("강동훈", 38, "영업팀");

		// try ~ with ~ resource문을 활용하여 스트림 생성과 동시에 반납하기
		// 1. 폴더 생성
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderArray");
		folder.mkdir();
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderArray\\array"))) {

			// for반복문을 활용하여 출력하기
			// Student
			for (int i = 0; i < s.length; i++) {
				oos.writeObject(s[i]);
			}

			// Employee
			for (int i = 0; i < ep.length; i++) {
				oos.writeObject(ep[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 프로그램 <-- 외부매체(파일) : 입력
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderArray\\array"))) {

			// 객체 전체 출력하기
			while (true) {
				System.out.println(ois.readObject());
			}

		} catch (EOFException e) {
			System.out.println("파일을 다 읽었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");

	}
}
