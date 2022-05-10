package com.study.chap03_char.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao2 {
	
	// 프로그램 --> 외부매체(파일) : 출력
	public void fileSave() {
		
		/* try ~ catch문
		// 1. 출력스트림 생성(FileWriter)
		FileWriter fw = null;
		try {
			// 1_1. 바탕화면에 폴더 생성하기
			File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao2");
			folder.mkdir();
			fw = new FileWriter("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao2\\charDAO.txt");
			
			// 2. 데이터 출력하기
			fw.write("하이 자바");
			fw.write("\n");
			fw.write("운동");
			fw.write("like\n");
			fw.write('a');
			fw.write('B');
			fw.write("\n");
			
			char[] arr = { '1', '2', '3', '4', '5' };
			fw.write(arr);
	
		} catch (IOException e){
			System.out.println(e.getMessage());
		} finally {
			try {
				// 3. 스트림 반납하기
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource구문 활용하기
		
		// 1. 폴더생성 - 파일명 이전까지의 폴더들은 실제로 존재해야만 해당 경로를 찾을수있으므로 폴더를 먼저 생성하기
		File folder = new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao2");
		folder.mkdir();
		try(FileWriter fw = new FileWriter(new File ("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao2\\charDao.txt"))){
			// 2. FileWrtier 출력 스트림 생성과 동시에 스트림 반납까지 완료
			
			// 3. 데이터 출력하기
			fw.write("하이 자바");
			fw.write("\n");
			fw.write("운동");
			fw.write("like\n");
			fw.write('a');
			fw.write('B');
			fw.write("\n");
			
			char[] arr = { '1', '2', '3', '4', '5' };
			fw.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 프로그램 <-- 외부매체(폴더) : 입력(FileRead)
	public void fileRead() {
		
		// try ~ catch문
		
//		// 1. FileRead 입력 스트림 생성
//		FileReader fr = null;
//		try {
//			
//			// 2. 데이터 입력받기
//			fr = new FileReader("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao2\\charDao.txt");
//			
//			/*
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			
//			
//			System.out.println(fr.read()); // 데이터의 끝에 도달하면 -1 반환
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			*/
//
//			// while 반복문을 활용하여 -1이 되면 출력을 멈추도록 설정
//			int value = 0;
//			while ((value = fr.read()) != -1) {
//				System.out.print((char)value); // int형으로 반환되기 때문에 char로 강제형변형
//			}
//
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		} finally {
//
//			// 3. 스트림 반납하기
//			try {
//				fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try ~ with ~ resource문 활용해서 스트림 생성과 동시에 반납하기
		
		try(FileReader fr = new FileReader(new File("C:\\Users\\dski2\\OneDrive\\Desktop\\folderDao2\\charDao.txt"))){
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
