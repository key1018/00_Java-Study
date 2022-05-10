package com.study.chap04_assis.part01_buffer.run;

import com.study.chap04_assis.part01_buffer.model.dao.BufferDao;

public class BufferRun {

	public static void main(String[] args) {

		BufferDao dao = new BufferDao();
		
//		dao.fileSave();
		dao.fileRead();
		
		
	}

}
