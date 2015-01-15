package com.kataPractice;

public class ISBN {
	String isbn;
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean isVaildISBN() {
		isbn = isbn.replaceAll(" ", "");
		isbn = isbn.replaceAll("-", "");
		if (isbn.length() != 13)
			return false;
		try {
			int summing = 0;
			for (int i = 0; i < 12; i = i + 2) {
				summing = summing + getDigitByPosition(i);
				summing = summing + getDigitByPosition(i + 1) * 3;
			}
			int checkDigit = (10 - summing % 10) % 10;
			if (checkDigit == getDigitByPosition(12))
				return true;
		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}

	private int getDigitByPosition(int position) {
		return Integer.parseInt(isbn.substring(position, position + 1));
	}
	
	public boolean isVaildISBN(String isbn){
		setISBN(isbn);
		return isVaildISBN();		
	}
}
