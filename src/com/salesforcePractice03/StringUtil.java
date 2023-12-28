package com.salesforcePractice03;

public class StringUtil {

	public static String concatString(String[] arr) {
		
		String result = "hi";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;

	}

}