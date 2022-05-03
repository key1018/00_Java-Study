package com.study.chap02_abstractAndInterface.part02_interface.model.vo;

public class Baby extends Person implements Basic{
	
	public Baby() {

	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 밥먹으면 몸무게 3증가
		super.setWeight(super.getWeight() + 3);
		// 밥먹으면 건강 1증가
		super.setHealth(super.getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 자면 건강 5증가
		super.setHealth(super.getHealth() + 5);
	}

}
