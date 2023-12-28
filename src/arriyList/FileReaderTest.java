package arriyList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		String temp = getList();
		System.out.println(temp);

	}

	private static String getList() {
		String temp = null;
		try {
			Reader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);

			temp = br.readLine();
			br.close();
			System.out.println("프로그램 종료");

		} catch (IOException e) {
			e.printStackTrace();

		}
		return temp;

	}
}
