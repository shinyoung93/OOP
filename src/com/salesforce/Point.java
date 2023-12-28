package com.salesforce;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
	
	}
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw() {
		System.out.println("점[x=" + this.x +", y="  + this.y+"]을 그렸습니다.");
	}

	public void draw(int x) {
		System.out.println("점[x=" + this.x +", y="  + this.y+"]을 지웠습니다.");
	}
	
	public void draw(boolean is) {
		System.out.println("점[x=" + this.x +", y="  + this.y+"]을 지웠습니다.");
	}
}
