package com.kataPractice;

public class ISBN13 extends ISBN {
	public ISBN13(String isbn) {
		this.isbn = isbn;
	}

	protected String getCheckDigit() {
		int summing = 0;
		for (int i = 0; i < 12; i = i + 2) {
			summing = summing + getDigitByPosition(i);
			summing = summing + getDigitByPosition(i + 1) * 3;
		}
		return String.valueOf((10 - summing % 10) % 10);
	}
}
