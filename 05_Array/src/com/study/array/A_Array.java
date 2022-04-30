package com.study.array;

import java.util.Scanner;

public class A_Array {
	
	public void method1() {

		/*
		 * * 배열
		 * 
		 * 1. 배열 선언
		 * [표현법1]
		 * 자료명 배열명[];
		 * 
		 * [표현법2]
		 * 자료명[] 배열명;
		 * 
		 * ex) 1. int[] arr
		 * 	   2. int arr[]
		 */
		 
		/*
		 * 2. 배열 할당
		 * 
		 * 자료명[] 배열명 = new 자료명[배열크기];
		 * 배열의 크키가 1개 생성되면 index(0)이 생성된다
		 * => 배열의 크기가 5인 경우 : index(0)~index(4)까지 생성
		 * 
		 */ 
		 	int[] arr = new int[10];
		 // => index의 길이는 9이다
		 	
		/* 
		 * 3. 값 대입
		 * 배열명[index] = 값;
		 */
		 	
		  arr[0] = 0;
		  arr[1] = 1;
		  arr[2] = 2;
		  
		/* 
		 * 4. 배열의 장점
		 * 
		 * - 변수 선언은 반복문이 불가능하지만 배열은 "반복문이 가능"하다 
		 */
		  
		  for(int i=0; i<10; i++) {
			  arr[i] = i;
			  System.out.print(arr[i] + " ");
		  }
		  
			System.out.println(arr); // 실제 arr박스에는 "주소값"이라는게 담겨있다.
									 // => "주소값"자체가 출력
									 // 주소값은 변수마다 다름
		  
		}  
		
		public void method2() {
			
			/*
			 * 실제 '리터럴값'을 곱바로 담을 수 있는 변수를 일반 변수라고 함
			 * 리터럴값이 아닌 '주소값'을 담고 있는 변수는 참조 변수(레퍼런스 변수)라고 함
			 * 
			 * 기본 자료형(boolean, char, byte, short, int ,long, float, double)으로 선언한 변수
			 * => 실제 리터럴값을 곧바로 담을 수 있는 일반 변수
			 * 
			 * 그 외의 자료형(int[], double[], char[], short[], ... , String, Scanner, ...)으로 선언한 변수
			 * => 주소값을 담는 변수 => 참조 변수(레퍼런스 변수)		 
			 */
			
			// 일반 변수
			// '리터럴 값'을 직접 담을 수 있는 변수
			// 자료형 : boolean, byte, short, int, long, float, double, char
			
			int i = 19;
			double d = 2.2;
			
			// 참초 변수
			// '주소값'을 담는 변수
			// 자료형 : int[], char[], double[], ... , String, Scanner ...)
			
			int[] arr = new int[5]; // new int[5];의 주소값 출력
			System.out.println(arr);
			
			arr = new int[7]; // new int[7];의 주소값 출력
			
			System.out.println(arr); // ==> 서로의 주소값은 다르다

			double[] bArr = new double[5];
			System.out.println(bArr);
			
		}
		
		public void method3() {
			
			// index의 길이
			
			int[] iArr = new int[3]; // 0 ~ 2번 인덱스 생성  => [3]인경우 -1를 한 값이 생성되는 인덱스 값이다
			double[] dArr = new double[4]; // 0 ~ 3번 인덱스 생성
			
			for(int i=0; i<3; i++) {
				System.out.println(iArr[i]); 
			}
			
			// 각 인덱스 안에 어떤 값이 들어갈지에 대한 선언을 하지 않음
			// => heap에는 빈 공간이 존재할 수 없으므로 기본값인 '0'으로 초기화돼서 나타남 
			
			for(int i=0; i<4; i++) {
				System.out.println(dArr[i]); 
			}		
			
			// 각 인덱스 안에 어떤 값이 들어갈지에 대한 선언을 하지 않음
			// => heap에는 빈 공간이 존재할 수 없으므로 기본값인 '0.0'으로 초기화돼서 나타남
			
			
			/*
			 *  	ex) int[] ages = new int[5];
			 *  실행순서 :      1     3      2
			 *  
			 *   1) stack이라는 공간에 int ages[] 박스 생성
			 *   2) heap이라는 공간에 int[5]; 로 인해 5개의 각각의 인덱스가 들어갈 공간이 생성
			 *   	더불어 고유한 주소값(예: 0X123)이 생성된다
			 *   	=> heap에는 빈 공간이 존재할 수 없으므로 기본값으로 초기화됨
			 *   3) '='연산자에 의해 stack의 int ages[] 박스에 heap의 주소값이 담기게돼서 참조되어 출력
			 *   
			 */
		
		}
		
