package arriyList;

public class PhonDBAPP {

	public static void main(String[] args) {
		saveList("안녕 hello java");
//		System.out.println("이름 : " + name);
//		System.out.println("핸드폰 : " + hp);
//		System.out.println("회사 : " + company);
//		System.out.println("");
	}

	private static void saveList(String temp) {

		try {
			Writer fw = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(temp);
			bw.flush();
			bw.close();
			System.out.println("프로그램 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
