package com.kataPractice;

public class ISBN {

	public static boolean verify(String ISBNstr) {
		int sum = 0;
		for(int i=0;i<ISBNstr.length();i=i+2){
			int a = Integer.parseInt(Character.toString( ISBNstr.charAt(i)));
			int b = Integer.parseInt(Character.toString( ISBNstr.charAt(i + 1)));
			sum += a*1+ b*3;
			
		}
		System.out.print(sum);
		sum = (10-sum%10)%10;
		System.out.print(sum);
		if(sum==Integer.parseInt(Character.toString (ISBNstr.charAt(13))))
				return true;
		else
			 return false;
		
	}

}
