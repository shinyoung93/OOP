package com.salesforce;

public class Book {

	private String name;
	private String own;
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setOwn (String own) {
		this.own = own;
	}
	
	public void showinfo() {
		System.out.println("책 ["+this.own+":"+this.name+"]");
	}
}
