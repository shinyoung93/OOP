package com.salesforce;

public class Student extends Person {
	private String schoolName;

//	public String getSchoolName() {
//		return schoolName;
//	}
//
//	public void setSchoolName(String schoolName) {
//		this.schoolName = schoolName;
//	}

	public String toString() {
		return "Student [schoolName=" + schoolName + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
	}
	
	public Student(String schoolName) {
		this.schoolName =schoolName;
	}
	
	public Student() {
		
	}

	public Student(String name, int age, String schoolNam) {
		this(schoolNam);
		this.setName(name);
		this.setAge(age);
		//this.schoolName = schoolNam;
		
	}

	
	
}
