package com.test2.run;

import com.test2.model.vo.GalaxyNote9;
import com.test2.model.vo.SmartPhone;
import com.test2.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		SmartPhone[] sm = new SmartPhone[2];
		
		// 다형성을 통해 객체생성
		sm[0] = new GalaxyNote9();
		sm[1] = new V40();
		
		for(int i = 0; i < sm.length; i++) {
			sm[i].printMaker();
			sm[i].makeacall();
			sm[i].takeacall();
			sm[i].touch();
			sm[i].charge();
			sm[i].picture();
			System.out.println("===================");
		}
	}

}
