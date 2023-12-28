package com.salesforcePractice03;

public class Circle extends Shape{

	private int radius;
	private double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {

		return radius * radius * PI;
	}

}
