package com.salesforce;

public class BookApp {

	public static void main(String[] args) {
		Book bk1 = new Book();
		Book bk2 = new Book();
		
		bk1.setName("삼국지");
		bk1.setOwn("이문열");

		bk2.setName("토지");
		bk2.setOwn("박경리");
		
		bk1.showinfo();
		bk2.showinfo();
	}

}
