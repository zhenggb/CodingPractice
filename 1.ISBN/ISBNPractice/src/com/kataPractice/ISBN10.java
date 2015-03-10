package com.kataPractice;

public class ISBN10 extends ISBN {
	public ISBN10(String isbn) {
		this.isbn = isbn;
	}

	protected String getCheckDigit() {
		int summing = 0;
		for (int i = 0; i < 9; i = i + 1) {
			summing = summing + (i + 1) * getDigitByPosition(i);
		}
		String checkDigit = String.valueOf(summing % 11);
		if (checkDigit.equals("10"))
			checkDigit = "X";
		return checkDigit;
	}
}
