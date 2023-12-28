package Practice04;

public class Mul {

	private int a;
	private int b;

	public Mul() {

	}

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		System.out.println(a * b);
		return a * b;
	}
}
