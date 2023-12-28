package test;

public class Constructor {

	String s;

	public void Constructor() {
		s = "constructor";
	}

	void go() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Constructor t = new Constructor();
		t.go();
	}

}
