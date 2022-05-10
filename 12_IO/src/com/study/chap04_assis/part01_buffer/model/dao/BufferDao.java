package com.study.chap04_assis.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	 * * 보조스트림 == 기반 스트림만으로 부족했던 성능을 보다 향상 시켜주는 기능
	 * 			   보조스트림은 단독 사용불가능, 기반스트림이 반드시 있어야됨!!
	 * 
	 *  BufferedXXXX : 속도를 향상 시킨다거나 기반슽트림에서 제공하지 않는 메소드들 제공
	 *  ex) xx.readLine(); => 줄바꿈
	 */

// 프로그램 --> 외부매체(파일) : 출력
public class BufferDao {
	
	public void fileSave() {
	// 기반스트림의 경우 선입선출로 데이터를 하나하나씩 전달했다면
	// 버퍼의 경우 데이터를 한꺼번에 모아놨다가 전달하기때문에 속도 향상됨
	
	// FileWriter : 파일과 직접적으로 연결해서 2byte 단위로 출력할 수 있는 스트림
	// BufferedWriter (출력용보조스트림) : 버퍼라는 공간을 제공해주는 보조스트림 (속도 향상)
	// *** FileWriter를 사용하면 BufferedWriter사용해야한다.
	// FileOutputStream을 사용하면 BufferedOutputStream을 사용해야함
	
//	// 1. 기반스트림 먼저 생성
//		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
//		folder.mkdir(); // 바탕화면에 folder 폴더 생성
//		FileWriter fw = null;
//	try {
//		fw = new FileWriter("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\buffer.txt");
//		// buffer.txt 파일 생성
//	} catch (IOException e) { 
//		e.printStackTrace();
//	}
//	// 2. 보조스트림 생성
//	BufferedWriter bw = new BufferedWriter(fw);
	
	// 1,2을 한 줄로 줄이기
//		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
//		folder.mkdir(); 
//		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\buffer.txt"));
	
		/*
		// try ~ catch문 활용하기
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
		folder.mkdir();
		BufferedWriter bw = null; // finally의 영역에서도 찾을 수 있도록 미리 변수 설정
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\buffer.txt"));
			
			// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력 => 속도향상에 도움줌
			bw.write("Hi java");
			bw.newLine(); // 줄바꿈 => 버퍼메소드에서만 사용할 수 있음
			bw.write('A');
			bw.write(56); // 아스키코드에의해 문자'8'로 출력됨
			bw.newLine();
			
			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			bw.write(arr);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource문 활용해서 스트림생성과 동시에 반납하기
		// 1. 폴더 생성
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
		folder.mkdir();
		
		// 2. BufferedWriter 보조스트림생성
	
		// 3. FileWrite와 BufferedWriter 스트림 한 줄로 출력하기
		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\buffer.txt"))) {

			// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력 => 속도향상에 도움줌
			bw.write("Hi java");
			bw.newLine(); // 줄바꿈 => 버퍼메소드에서만 사용할 수 있음
			bw.write('A');
			bw.write(56); // 아스키코드에의해 문자'8'로 출력됨
			bw.newLine();

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			bw.write(arr);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	} // 출력 끝
	
	// 프로그램 <-- 외부매체(폴더) : 입력
	public void fileRead() {
		
		// FileReader : 파일과 연력해서 2byte 단위로 데이터를 입력받을 수 있는 기반스트림
		// BufferedReader : 데이터를 모아놔서 한꺼번에 전달하는 보조스트림(속도향상에 도움줌)
		// *** FileReader를 사용하면 BufferedReader사용해야한다.
		// FileInputStream을 사용하면 BufferedInputStream을 사용해야함
		
		
//		// try ~ catch문으로 입력받기
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\buffer.txt"));
//
//			// readLine(); - 한 줄씩 읽어들이는 메소드(String 반환)
//			/*
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); 
//			
//			System.out.println(br.readLine()); // 데이터의 끝에 도달하면 null 값 반환
//			System.out.println(br.readLine());
//			*/
//			// 기반스트림의 경우 -1을 반환했다면 버퍼보조스트림은 null을 반환
//			
//			// 입력해야하는 데이터의 수를 알 수 없으므로 while반복문을 활용
//			String str = "";
//			while((str = br.readLine()) != null) {
//				// null 값의 경우 문자열"null"이 아니므로 동등비교연산자를 통해 비교해야함
//				System.out.println(str);
//			}
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try ~ with ~ resource문 활용해서 스트림생성과 동시에 반납하기
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\buffer.txt"))) {

			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

}
