package Practice04;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 4);

		System.out.println(p.hashCode());
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());
		System.out.println(p.toString());
		System.out.println(p);
	}
}
