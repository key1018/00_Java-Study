package com.test3.run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.test3.model.vo.Library;

public class ScannerRun {

	public static void main(String[] args) {

		Library[] l = new Library[10];

		Scanner sc = new Scanner(System.in);

		int count = 0; // 입력된 책 수를 확인할 변수
		long calDate = 0; // 시간차이를 계산할 변수
		int sum = 0; // 연체료를 계산할 변수
		
		// String Type을 Date Type으로 캐스팅하면서 생기는 예외로 인해 try catch 오류 처리
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			for (int i = 0; i < l.length; i++) { // for반복문활용

				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("책 : ");
				String book = sc.nextLine();
				System.out.print("대여일 (2011-12-01 과 같이 '-'구분자를 이용하여 입력하시오) : ");
				String rentalDate = sc.nextLine();
				System.out.print("반나일 (2011-12-01 과 같이 '-'구분자를 이용하여 입력하시오) : ");
				String returnDate = sc.nextLine();
				System.out.print("가격 : ");
				int price = sc.nextInt();
				System.out.print("연체수수료 : ");
				double lateCharges = sc.nextDouble();
				sc.nextLine();

				l[i] = new Library(name, book, rentalDate, returnDate, price, lateCharges);

				// 책 정보를 계속 입력할지말지 확인
				// N을 입력하면 반복문에서 빠져나가기

				System.out.print("계속 입력하시겠습니까(Y/N)? ");
				String str = sc.nextLine().toUpperCase(); // 입력할때마다 모두 대문자로 출력

				count++; // 정보를 입력할때마다 count수 증가

				if (str.equals("N")) { // 만약 그만입력하겠다는 "N"을 입력했을 경우 for반복문 활용하여 결과값 출력하도록 설정
					
					for (int j = 0; j < count; j++) { // count 수 만큼 출력
						Date first = sdf.parse(l[j].getRentalDate());
						Date second = sdf.parse(l[j].getReturnDate());
						// String 타입의 대여일과 반납일을 parse를 통해서 Date형으로 변환
						calDate = first.getTime() - second.getTime();
						// Date.getTime() 은 해당날짜를 기준으로 몇 초가 흘렀는지를 반환
						calDate = Math.abs(calDate) / (24 * 60 * 60 * 1000);
						// 차이값을 절대값으로 출력 후 (24 * 60 * 60 * 1000)로 나누어서 일수로 결과값이 나오도록 설정
						sum = (int) (l[j].getPrice() * l[j].getLateCharges() * calDate);
						// j의 수에 따라 연체일이 다르게 나오도록 설정
						System.out.println(l[j] + ",  연체일 : " + calDate + "일" + ",  연체료 : " + sum + "원");
						// 사용자가 입력한 총 결과값 count수 만큼 출력
					}
					break; // n를 입력했으니 break문을 통해 반복문으로 출력한 후 빠져나도록 설정
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
