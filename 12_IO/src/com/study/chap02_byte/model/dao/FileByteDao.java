package com.study.chap02_byte.model.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
// dao(Date Access Object) : 외부매체와 직접적으로 연결(데이터에 직접적으로 접촉하는데 쓰이는 객체)
	
	/*
	 * * 바이트 스트림 : 1byte짜리의 데이터만 왔다 갔다 할 수 있는 스트림 => 2byte를 입력하면 오류발생
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * XXXInputStream : XXX매체로부터 데이터를 입력받는 통로
	 * XXXOutputStream : XXX매체로부터 데이터를 출력하는 통로
	 */
	
	
	// 프로그램 --> 외부매체(파일) : 출력(프로그램상의 데이터를 파일로 내보내기, 파일로 저장)
	// XXXOutputStream 사용
	
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림생성 (스트림 : 외부매체와의 입력 및 출력 통로)
		// 2. 스트림으로 데이터를 출력
		// 3. 다 사용한 후 스트림 반납(스트림은 빌려쓰는 개념으로 사용하기때문에 반납까지해줘야함)
		
		FileOutputStream fos = null; // 
		try {
			
			// 1. FileOutputStream 객체 생성 ( 해당 파일과의 연결통로가 만들어짐)
			/*
			 * true 미작성시 => 해당 파일이 존재할 경우 기존의 테이러 덮어씌어지는 형태 (기본값이 false) => 연이어서 출력 x
			 * true 작성시 => 해당 파일이 존재할 경우 기존의 데이터를 연이어서 출력하는 형태
			 */
			File folderDao = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao");
			folderDao.mkdir(); // folderDao 폴더 생성
			
			fos = new FileOutputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao\\byte.txt" /*, true*/); 
			// byte 파일 만들기
			// fos는 해당 통로명
			
			// 2. 스트림을 이용해서 데이터 출력(메소드 활용) : write를 이용해서 원하는 값 출력
			
			fos.write();
			
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
}
