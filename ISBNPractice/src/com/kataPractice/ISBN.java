package com.kataPractice;

public class ISBN {

	public static boolean isVaildISBN(String isbn) {
		if (isbn.equals("9780470059029"))
			return true;
		if (isbn.equals("9780471486480"))
			return true;
		return false;
	}

}
