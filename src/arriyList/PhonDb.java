package arriyList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class PhonDb {
	static ArrayList<String> temp = new ArrayList<>();

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String temp1 = sc.nextLine();
//		sc.close();
		//saveList(temp1);
		getList();
		name();
	}

	private static void saveList(String temp) {

		try {
			Writer fw = new FileWriter("C:\\Users\\User\\Desktop\\PhoneDB.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(temp);
			bw.flush();
			bw.close();
			System.out.println("프로그램 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static ArrayList<String> getList() {

		try {
			Reader fr = new FileReader("C:\\Users\\User\\Desktop\\PhoneDB.txt");
			BufferedReader br = new BufferedReader(fr);

			String tempStr = br.readLine();
			temp.add(tempStr);
			while (tempStr != null) {

				tempStr = br.readLine();
				temp.add(tempStr);

			}

			br.close();
			System.out.println(temp);

		} catch (IOException e) {
			e.printStackTrace();

		}
		return temp;

	}

	private static void name() {
		ArrayList<String> name1 = new ArrayList<>();
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(temp.get(i));
			//(temp.get(i).split("/"));
			System.out.println(temp.get(i).split("/"));
			// name1.add(temp.get(i).split("/",1));

			//System.out.println(temp);
		}
		System.out.println();

	}

	ArrayList<String> ph = new ArrayList<>();
	ArrayList<String> company = new ArrayList<>();
}
