package com.test3.run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.test3.model.vo.Library;

public class Run {

	public static void main(String[] args) {


		Library[] l = new Library[3];	
		
		l[0] = new Library("홍길동", "자바의정석", "2022-04-30", "2022-05-16", 12000, 0.1);
		l[1] = new Library("강순자", "씨언어", "2022-08-02", "2022-08-08", 13000, 0.1);
		l[2] = new Library("최명길", "파이썬", "2021-10-19", "2022-03-04", 15000, 0.1);
		
		int sum = 0; // 회원들의 연체일에 따른 대여료를 계산할 변수
		long calDate = 0; // 시간차이를 계산할 변수
		
		for(int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
		
		// String 날짜를 Date로 변환
		// String Type을 Date Type으로 캐스팅하면서 생기는 예외로 인해 try catch 오류 처리
		
		try {
			// String과 동일한 문자열로 고정
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			for(int i = 0; i < l.length; i++) {
			// String 타입의 대여일과 반납일을 parse를 통해서 Date형으로 변환
			Date first = sdf.parse(l[i].getRentalDate());
			Date second = sdf.parse(l[i].getReturnDate());
			
			// Date로 변환된 두 날짜를 계산한 뒤 long타입의 변수에 넣기
			calDate = first.getTime() - second.getTime();
			// Date.getTime() 은 해당날짜를 기준으로 몇 초가 흘렀는지를 반환
			calDate = Math.abs(calDate) / (24*60*60*1000); // 차이값을 절대값으로 출력
			// (24*60*60*1000) : 각 시간값에 따른 차이점
			//  => 위 값으로 나눠주면 일수가 나옴
			
			System.out.println(l[i].getName() + "의 연체일 : " + calDate + "일");
			
			// 대여료 = (가격 * 연체일) * 연체수수료
			sum = (int) (l[i].getPrice() * l[i].getLateCharges() * calDate);
			System.out.println("연체료 : " + sum + "원");
		}

	} catch (ParseException e) {
		e.printStackTrace();
	}

}

}
