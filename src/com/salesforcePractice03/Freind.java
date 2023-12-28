package com.salesforcePractice03;

public class Freind {

	private String name;
	private String hp;
	private String school;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}

	public Freind() {
		
	}

	public Freind(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}


	public void showinfo() {
		System.out.println("이름 : " + name + " 핸드폰 : " + hp +" 학교 : " + school);
	}
	
	
	
	
}
