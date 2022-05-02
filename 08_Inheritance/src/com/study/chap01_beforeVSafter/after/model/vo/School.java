package com.study.chap01_beforeVSafter.after.model.vo;

			//자식 : School    부모 : person
			//자식 ------------> 부모
			//후손 ------------> 조상
			//하위 ------------> 상위
			//this ---------> super
public class School extends Person{
	// 자식클래스 extends 부모클래스 ===> 부모클래스를 상속받는 코드 표현법
	
	// school클래스에만 들어가는 필드를 작성하기
	private String schoolName;
	private int grade; 
	private int classroom;


	// 기본생성자  ==> 기본생성자는 그대로 작성
	public School() {

	}
	
	// 매개변수생성자
	public School(String name, int age, String address, char gender, String schoolName, int grade, int classroom) {
		// Person 클래스에 있는 name ~ gender 값들은 상속을 통해 대입할 수 있다
		// super.을 통해 부모에 접근 가능 (단, private은 접근 불가능)
		
		// 방법 1. 부모클래스에 있는 필드인 private name ~ private gender에서 private을 'protected로 변경'
//		super.name =  name; // private인 경우 : 오류 발생     protected인 경우 : 정상작동
//		super.age = age;
//		super.address = address;
		
		
		// 방법 2. 부모클래스에 있는 setter메소드 확인 (public이므로 접근 가능)
//		super.setName(name);
//		super.setAddress(address);
//		super.setAge(age);
		
		
		// 방법 3. 부모생성자를 호출하기
		// super(); => 부모클래스에 있는 기본생성자 호출
		super(name, age, address, gender); // 부모클래스에있는 매개변수생성자 호출
		this.schoolName = schoolName; // 자식클래스에만 있는 필드값은 그대로 this.을 활용하여 호출
		this.grade = grade;
		this.classroom = classroom;
	}
	
	// setter / getter 메소드 => 마찬가지로 자식클래스에만 있는 메소드만을 호출하면됨
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassRoom(int classroom) {
		this.classroom = classroom;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassRoom() {
		return classroom;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식메소드에 재정의하는 것!!!!
	// - 부모클래스와 동일한 메소드명을 정의해야함
	// - super.xxx()을 통해 부모메소드에 있는 코드 호출
	public String information() {
		return super.information() + ",  학교명 : " + schoolName + ",  학년 : " + grade + ",  반 : " + classroom;
	}
	
	
	

}
