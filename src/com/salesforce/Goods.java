package com.salesforce;

public class Goods {

	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품이름 : " + this.getName());
		System.out.println("가격 : " + this.getPrice());
	}
	
	public Goods(String name, int price) {
		
//		this(name, price);
//		this.name = name;
//		this.price = price;
		
		
	}
	
	//인자값이 없기에 기본 생성자
	public Goods() {
		super();
	}
	
}
