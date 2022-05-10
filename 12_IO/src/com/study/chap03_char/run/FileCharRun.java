package com.study.chap03_char.run;

import com.study.chap03_char.model.dao.FileCharDao;
import com.study.chap03_char.model.dao.FileCharDao2;

public class FileCharRun {

	public static void main(String[] args) {

		FileCharDao dao = new FileCharDao();
		
//		dao.fileSave();
//		dao.fileReader();
		
		FileCharDao2 dao2 = new FileCharDao2();
		
//		dao2.fileSave();
		dao2.fileRead();
	}

}
