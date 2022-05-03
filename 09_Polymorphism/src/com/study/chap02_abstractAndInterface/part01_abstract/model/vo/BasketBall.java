package com.study.chap02_abstractAndInterface.part01_abstract.model.vo;

public class BasketBall extends Sports{
	// Sports가 추상클래스이므로 그대로 적용하면 오류발생 => 추상메소드를 재정의해서 완성시켜야함!!
	
	// 추가적으로 작성하는 것 없이 오로지 추상메소드만 재정의하기
	
	@Override
	public void rule() {
		System.out.println("1. 공은 손으로만 친다.");
		System.out.println("2. 선수들끼리 싸우면 안된다.");
	}

}
