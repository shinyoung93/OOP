package Practice04;

public class ShapeApp {

	public static void main(String[] args) {
		Shape c = new Circle();
		Drawable p = new Point();

		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Drawable);
		//System.out.println(c instanceof Rectangle);
		System.out.println(c instanceof Shape);

		System.out.println("점프");
		System.out.println(p instanceof Point);
		System.out.println(p instanceof Drawable);
		System.out.println(p instanceof Rectangle);
		System.out.println(p instanceof Shape);

	}

}
