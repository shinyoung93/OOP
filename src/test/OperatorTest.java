package test;

public class OperatorTest {

	public static void main(String[] args) {

		int a = 10;
		boolean b = false;
		if ((b == true) || (a++ == 10)) {
			System.out.println("Equal" + a);
		} else {
			System.out.println("Not Equal! " + a);
		}

	}

}
