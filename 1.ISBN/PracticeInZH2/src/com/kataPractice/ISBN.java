package com.kataPractice;

public class ISBN {

	public static boolean verify(String ISBNstr) {
		int sum = 0;
		for(int i=0;i<ISBNstr.length();i=i+2){
			sum += (ISBNstr.charAt(i)-41)*1+(ISBNstr.charAt(i+1)-41)*3;
			
		}
		sum = (10-sum%10)%10;
		if(sum==(ISBNstr.charAt(13)-41))
				return true;
		else
			 return false;
		
	}

}
