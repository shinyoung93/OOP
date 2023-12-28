package com.salesforce;

public class PointApp {

	public static void main(String[] args) {
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		Point p = new Point(4,4);
		
		
		System.out.println(p);
		System.out.println(cp1.toString(true));
		System.out.println(cp2);
	}

}
