package com.study.chap02_encapsulation.model.vo;

public class Student {
	
	/*
	 *  * 필드부
	 *  
	 *  필드 == 멤버변수 == 인스턴스 변수
	 *  
	 *  [표현법]
	 *  접근제한자 자료형 변수명;
	 *  
	 *  필드부에 접근제한자는 private
	 */
	
	private String name;
	private int age;
	private double height;
	private char gender; // 남/여
	private int korScore;
	private int mathScore;
	
	// * 생성자부
	
	/*
	 * * 메소드부
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명 ([매개변수], ..) {
	 * 		// 기능구현
	 * }
	 * 
	 * public void setName(String newName){ // String newName = "홍길동";
	 * 		// 매개 변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수 선언문 (이 메소드 안에서만 사용)
	 * 	(필드부)name = (매개변수)newName;
	 * }
	 */
	
	// setter 메소드명은 setXXX으로 낙타표기법으로 작성 ex) setName, setGender, setAge, ...
	// 관레상 필드명과 매개변수명은 동일하게함
	
	public void setName(String name) {
			// void반환형 : "결과값을 돌려줄것이 없다"라는 의미 => set메소드에서는 값을 받기만하고 반환하여 보여주지않음
		
			// name = name; // 매개변수name = 매개변수name; 형식
			// 왜? 필드명과 매개변수명이 동일할 때 메소드내에 해당 변수명 제시시
			// 해당 영역에서 만들어진 변수가 우선순위가 높음 (지역변수가 우선순위높음)

		// 필드name = 매개변수name; 원함
		this.name = name; //  필드name = 매개변수name; 형식	
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// getter 메소드 
	// 해당 필드에 담긴 값을 반환시켜주는 역할을 수행

	
	// getter메소드명은 getXXX으로 통상 지어줌 (마찬가지로 낙타표기법)
	// 따로 전달값이 없기 때문에 매개변수 안써도됨
	// 단, 반환시켜주는 값이 있기 때문에 반환형 잘 써주기
	// -> 반환형으로 void 사용 x 
	// 왜?  return 특정값; 이런구문이 메소드 상에 존재할 경우는 '돌려줄 값이 있다'란 소리기 때문에
	// 어떤자료형을 돌려줄껀지에 대한 자료형을 반드시 써줘야한다!
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}

}
