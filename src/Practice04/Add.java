package Practice04;

public class Add {

	static private int a;
	static private int b;

	public Add() {

	}

	public static void setValue(int a1, int b1) {
		a = a1;
		b = b1;
	}

	public static int calculate() {
		System.out.println(a + b);
		return a + b;

	}
}
