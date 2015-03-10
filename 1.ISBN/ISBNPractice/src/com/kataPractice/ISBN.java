package com.kataPractice;

public class ISBN {
	String isbn;
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean isVaildISBN() {
		try {
			if (getCheckDigit() == getDigitByPosition(isbn.length() - 1))
				return true;
		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}

	protected int getCheckDigit() {
		int summing = 0;
		for (int i = 0; i < 9; i = i + 1) {
			summing = summing + (i + 1) * getDigitByPosition(i);
		}
		return summing % 11;
	}

	protected int getDigitByPosition(int position) {
		return Integer.parseInt(isbn.substring(position, position + 1));
	}
	
	public boolean isVaildISBN(String isbn){
		isbn = isbn.replaceAll(" ", "");
		isbn = isbn.replaceAll("-", "");
		if (isbn.length() != 13 && isbn.length() != 10)
			return false;
		setISBN(isbn);
		if(isbn.length() == 13){
			return new ISBN13(isbn).isVaildISBN();
		}
		return isVaildISBN();		
	}
}
