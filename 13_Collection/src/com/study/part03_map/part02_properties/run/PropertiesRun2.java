package com.study.part03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	// 프로그램 <-- 외부매체(파일) : 입력
	public static void main(String[] args) {
		
		Properties pp = new Properties();
		
		try {
			
			// load(InputStream is) - properties 파일
			pp.load(new FileInputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties\\test.properties"));
			
			// loadFromXML(InputSteam is) - XML 파일
			pp.loadFromXML(new FileInputStream("C:\\Users\\dski2\\OneDrive\\Desktop\\folderProperties\\testXML.xml"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(pp); // load와 loadFromXML모두 같은 값이므로 중복값 출력 X
		
		/*
		 * * .Properties 파일을 사용하는 이유
		 *  - 구현할 프로그램상에 필요한 기본환경설정(서버의 ip주소, DBMS경로, ..) 관련 구문들 기술
		 *  - 해당 파일에 기술된 내용들을 읽여들여서 자바에서 사용함
		 *  ==> 모두 문자열이기 때문에 개발자가 아닌 일반인이 해당 문서를 파악해서 수정가능
		 *  
		 * * .XML 파일을 사용하는 이유
		 *  - 프로그래밍 언어들간에 호환이 자유롭다. (자바로 작성한 내용이 다른 언어에서도 읽여들여서 사용 가능)
		 */
	}

}
