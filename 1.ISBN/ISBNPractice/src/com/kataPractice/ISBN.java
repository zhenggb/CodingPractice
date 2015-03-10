package com.kataPractice;

public class ISBN {
	String isbn;
	
	public boolean isVaildISBN(String isbn){
		isbn = isbn.replaceAll(" ", "");
		isbn = isbn.replaceAll("-", "");
		if(isbn.length() == 13){
			return new ISBN13(isbn).isVaildISBN();
		}
		if(isbn.length() == 10){
			return new ISBN10(isbn).isVaildISBN();
		}
		return false;		
	}
	
	protected boolean isVaildISBN() {
		try {
			if (getCheckDigit() == getDigitByPosition(isbn.length() - 1))
				return true;
		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}

	protected int getCheckDigit(){
		return -1;
	}

	protected int getDigitByPosition(int position) {
		return Integer.parseInt(isbn.substring(position, position + 1));
	}
}
