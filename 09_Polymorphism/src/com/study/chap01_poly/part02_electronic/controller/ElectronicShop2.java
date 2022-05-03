package com.study.chap01_poly.part02_electronic.controller;

import com.study.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2 {
	
	// 다형성을 적용시켰을 경우
	
	// 부모타입 배열로 모두 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0; //  new ElectronicShop2 객체생성하는 순간 메모리상에 올라감

	// setter메소드 만들기
	
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	// getter메소드 만들기
	
	public Electronic select(int index) {
		return elec[index];
	}

	
	// for 반복문을 활용하여 출력하기

	public void test() {
		
		// 방법 1. for반복문
		for (int i = 0; i < elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		// 방법 2. forEach문
		for(Electronic ee : elec) { // ee = elec[0] => ee = elec[1] => ee = elec[2]
			System.out.println(ee);
		}
	}
}
