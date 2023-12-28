package com.salesforce;

public class Person {

	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name; 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public Person() {
		System.out.println("부모호출");
	}
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
//	public Person(String n, int a) {
//		this(n,a);
//	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
