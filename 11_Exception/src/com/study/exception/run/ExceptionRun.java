package com.study.exception.run;

import java.io.IOException;

import com.study.exception.controller.A_UnCheckedException;
import com.study.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {

		A_UnCheckedException a = new A_UnCheckedException();
		
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		
		B_CheckedException b = new B_CheckedException();
		
		b.method1();

	}

	
	
}

