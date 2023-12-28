package com.salesforcePractice03;

public class ShapeApp {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5);
		System.out.println("원의 면적은 = " + c.area());

		Triangle t = new Triangle();
		t.setA(5);
		t.setB(5);
		System.out.println("삼각형의 면적은 = " + t.area());

		Rectangle r = new Rectangle();
		r.setA(5);
		r.setB(5);
		System.out.println("사각형의 면적은 = " + r.area());

	}

}
