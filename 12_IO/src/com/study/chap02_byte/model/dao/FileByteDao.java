package com.study.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
	
	public void fileSave() { // 출력 메소드 시작
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림생성 (스트림 : 외부매체와의 입력 및 출력 통로) => 출력 통로 만들기
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
			//	  숫자 (0~127), 한글자에 해당하는 문자, 특수문자
			// 아스키코드에의해 숫자를 입려하면 문자 및 특수문자로 저장됨
			
			fos.write(97); // 아스키코드에 의해 'a' 문자 저장
			fos.write('c'); // 'c'문자 저장
			fos.write(71); // 'G'문자 저장
//			fos.write('가'); // 한글은 2byte이므로 출력문이 깨져서 출력
			
			byte[] arr = {'b', 100, 120, 'z'}; // 'b', 'd', 'x', 'z' 문자 저장
			fos.write(arr); // 배열도 출력하여 문자 저장가능
			fos.write(arr, 0, 2); // arr배열에서 인덱스 0 <=   < 2 까지 저장
			
			// 3. 스트림 다 이용했으면 반납하기 (필수!!)
			// fos.close(); // 반드시 실행 but, 중간에 IOException 예외가 발생하면 실행안될수도있음
			// => 마지막에 finally를 활용하여 무조건 실행하도록 처리
			
		} catch(FileNotFoundException e) { // catch문구에서 제일 먼저 코드 생성
			System.out.println(e.getMessage());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally { // finally 안에 작성된 코드는 어떤 예외가 발생하든간에 마지막에 무조건 실행하고 빠져나감
			// finally는 catch블럭과 전혀 상관없음
			
			try {
				fos.close(); // 스트림반납하는 구문 작성할 때도 try~catch문을 통해 예외처리해야함
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} // 출력 메소드 종료

	}

	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1byte 단위로 입력받는 스트림
		
		// 1. 스트림생성 (스트림 : 외부매체와의 입력 및 출력 통로) => 입력 통로 만들기
		// 2. 스트림통해서 입력받기
		// 3. 다 사용한 후 스트림 반납(스트림은 빌리는개념이므로 무조건 반납해야함)
		
		FileInputStream fin = null;
		try {
			
			// 1. FileInputStream 객체 생성
			fin = new FileInputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao\\byte.txt");
			// 객체를 입력받기 위해서는 반드시 ()안에 파일이 존재해야함
			
			// 2. 파일로부터 데이터 읽어들이기(입력받아오기)
			//	  1byte단위로 하나씩 읽어옴
			
			/*
			System.out.println(fin.read()); // int 자료형으로 입력받음
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
			System.out.println(fin.read()); // 입력받는 양을 초과했을 경우 입력받는 값은 -1로 반환
			System.out.println(fin.read());
			*/
			
			// 파일에 얼마만큼의 데이터가 있는지 모를경우 => 반복문 활용
			
			// 반복문 수행시 매번 read()가 두번씩 실행되기때문에 퐁당퐁당 읽여들여짐 => 잘못됨
			// ex) a값 읽은 뒤 c값 반환, G값 읽은 뒤 b값 반환, d값 읽은 뒤 x값 반환, ...
			
//			while(fin.read() != -1) {
//				System.out.println(fin.read());
//			}
			
			
			// 해결방법 1. 무한반복문 이용
			/*
			while(true) {
				int num = fin.read(); // 변수에 대입해서 퐁당퐁당 읽여들여지는 것 방지하기
				if(num == -1) {
					break;
				}
				System.out.println(num);
			}
			*/
			
			// 해결방법 2. while 반복문 활용
			int num = 0;
			while((num = fin.read()) != -1) {
			// num 변수에 담아놓은 fin.read()의 값이 -1이 아닐때까지 무한반복
				System.out.print((char)num); // int형을 char형으로 형변환
			}

		} catch (FileNotFoundException e) { // catch문구에서 제일 먼저 코드 생성
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally { // finally 안에 작성된 코드는 어떤 예외가 발생하든간에 마지막에 무조건 실행하고 빠져나감
			// finally는 catch블럭과 전혀 상관없음

			try {
				fin.close(); // 스트림반납하는 구문 작성할 때도 try~catch문을 통해 예외처리해야함
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
