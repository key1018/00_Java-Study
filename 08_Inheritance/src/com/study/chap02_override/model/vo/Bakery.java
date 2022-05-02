package com.study.chap02_override.model.vo;

public class Bakery /*extends Object*/{
	
	// Object는 최상위 클래스로 모든 클래스는 Object클래스를 상속받고있다
	
	// 필드
	private String name;
	private int price;
	private boolean sale;
	
	// 기본생성자
	public Bakery() {
		
	}
	
	// 매개변수생성자
	public Bakery(String name, int price, boolean sale) {
		this.name = name;
		this.price = price;
		this.sale = sale;
	}
	
	// setter/getter 메소드
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSale(boolean sale) {
		this.sale = sale;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isSale() { // boolean자료형 필드의 getter메소드는 isXXXX으로 이름을 지아야됨!!
		return sale;
	}
	
	
	/*
	 * * 오버라이딩
	 *  - 자식클래스에서 상속받고있는 부모클래스를 재정의(재작성)하는 것!
	 *  		==> chap01에서 person의 information을 자식클래스의 information마다 재정의 한 것이 오버라이딩 한 것이다!
	 *  => 즉, 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하는 것을 의미
	 * 	   자식객체를 통해 해당 메소드를 호출시 자식메소드가 우선권을 가진다!
	 * 
	 * * 오버라이링 성립 조건
	 *  - 부모메소드명 동일하게 작성
	 *  		==> chap01에서 person의 information 메소드를 자식클래스인 Job에서 information메소드 이름을 동일하게 한 것
	 *  - 매개변수, 갯수, 자료형, 순서 동일하기 작성(단, 매개변수명은 상관없음)
	 *  - 부모메소드의 반환형 동일 (JDK버전업이 되면서 부모메소드의 반환형의 자식자료형들로는 가능)
	 *  - 부모메소드의 접근제한자보다 범위가 같거나 커야한다.
	 *  	ex) 부모메소드의 접근제한자가 protected인 경우 : 자식클래스의 접근제한자는 protected / public
	 *  						 default인 경우 : 자식클래스의 접근제한자는 default / protected / public
	 *  ==> 규약의 개념이 들어가있음
	 *  
	 *  @Override 어노테이션
	 *  - 생략가능하지만 붙이는 것을 권장한다 (명시하지않아도 오버라이딩 된 상태)
	 *  - 어노테이션 붙이는 것을 권장하는 이유
	 *  >> 부모메소드명이나 매개변수가 수정된 경우 => 오류 발생 => 찾아보기 쉽다.
	 *     자식메소드 기술시 오타가 있을 경우 => 오류 발생 => 찾아보기 쉽다.
	 *   >> 단지 이 메소드는 오버라이딩한 메소드임을 알려주는 용도 => 다른사람으로부터 함부로 수정할 수 없게 알려준다
	 */
	
	@Override
	public String toString() { // Object에 있는 toString()을 오버라이딩해서 재정의함
		return "빵이름 : " + name + ",  가격 : " + price + ", 세일 : " + sale;
	}
	
	// 오버라이딩 전 : Object클래스에 toStirng() 실행 => 자료형(풀클래스명) + @ + 주소값의 16진수값 반환
	// 오버라이딩 후 : Book 클래스의 toString() 실행 => 해당 객체가 가지고 있는 모든 필드 값을 한 문자열로 합쳐 반환
	
	@Override
    public boolean equals(Object obj) { // Object클래스에 기본으로 생성되어있는 equals코드
      
		//	this(현 객체)	vs	obj(전달받은 비교할 대상객체)
		// 		Bakery  vs  Object
		
		Bakery other = (Bakery)obj;
		// Object obj를 Bakery타입으로 형변환하여 other변수에 넣어둠
		
		// Bakery.name == other.name;
		// Bakery price == other.price;
		// Bakery sale == other.sale;
		
		// Object클래스의 equals메소드 전체가 변경된 것이 아닌 Bakery클래스에서만 수정됨
		// => 다른 클래스에서 equals를 재정의안하고 실행할 경우(오버라이딩 전) 주소값끼리만 변경됨
		
		if(/*this.*/name.equals(other.name) && price == other.price && sale == other.sale) {
			return true; // 각 피드가 모두 동일한 경우 true출력
		} else {
			return false; // 하나라도 다른 경우 false출력
		}
		
    }
	
	@Override
	public int hashCode() {
		return (name + price + sale).hashCode();
		// 해당 클래스의 필드값을 문자열로 만들어서 문자열의 해쉬코드값을 반환
		// 즉, b2와 b4의 필드값은 (소세지빵, 2500, false)로 문자열이 서로 동일 => 동일한 해쉬코드 반환
		//	  b1(곰보빵, 1000, true)와 b3(케이크, 30000, false)은 각각 문자열이 다름 => 다른 해쉬코드 반환 
	}
	
	
	

}
