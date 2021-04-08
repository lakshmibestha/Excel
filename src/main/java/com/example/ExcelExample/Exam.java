package com.example.ExcelExample;

public class Exam {

	public static void main(String[] args) {

		String str = "abccbd";
		int[] c = { 0, 1, 2, 3, 4, 5 };
		System.out.println("\nc return value = " + test(str, c));
	}

	private static int test(String str, int[] intArr) {

		int retunValue = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'c' && intArr[i] == 2) {
				retunValue = intArr[i];
			} else {
				System.out.print(str.charAt(i));
			}

		}

		return retunValue;
	}

}
