package com.kataPractice;

public class ISBN {
	String isbn;
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean isVaildISBN() {
		isbn = isbn.replaceAll(" ", "");
		isbn = isbn.replaceAll("-", "");
		if (isbn.length() != 13 && isbn.length() != 10)
			return false;
		try {
			if (getCheckDigit() == getDigitByPosition(isbn.length() - 1))
				return true;
		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}

	private int getCheckDigit() {
		if (isbn.length() == 13) {
			int summing = 0;
			for (int i = 0; i < 12; i = i + 2) {
				summing = summing + getDigitByPosition(i);
				summing = summing + getDigitByPosition(i + 1) * 3;
			}
			return (10 - summing % 10) % 10;
		}else if(isbn.length() == 10){
			int summing = 0;
			for (int i =0; i < 9; i = i +1){
				summing = summing + (i+1)*getDigitByPosition(i);
			}
			return summing % 11;
		}
		return -1;
	}

	private int getDigitByPosition(int position) {
		return Integer.parseInt(isbn.substring(position, position + 1));
	}
	
	public boolean isVaildISBN(String isbn){
		setISBN(isbn);
		return isVaildISBN();		
	}
}