		public void method4() {
			
			int arr[] = new int[5];
			
			/*
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;  ==> 현재 index수에서 +1한 값 출력		
			*/
			
			for(int i = 0; i<5; i++) {
				arr[i] = i+1;	
				System.out.printf("arr[%d] = %d\n",i, arr[i]);
			}
			
			System.out.println("arr배열의 길이 : " + arr.length); // arr 배열의 길이
			// i<5에서 5는 arr배열의 길이이다.
			// 즉, 숫자를 직접 집어넣는 것보다는 arr.length를 삼입하여 입력값을 출력받는 것이 좋다.
			
			for(int i = 0; i<arr.length; i++) {
				arr[i] = i+1;	
				System.out.printf("arr[%d] = %d\n",i, arr[i]);
			}

			
			System.out.println(arr); // "주소값"(@기준으로 뒷문자) 출력
									// 배열의 자료형 + @ + 주소값의 16진수 형태 => (ex) [I(배열의 자료형) + @ + 762efe5d(주소값의 16진수 형태)
			
			System.out.println(arr.hashCode()); // 해당 주소값의 10진수 형태

			
		}
		
		public void method5() {
			
			// 일반변수 : int result; // stack이라는 공간에는 빈 공간이 존재할 수 있어서 기본값이 자동으로 저장 x
			
			int result = 0;
			double result2 = 0.0;
			
			String str = null;
			int[] arr = null; // 참조변수(주소값을 담는 변수) stack 공간의 기본값 : null
							 
			
		// System.out.println(arr[0]); 
		// System.out.println("배열의 길이 : " + arr.length);  
		// NullPointerException 오류 발생 : null을 가지고 접근하려고 할 때 주소값이 담겨 있지 않고 index가 없는데 접근하려고했을 때 생기는 오류
		// ==> new 라는 키워드를 통해서 크기 지정을 안했으므로 index 자체가 없다
		
		}
		
		public void method6() {
			
			/*				
			arr[0] = 2;		  (i * 2) + 2
			arr[1] = 4;		   
			arr[2] = 6;		 
			arr[3] = 8;		 
			arr[4] = 10; 	 
			*/	
			
			int[] arr = new int[5];
			
			// 방법 1 => arr[i] = (i*2)+2;
		
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (i*2)+2;
				System.out.printf("arr[%d] = %d\n", i, arr[i]);
			}
			
			// 방법 2 => 2*(i+1)
			
			for(int i = 0; i<arr.length; i++) {
				arr[i] = 2*(i+1);
				System.out.printf("arr[%d] = %d\n", i, arr[i]);
			}
			
			System.out.println("\n변경 전 arr의 길이 : " + arr.length);
			
			
			/*
			 * * int[] arr = new int[5];에 2개의 index를 추가하고 싶을 때
			 * 
			 * arr[5]=14;
			 * arr[6]=16;
			 * 
			 * ==> 불가능하다!!!!!!!!!
			 * 
			 * why? 한 번 지정된 배열의 크기는 수정 불가능
			 * 새롭게 배열을 선언해야한다		
			 */
			
			// 배열에 index를 새롭게 추가하고 싶을 때
			
			System.out.println("변경 전 arr의 주소값 : " + arr.hashCode());
			
			arr = new int[7]; // 새롭게 배열을 선언 => 새로운 주소값을 가지고있음 == 새로운 곳을 참조하고있다
			
			// 기존에 있었던 arr = new int[5]; 의 주소값은 더이상 참조할 곳이 없으므로 '가비지컬렉터(GC)'에 의해 시간이 지나면 사라짐
			
			System.out.println("\n변경 전 arr의 길이 : " + arr.length);
			System.out.println("변경 후 arr의 주소값 : " + arr.hashCode());
			
			// 배열을 삭제하고자 한다면 => 참조하고 있는 연결고리를 제거하면 됨
			
			arr=null; // null의 의미 : 아무것도 참조하지 않는다 => 연결고리 제거 (주소값 == null)
			
			// System.out.println("\n연결고리 끊은 후의 arr의 길이 : " + arr.length); => index가 사라졌으므로 오류발생
			// System.out.println("연결고리 끊은 후의 arr의 주소값 : " + arr.hashCode()); => 주소값이 사라졌으므로 오류발생
			
