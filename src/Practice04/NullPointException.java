package Practice04;

public class NullPointException {

	public static void main(String[] args) {
		String str = new String("hello");
		str = null;
		try {
			System.out.println(str.toString());
		} catch (Exception i) {
			System.out.println("오류가 발생했습니다.");
		} finally {
			System.out.println("시스템을 종료합니다.");
		}

		
	}
}