package com.study.chap03_char.model.dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	/*
	 * * 문자 기반 스트림
	 * 
	 * - 문자 스트림 : 데이터를 2byte 단위로 전송할 수 있는 넓은 통로
	 * - 기반 스트림 : 데이터를 외부 매체(파일)과 직접적으로 연결할 수 있는 통로
	 * 
	 * XXXReader : 입력용 스트림
	 * XXXWriter : 출력용 스트림
	 */
	
	// 프로그램 --> 외부매체(파일) : 출력(XXXWriter)
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2byte 단위로 출력할 수 있는 스트림
		
		// ***** try ~ catch 문으로 finally를 통해 자원반납
		/*
		FileWriter fw = null; // 스트림은 빌려쓰는 개념이므로 finally에서 반납을 하기 위해서는 try~catch밖에 생성함
		
		try {
			// 1. FileWriter 스트림 생성
			// 경로설정 X => 프로젝트 내부에 파일 생성됨
			File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
			folder.mkdir(); // 바탕화면에 folder 폴더 생성
			
			fw = new FileWriter("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\byte.txt");
			
			// 2. 통로로 데이터 출력 (바이트 스트림, 문자 스트림 모두 동일한 메소드 사용 : write메소드)
			
			fw.write("안녕하세요"); // 문자열 출력가능
			fw.write("신기하네요");
			fw.write(" "); // 공백도 출력가능
			fw.write("\n"); // 줄바꿈 출력가능
			fw.write('A'); // 문자 출력가능
			fw.write(123); // 숫자 입력가능 - 아스키코드에의해 특수문자'{'로 출력
			
			char[] ch = { '운', '동', '가', '야', '지' };
			fw.write(ch); // 배열 출력가능

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 빌려쓴 스트림 반납
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource 구문으로 자원반납까지 자동으로 진행(JDK7버전 이상부터 사용 가능)
		/*
		 * try(try블럭내에서 사용한 스트림객체 생성 구문){ // ()안에 생성된 스트림 객체 다 사용된 후 자동으로 반납처리해줌
		 * 
		 * } catch (예외클래스 e) {
		 * 
		 * }
		 */
		
		
		// ***** try ~ with ~ resource 구문으로 자원반납까지 자동으로 진행

		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder");
		folder.mkdir(); // 바탕화면에 folder 폴더 생성
		try (FileWriter fw = new FileWriter(new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\byte.txt"))) {

			fw.write("안녕하세요"); // 문자열 출력가능
			fw.write("신기하네요");
			fw.write(" "); // 공백도 출력가능
			fw.write("\n"); // 줄바꿈 출력가능
			fw.write('A'); // 문자 출력가능
			fw.write(123); // 숫자 입력가능 - 아스키코드에의해 특수문자'{'로 출력

			char[] ch = { '운', '동', '가', '야', '지' };
			fw.write(ch); // 배열 출력가능

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 프로그램 <-- 외부매체(파일) : 입력(XXXReader)
	public void fileReader() {
		
		// 1. FileReader 스트림 생성
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\dski2\\OneDrive\\Desktop\\folder\\byte.txt");
			// 실제로 존재하는 파일, 폴더여야함
			
			// 2. 데이터 읽어오기 (read메소드 == 정수반환) : int형으로 반환
			// 문자로 보고싶은 경우 : char형으로 강제형변환해야함
			// 파일의 끝을 만나면 -1이 읽혀짐
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			
			System.out.println(fr.read()); // 파일의 끝을 만나면 -1이 읽혀짐
			System.out.println(fr.read());
			*/
			
			// while반복문을 활용하여 파일의 끝까지 출력하기
			int value = 0; // 정수값으로 읽혀지기때문에 int자료형으로 변수설정
			while ((value = fr.read()) != -1) {
				System.out.print((char) value); // int -> char로 강제형변환
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}