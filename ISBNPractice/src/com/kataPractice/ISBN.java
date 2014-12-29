package com.kataPractice;

public class ISBN {

	public static boolean isVaildISBN(String isbn) {
		int summing = 0;
		for (int i = 0; i < 12; i = i + 2) {
			summing = summing + Integer.parseInt(isbn.substring(i, i + 1));
			summing = summing + Integer.parseInt(isbn.substring(i + 1, i + 2)) * 3;
		}
		int checkDigit = (10 - summing % 10) % 10;
		if (checkDigit == Integer.parseInt(isbn.substring(12, 13)))
				return true;
		return false;
	}

}
