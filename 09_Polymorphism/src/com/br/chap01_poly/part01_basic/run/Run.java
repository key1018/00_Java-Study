package com.br.chap01_poly.part01_basic.run;

import com.br.chap01_poly.part01_basic.model.vo.*; // 패키지안에 있는 모든 클래스를 import한다는 의미

public class Run {

	public static void main(String[] args) {


		// "="를 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야함 => 다른경우 : 형변환을 해야한다
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다르는 경우");
		Parent p1 = new Parent();
		p1.printParent(); // 부모타입 레퍼런스로 부모타입 클래스에 접근 가능
//		p1.printChild1(); // 부모타입 레퍼런스로 부모타입 클래스에 접근 불가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식개체를 다르는 경우");
		Child1 c1 = new Child1();
		c1.printChild1(); // 자식타입 레퍼런스로 자식타입 클래스에 접근 가능 
		c1.printParent(); // 자식타입 레퍼런스로 부모타입 클래스에 접근 가능 => 상속관계
		// c1 레퍼런스로 Child1, Parent 둘 다 바로 접근 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다르는 경우(다형성)");
		Parent p2 = new Child1(); // 자료형이 서로 다름 => 자동형변환됨 왜? 자식객체가 부모객체로 품어지는거니까!
		p2.printParent();
		((Child1)p2).printChild1(); // 강제형변환 => 왜? 부모가 자식에게 의지해야하니까!
		// p2레퍼런스로 Parent에는 쉽게 접근가능하지만
		// Child1에 접근하고자한다면 강제형변환을 해야지 접근 가능!		
		
		// ==> 쉽게정의하자면 자식은 페륜아라고 생각하면됨
		// - 상속관계에서도 부모님꺼 == 내(자식)꺼, 내(자식)꺼 == 내(자식)꺼 이듯이 
		//	 다형성을 집이라고 가정할 때 : 부모님은 자식을 아무것도 필요없이 집에 들어오라고하지만 자식은 부모한테 집에들어오려면 형변환해서 들어오라고하면서 형변환이안되면 거부함
				
		
		

	}

}
