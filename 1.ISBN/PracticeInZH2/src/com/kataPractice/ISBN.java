package com.kataPractice;

public class ISBN {

	public static boolean verify(String isbnCode) {
		int sum = 0;
		int checkBit = 0;
		for(int i=0;i<11;i=i+2){
			int a = Integer.parseInt(Character.toString( isbnCode.charAt(i)));
			int b = Integer.parseInt(Character.toString( isbnCode.charAt(i + 1)));
			
			sum += a*1+ b*3;
		}

		checkBit = (10-sum%10)%10;
		if(checkBit==Integer.parseInt(Character.toString (isbnCode.charAt(12))))
			return true;
		else
			return false;
		
	}

}
