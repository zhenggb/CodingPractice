package com.kataPractice;

public class ISBN {

	public static boolean verify(String isbnCode) {
		isbnCode = isbnCode.replaceAll(" ", "");
		isbnCode = isbnCode.replaceAll("-", "");
		int sum = 0;
		int checkBit = 0;
		for(int i=0;i<11;i=i+2){
			int a = getOneNumber(isbnCode, i);
			int b = getOneNumber(isbnCode, i+1);
			
			sum += a*1+ b*3;
		}

		checkBit = (10-sum%10)%10;
		if(checkBit==getOneNumber(isbnCode, 12))
			return true;
		else
			return false;
		
	}

	private static int getOneNumber(String isbnCode, int i) {
		return Integer.parseInt(Character.toString( isbnCode.charAt(i)));
	}

}
