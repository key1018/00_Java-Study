package com.test2.run;

import com.test2.controller.AquariumController;

public class Run {

	public static void main(String[] args) {
		
		AquariumController ac = new AquariumController();
		
		ac.insertMember();
		ac.searchMember();
		

	}

}
