package com.study.chap05_constructor.model.vo;

public class User {
	
	// * 필드부 == 전역변수
	
		private String userId;
		private String userPwd;
		private String userName;
		private int age;
		private char gender;
		
		// * 생성자부
		
		/*
		 * public 클래스명([매개변수, 매개변수, ... ]) { // 무조건 클래스명이랑 동일하게 써야함
		 * 
		 * }
		 * 
		 * * 생성자를 작성하는 목적
		 * 1. 객체를 생성해주기위한 목적 - 기본 생성자
		 * 2. 객체 생성과 동시에 각 필드에 대입시킬 값을 전달받아 각 필드에 대입시킬 목적 - 매개변수생성자
		 * 
		 * * 생성자 작성시 주의사항
		 * 1. 반드시 생성자명 == 클래스명
		 * 2. 반환형이 존재하지 않는다!!! (만약 반환형이 존재할 경우 메소드로 인식됨)
		 * 3. 기본생성자는 보통 JVM이 자동으로 만들어주는데 매개변수생성자가 명시되어있으면 자동 생성 X
		 * 		==> 그러므로 기본생성자를 반드시 입력하는 습관을 들이는 것이 좋다!!!
		 */
		
		// 생성자 - 기본생성자
		public User() {
			
		} 
		
		// 생성자 - 매개변수생성자
		
		// 매개변수 3개짜리 생성자
		public User(String userId, String userPwd, String userName) {
			this.userId = userId;
			this.userPwd = userPwd;
			this.userName = userName;
		}

		// 매개변수 5개짜리 생성자
		public User(String userId, String userPwd, String userName,
				int age, char gender) {
			/* this.userId = userId;
			this.userPwd = userPwd;
			this.userName = userName; */
			
			// 매개변수 3개짜리 생성자에서 동일한 값을 불러냄 => 'this()생성자'를 통해 불러낼 수 있음
			// this() 생성자 : 같은 클래스내에 생성자에서 또다른 생성자 호출하고자 할 때 사용
			//				유의사항 - 반드시 첫 줄에 작성해야함
			
			this(userId, userPwd, userName); // 매개변수 3개짜리 생성자 호출
			this.age = age;
			this.gender = gender;
		}
		
		// setter 메소드 : 값을 대입받기 위한 메소드
		
		public void setUserId(String userId) {
			this.userId = userId;
		}
		
		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}
		
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setGender(char gender) {
			this.gender = gender;
		}
		
		// getter 메소드 : 값을 출력하기 위한 메소드

		public String getUserId() {
			return userId;
		}
		
		public String getUserPwd() {
			return userPwd;
		}
		
		public String getUserName() {
			return userName;
		}
		
		public int getAge() {
			return age;
		}
		
		public char getGender() {
			return gender;
		}
		
		public String information() {
			return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 이름 : " + userName
					+ ", 나이 : " + age + ", 성별 : " + gender;
		}

}
