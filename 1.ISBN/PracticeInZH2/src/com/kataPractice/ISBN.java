package com.kataPractice;

public class ISBN {

	public static boolean verify(String isbnCode) {
		if (checkSpaceAndReq(isbnCode)) {
			return false;
		}
		isbnCode = isbnCode.replaceAll(" ", "");
		
		isbnCode = isbnCode.replaceAll("-", "");
		
		if (isbnCode.length() != 13) {
			return false;
		}
		
		int sum = 0;
		int checkBit = 0;
		for(int i=0;i<11;i=i+2){
			int oddNum = getOneNumber(isbnCode, i);
			int evenNum = getOneNumber(isbnCode, i+1);
			
			sum += oddNum*1+ evenNum*3;
		}

		checkBit = (10-sum%10)%10;
		if(checkBit==getOneNumber(isbnCode, 12))
			return true;
		else
			return false;
		
	}

	private static boolean checkSpaceAndReq(String isbnCode) {
		return isbnCode.contains(" ") && isbnCode.contains("-");
	}

	private static int getOneNumber(String isbnCode, int i) {
		return Integer.parseInt(Character.toString( isbnCode.charAt(i)));
	}

}
