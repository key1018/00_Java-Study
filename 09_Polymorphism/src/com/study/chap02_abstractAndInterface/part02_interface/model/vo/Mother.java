package com.study.chap02_abstractAndInterface.part02_interface.model.vo;

// Person인 부모클래스를 '상속'받고 Basic인 인터페이스는 '구현'하다
// 인터페이스는 ','를 통해 여러개 상속 가능하다
public class Mother extends Person implements Basic/* , A, B */{
	
private String babyBirth;
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public String toString() {
		return "Mother[" + super.toString() + ", babyBirth : " + babyBirth + "]";
	}

	@Override // 오버라이딩을 통해 부모클래스의 추상메소드를 완성시킨다
	public void eat() {
		// 밥먹으면 몸무게 -5감소
		super.setWeight(super.getWeight() - 5);
		// 밥먹으면 건강 7증가
		super.setHealth(super.getHealth() + 7);
	}

	@Override
	public void sleep() {
		// 잠자면 건강 20증가
		super.setHealth(super.getHealth() + 20);
	}

}
