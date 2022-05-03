package com.study.chap02_abstractAndInterface.part01_abstract.model.vo;

public class FootBall extends Sports{
	
	// 부모클래스의 추상메소드를 자식클래스에서 오버라이딩를 활용하여 완성시키기
	@Override
	public void rule() {
		System.out.println("1. 공은 발로만 찬다.");
		System.out.println("2. 충분한 휴식을 취해야한다.");	
	}

}
