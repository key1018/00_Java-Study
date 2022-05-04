package com.study.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		
		/*
		 * * Date(java.util)
		 * - 날짜 및 시간에 대한 값을 담을 수 있는 객체
		 * 
		 */
		
		// 기본생성자를 이용해서 생성 => 현재 날짜 및 시간(시스템 날짜 및 시간)을 담고있음
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜(2022년 10월 18일)로 셋팅
		// 1) 매개변수생성자를 이용해서 생성
//		Date date2 = new Date(2022, 10, 18);
//		System.out.println(date2); // Sat Nov 18 00:00:00 KST 3922으로 출력
	
		// Date 클래스를 보면 년에는 +1900, 월에는 +1씩 출력하게 되어있으니 원하는 날짜를 생성할 때는 그에맞춰서 뺴줘야함
		
		Date date2 = new Date(2022-1900, 10-1, 18); // Tue Oct 18 00:00:00 KST 2022으로 출력 ==> 시간대는 00:00:00으로 초기화돼서 나옴
		System.out.println(date2);
		
		// 2) 기본생성자로 생성 후 setter메소드 값 변경
		date1.setYear(2022-1900);
		date1.setMonth(10-1);
		date1.setDate(18); 
		System.out.println(date1); // Tue Oct 18 04:44:13 KST 2022으로 출력 => 시간대는 시스템 시간대로 나옴
		
		// 2022년 10월 18일 12시 45분 23초
		// java.text.SimpleDateFormat 클래스
		
		// 월 : MM  분 : mm
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String formatDate = sdf.format(date1);
		System.out.println(formatDate); // "2022년 10월 18일 04시 50분 04초" 출력
		String formatDate2 = sdf.format(date2);
		System.out.println(formatDate2); // "2022년 10월 18일 12시 00분 00초" 출력
		
		
		// --------------------------------------------------
		
		Date date3 = new Date();
		// 2018.11.11  12:45:58
		
		// 1) setter메소드로 값 변경
		date3.setYear(2018-1900);
		date3.setMonth(11-1);
		date3.setDate(11);
		date3.setHours(12);
		date3.setMinutes(45);
		date3.setSeconds(58);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		String formatDate3 = sdf2.format(date3);
		System.out.println(formatDate3);
		
		// 2) 매개변수 생성자로 값 변경
		Date date4 = new Date(2018-1900, 11-1, 11, 12,45,58);
		String formatDate4 = sdf2.format(date4);
		System.out.println(formatDate4);
		
	}

}
