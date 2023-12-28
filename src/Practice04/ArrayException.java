package Practice04;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = new int[] { 3, 6, 9 };
		// System.out.println(intArray[3]);

		try {
			System.out.println(intArray[3]);

		} catch (Exception e) {
			System.out.println("에러가 발생 했습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
