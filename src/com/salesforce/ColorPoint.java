package com.salesforce;

public class ColorPoint extends Point{

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}

	public String toString(boolean is) {
		return "ColorPoint [color=" + color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public ColorPoint(String color) {
		this.color = color;
	}
}
