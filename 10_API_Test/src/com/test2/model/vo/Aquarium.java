package com.test2.model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aquarium {
	
	private String name; // 회원명
	private Date regist; // 등록일
	private Date lastDate; // 회원권 종료일
	
	public Aquarium() {
		
	}

	public Aquarium(String name, Date regist, Date lastDate) {
		super();
		this.name = name;
		this.regist = regist;
		this.lastDate = lastDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegist() {
		return regist;
	}

	public void setRegist(Date regist) {
		this.regist = regist;
	}
	
	public Date getlastDate() {
		return lastDate;
	}
	
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	@Override
	public String toString() {
		
		// 1) SimpleDateFormat 형식을 통해 "yyyy-MM-dd"문자열로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		// 2) 변경된 문자열을 return값에 대입하기 
		String formatDate = sdf.format(regist); // 등록일
		String formatLast = sdf.format(lastDate); // 회원권 종료일
		
		return "Aquarium [name=" + name + ", regist=" + /*등록일 수정*/formatDate +  ", 회원권 종료일 : " + formatLast +  "]";
	}

}
