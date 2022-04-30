package com.study.chap03_class.run;

import com.study.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {

		Person user = new Person();

		user.setId("user01");
		user.setPwd("pass01");
		user.setName("강보람");
		user.setAge(34);
		user.setGender('F');
		user.setPhone("010-1111-2222");
		user.setEmail("teacherboram@gmail.com");

		System.out.println(user.getId());
		System.out.println(user.getPwd());
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println(user.getGender());
		System.out.println(user.getPhone());
		System.out.println(user.getEmail());

	}

}

