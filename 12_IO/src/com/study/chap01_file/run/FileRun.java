package com.study.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// java.io.file을 가지고 간단하게 파일 만들기
		
		try {
			// 1. 경로지정을 하지 않은 상태로 파일 생성 => 현재 project폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 새로운 파일 생성
			
			// 2. 경로지정한 상태로 파일 생성
			File f2 = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\test.txt");
			f2.createNewFile(); // 존재하지않는 경로 제시시 IOException 예외 발생
			
			
			// 3. 폴더 먼저 만든 후 그 안에 파일생성
			File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder2");
			folder.mkdir(); // 폴더만들기 : 폴더명(folder2)
			
			File f3 = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder2\\test.txt");
			f3.createNewFile(); // 생성된 폴더에 파일 만들기
			// 삭제해도 실행하면 다시 생성됨
			
			//===============================================================================
			
			File makeFolder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\makeFolder");
			makeFolder.mkdir(); // 폴더 만들기
			
			File makeFile = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\makeFolder\\makeFile");
			makeFile.createNewFile(); // 파일 만들기
			
			System.out.println(makeFolder.isFile()); // makeFolder가 파일인지 일치여부 확인
			// 폴더이므로 false
			System.out.println(makeFile.isFile()); // f4가 파일인지 일치여부 확인
			// 파일이므로 true
			
			System.out.println("파일명 : " + makeFile.getName());
			System.out.println("파일크기 : " + makeFile.length());
			System.out.println("절대경로 : " + makeFile.getAbsolutePath());
			System.out.println("상위폴더 : " + makeFile.getParent());

		} catch (IOException e) {
			e.printStackTrace(); // 오류발생한 내역을 추척할 수 있는 코드(오류난 내역을 보고자할 때 실행) => 생략가능
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

	/*
	 * 프로그램 상의 데이터를 외부매체로 출력 한다거나 반대로 입력을 받아올떄
	 * 반드시 그 외부매체와 통로를 만들어야됨 == 스트림
	 * 
	 * * 스트림의 특징
	 * - 단방향 : 출력용은 출력만(프로그램 자바 -> 외부매체 파일) / 입력용은 입력만(외부매체 파일 -> 프로그램 자바)
	 * - 선입선출(FIFO) : 파이프같은 개념을 먼저 보낸값이 먼저 나옴
	 * 	 => 시간지연(delay)가 발생할 수 있음
	 * 
	 * * 스트림의 구분
	 * > 통로의 사이즈 (1byte / 2byte)
	 * - 바이트 스트림 : 1byte짜리 데이터만 왔다 갔다 할 수 있는 정도의 좁은 통로 ex) 숫자, 영문자
	 * 	 => 입력 (InputStream) / 출력 (OutputStream)
	 * - 문자 스트림 : 2byte짜리 데이터도 왔다 갔다 할 수 있는 정도의 넓은 통로 ex) 숫자, 영문자, 한글
	 * 	 => 입력 (Reader) / 출력 (Writer)
	 * 
	 * > 외부매체와 직접 연결하는 유무
	 * - 기반(기본) 스트림 : 외부 매체와 직접적으로 연결되는 통로 (필수)
	 * - 보조 스트림 : 말 그대로 보조 역할만하는 스트림 (속도 향상, 그 외의 도움되는 기능들, ..)
	 * 		=> 외부매체와 직접적으로 연결 X, 단독으로는 사용불가능! 기반(기본)스트림이 반드시 기본적으로 있어야함!
	 * 
	 */
}
