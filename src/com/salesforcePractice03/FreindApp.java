package com.salesforcePractice03;

import java.util.Scanner;

public class FreindApp {

	public static void main(String[] args) {
		Freind[] friendArray = new Freind[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
			String fnd = sc.nextLine();
			String[] nfnd = fnd.split(" ");
			friendArray[i] =  new Freind(nfnd[0], nfnd[1], nfnd[2]);
		}

		for (int i = 0; i < friendArray.length; i++) {
			friendArray[i].showinfo();

		}
		sc.close();
	}
}