			System.out.println("\n연결고리 끊은 후의 arr : " + arr );

		}
		
		public void method7() {
			
			
			// 배열 선언, 크기, 값 지정 전부 동시에 하기
			// => 담고자하는 값이 정해져있을 떄 가능
			
			// 표현법1
			
			int[] arr = new int[] {1,2,3,4,5};
			
			// 표현법2 (많이 사용)
			
			int[] arr2 = {1,2,3,4,5};
			
			// 일반변수의 동등비교
			
			int a = 10;
			int b = 10;
			
			System.out.println(a==b); // true
			// 일반변수의 경우 : 변수값으로 일치불일치 확인
			
			
			// 참조변수의 동등비교
			
			System.out.println(arr==arr2); // false
			
			// 참조변수의 경우 : '주소값'으로 일치불일치 확인
			// 변수의 값이 일치한다고하나 arr와 arr2가 참조하고있는 '주소값이 서로 다르기 때문에' false값으로 나온다		
			
		}
		
		public void method8() {
			
			// 배열 1~10까지 랜덤값(1~100)의 총 합계 구하기
			
			// 1. 배열의 크기를 지정
			
			int[] arr = new int[10];		
			
			// 2. 반복문을 활용하여 배열값에 랜덤값(1~100) 순차적으로 출력
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random() * 100 + 1); // arr[i] = 랜덤값
				System.out.printf("arr[%d] = %d\n", i, arr[i]);
			}
			
			// 3. 반복문을 활용하요 랜덤값의 총 합 출력
			
			int sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			
			System.out.println("\n1부터 랜덤값의 총 합 : " + sum);
		}
		
		public void method9() {
			
			// 배열의 길이만큼 문자열 입력받기 (String 이용)
			
			// 1. 사용자에게 배열의 길이 입력받기
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 길이 : ");
			int size = sc.nextInt(); // 사용자에게 배열의 길이 입력받기
			sc.nextLine();
			
			String[] arr = new String[size]; // 입력받은 값을 배열의 크기로 지정하기
			
			// 2. 반복문 활용해서 배열값(배열의 index)에 문자열(좋아하는 음식) 입력하기
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("좋아하는 음식 입력 : ");
				arr[i]=sc.nextLine();
			}
			
			// 3. 반복문 활용해서 배열값(0~마지막인덱스)에 입력된 문자열 출력하기
			
			for(int i=0; i<arr.length; i++) {
				System.out.printf("arr[%d] : %s\n", i, arr[i]);
			}

		}
		
		public void method10() {
			
			// char배열 이용하여 각각 인덱스에 문자열의 char배열 입력하기
			
			// arr[0] = str.charAt(0);
			// arr[1] = str.charAt(1);
			// ....
			// arr[마지막] = str.charAt(마지막);
			
			// 1. 사용자에게 문자열 입력받기
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			int[] arr = new int[str.length()];
			
			// 2. 반복문 활용하여 배열의 각 인덱스에 문자입력하기
			
			for(int i =0; i<arr.length; i++) {
				arr[i]=str.charAt(i);
			}
			
			// 3. 반복문 활용하여 각 인덱스에 들어가있는 문자 출력하기
			
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("arr[%d] : %c\n", i, arr[i]);
			}
			
		}
		
		public void method11() {
			
			// 실수형 배열을 통해 사용자에게 키(cm) 입력받기
			
			// 1. 실수형 배열 크기 임의로 설정
			
			double[] height = new double[4]; // 크기 4로 임의지정
			
			// 2. 반복문 활용하여 사용자에게 키(cm) 입력받기
			
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i < height.length; i++) {
				System.out.print("키(cm) 입력 : ");
				height[i] = sc.nextDouble();
			}
			
			// 3. 반복문 활용하여 0~마지막인덱스까지 입력받은 키(cm) 출력
			
			//		1번 학생의 키 : xxx.x
			//		2번 학생의 키 : xxx.x
			//		3번 학생의 키 : xxx.x
			
			for(int i = 0; i < height.length; i++) {
				System.out.printf("%d번 학생의 키 : %.1f\n", i+1, height[i] );
			}
			
		}
		
		public void method12() {
			
			// 1~랜덤값의 총 합 구하기
			// 단, 홀수값은 제외
			
			// 1. 사용자에게 배열의 길이 입력받기
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 길이 : ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];

			// 2. 반복문 활용해서 0~마지막인덱스까지 매번 1~100사이의 랜덤값 담은 후 출력하기

			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 100 + 1);
				System.out.printf("arr[%d]의 랜덤값 : %d\n", i, arr[i]);
			}

			// 3. 반복만 활용하여 0~마지막인덱스까지 매번 1~100사이의 랜덤값 합 구하기
			// 단, 홀수값은 제외하여 합하기

			int sum = 0; // arr[i]의 랜덤값을 담을 변수

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] % 2 == 0) {
					sum += arr[i];
				}
			}

		System.out.println("1부터 랜덤값까지의 합(홀수값제외) : " + sum);

	}

}
