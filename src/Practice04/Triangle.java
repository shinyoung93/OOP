package Practice04;

public class Triangle extends Shape {
	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double area() {
		return a * b / 2.0;
	}

}
