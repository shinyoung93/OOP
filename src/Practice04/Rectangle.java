package Practice04;

public class Rectangle {
	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getArea() {
		return a * b;
	}

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public boolean equal(Object ob) {
		Rectangle r = ((Rectangle) ob);
		if (this.hashCode() == r.hashCode()) {
			return true;
		} else {
			if (this.getArea() == r.getArea()) {
				return true;
			}
		}
		return false;
	}
}
