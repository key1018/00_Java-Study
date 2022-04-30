package com.study.array;

import java.util.Arrays;

public class B_ArrayCopy {

	// 배열 복사
	
		/*
		 * 얕은 복사 = 배열이 주소값 전체를 복사
		 * -> 복사문의 index값을 변경했을 경우 원본 또한 변경된다
		 */
		
		public void method1() {
		
		int[] origin = {1,2,3,4,5}; // 원본 배열
		
		int[] copy = origin; // 얕은 복사
		
		System.out.println("====변경 전====");
		
		for(int i=0; i<origin.length; i++) {
			
			System.out.printf("origin[%d] : %d  ", i, origin[i]);
		}
		System.out.println();
		
		for(int i =0; i<copy.length; i++) {
			System.out.printf("copy[%d] : %d  ", i,copy[i]);
		}
		
		System.out.println("\n\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		System.out.println(origin == copy); // ture
		
		// 얕은 복사는 주소값 자체를 복사하므로 일치불일치검사를 했을 때 true가 나온다
		
		// copy[2]의 값 변경
		
		copy[2] = 13;
		
		System.out.println("\n\n====변경 후====");
		
		for(int i=0; i<origin.length; i++) {
			
			System.out.printf("origin[%d] : %d  ", i, origin[i]);
		}
		System.out.println();
		
		for(int i =0; i<copy.length; i++) {
			System.out.printf("copy[%d] : %d  ", i,copy[i]);
		}
		
		// origin[2]와 copy[2]의 값이 모두 13으로 바뀜
		
		// 얕은 복사의 단점! 
		// 주소값을 복사한 것이므로 원본 배열 자체가 복사됨 ==> copy를 수정하면 origin도 함께 수정됨 => 원본값 회손
		
		}
		
		/*
		 * 깊은 복사
		 * 
		 * -얕은 복사의 단점을 해결을 해결하기 위한 복사
		 * ==> 주소값을 복사하는 것이 아니라 원본 index에 들어가있는 값을 복사한다
		 * 	   즉, 복사본을 수정해도 원본값은 변경이 안됨 -> 원본값 회손 x
		 */
		
		public void method2() {
			
			// 1. for문 활용
			//새로운 배열을 아예 생성한 후 반복문을 활용해서 원본배열에 담긴 값들을 새로운 배열에 옮겨담기
			
			int[] origin = {1,2,3,4,5,6,7,8,9,10};
			
			int[] copy = new int[origin.length]; // 원본 배열과 똑같은 크기의 새로운 배열
			
			/*
			copy[0] = origin[0];
			copy[1] = origin[1];
			...
			copy[마지막] = origin[마지막];
			*/
			
			System.out.println("=======변경 전=======");
			
			for(int i = 0; i < origin.length; i++) {
				copy[i] = origin[i];
			}
			
			for(int i = 0; i < origin.length; i++) {
				System.out.printf("origin[%d] : %d  ", i, origin[i]);
			}
			System.out.println();
			
			
			for(int i = 0; i < copy.length; i++) {
				System.out.printf("copy[%d] : %d  ", i, copy[i]);
			}
			
			// copy[4], copy[9]의 값 변경
			
			copy[4]=13;
			copy[9]=20;
			
			System.out.println("\n\n=======변경 전=======");
			
			for(int i = 0; i < origin.length; i++) {
				System.out.printf("origin[%d] : %d  ", i, origin[i]);
			}
			System.out.println();
			
			
			for(int i = 0; i < copy.length; i++) {
				System.out.printf("copy[%d] : %d  ", i, copy[i]);
			}
			
			// origin[4] : 5  copy[4] : 13
			// origin[9] : 10  copy[9] : 20
			
			System.out.println("\n\norigin의 주소값 : " + origin.hashCode());
			System.out.println("copy의 주소값 : " + copy.hashCode());
			
			// origin과 copy의 주소값은 서로 다르다
			// index에 들어가있는 값만 복사될 뿐 주소값 자체를 복사하지 않는다
			// => copy의 값을 수정해도 origin의 값이 수정되지 않는다 -> 원본회손 x
		}
		
		public void method3() {
			
			// 2. 새로운 배열 생성 후 System클래스의 arraycopy()메소드를 이용한 복사
			
			String[] origin = {"가","나","다","라","마"};
			
			String[] copy = new String[5];
			
			// String[] copy = new String[10]; => 오류 발생 x
			// 원본 배열(index 0~4) 가져온 후 남은 자리(index5~9)에 추가로 담을 수 있음
			// 또는, copy배열의 크기 안에 원본 인덱스를 원하는 자리에 넣을 수 있음
			
			// [표현법] System.arraycopy(원본배열명, 복사시작할인덱스, 복사본배열명, 복사복배열의복사시작될인덱스, 복사할갯수);
			
			System.arraycopy(origin, 0, copy, 0, 5);
			
			for(int i = 0; i < origin.length; i++) {
				System.out.printf("copy[%d] : %s\n", i, copy[i]);
			}
			
			System.arraycopy(origin, 2, copy, 0, 2);
			
			for(int i = 0; i < origin.length; i++) {
				System.out.printf("변경 후 copy[%d] : %s\n", i, copy[i]);
			}
			
			// System.arraycopy(origin, 1, copy, 3, 6); // 오류 발생
			// 복사하는 갯수가 원본의 index값을 초과함
			
			// copy[1]의 값 수정
			
			System.out.println("\n\n======copy[1]의 값 수정======");
			
			copy[1] = "하";
			
			for(int i = 0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println();
			
			for(int i = 0; i<copy.length; i++) {
				System.out.print(copy[i] + " ");
			}
			
			System.out.println("\n\ncopy의 주소값 : " + copy.hashCode());
			System.out.println("origin의 주소값 : " + origin.hashCode());
			
			// 주소값이 다름 == 각자 다른 배열을 참조하고 있음
			// == 즉, 배열 수정시 서로에게 영향을 주지 않음 (깊은복사)
			
		}
		
		public void method4() {
			
			// 3. Arrays클래스에서 제공하는 copyOf()메소드를 사용
			// 	 System.arraycopy와의 차이점 : 복사가 시작되는 index 위치를 자유롭게 지정할 수 없다
			// 							   무조건 0번 index부터 채움
			
			// [표현법] 본사본 배열명 = Arrays.copyOf(원본배열명, 복사할길이);
			
			int[] origin = {1,2,3,4,5,6}; // 원본
			
			int[] copy = Arrays.copyOf(origin, 6);
			
			System.out.println("=== 복사할 길이 변경 전 copy[i] ===");
			
			for(int i = 0; i<copy.length; i++) {
				System.out.print(copy[i]+ " ");
			}
				
			// 복사할 길이 변경

			copy = Arrays.copyOf(origin, 10); // 복사할 길이가 원복 index 길이를 넘어도 오류발생 x
			// 초과되는 부분은 기본값으로 표시되어서 나타남

			System.out.println("\n\n=== 복사할 길이 변경 후 copy[i] ===");

			for (int i = 0; i < origin.length; i++) {
				System.out.printf("origin[%d]: %d ", i, origin[i]); // 원본 훼손 x
			}
			System.out.println();

			for (int i = 0; i < copy.length; i++) {
				System.out.printf("copy[%d] : %d ", i, copy[i]);
			}

			System.out.println("\n\norigin의 주소값 : " + origin.hashCode());
			System.out.println("copy의 주소값 : " + copy.hashCode());

			// 주소값이 서로 다르기 때문에 복사하고자하는 index의 길이가 늘어나도 원본은 변경이 안된다
			// ==> 즉, 복사값을 수정해도 원본은 수정이 안된다

		}

			public void method5() {

				// 4. clone() 메소드를 이용한 복사
				// index의 길이, 배열의 크기, 복사할 갯수 등 지정할 수 없다 => 원본 자체를 복사할 때 사용

				// [표현법] 복사본 배열 = 원본배열.clone();

				double[] origin = { 1.2, 2.3, 3.4, 4.5 };

				double[] copy = origin.clone();

				for (int i = 0; i < origin.length; i++) {
					System.out.printf("origin[%d] : %.1f  ", i, origin[i]);
				}

				System.out.println();

				for (int i = 0; i < copy.length; i++) {
					System.out.printf("copy[%d] : %.1f  ", i, copy[i]);
				}

				System.out.println("\n");

				// copy[0] 수정

				copy[0] = 9.8;

				for (int i = 0; i < origin.length; i++) {
					System.out.printf("수정 후 origin[%d] : %.1f  ", i, origin[i]);
				}

				System.out.println();

				for (int i = 0; i < copy.length; i++) {
					System.out.printf("수정 후 copy[%d] : %.1f  ", i, copy[i]);
				}

				System.out.println("\n\ncopy의 주소값 : " + copy.hashCode());
				System.out.println("origin의 주소값 : " + origin.hashCode());

				// 주소값이 서로 다르기 때문에 원본은 변경이 안된다

			}
		}
