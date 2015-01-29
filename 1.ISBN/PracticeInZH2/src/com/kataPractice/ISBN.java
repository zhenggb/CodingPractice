package com.kataPractice;

public class ISBN {

	public static boolean verify(String ISBNstr) {
		int sum = 0;
		
		System.out.println(ISBNstr.length());
		
		for(int i=0;i<ISBNstr.length()-1;i=i+2){
			int a = Integer.parseInt(Character.toString( ISBNstr.charAt(i)));
			int b = Integer.parseInt(Character.toString( ISBNstr.charAt(i + 1)));
			
			System.out.println("a:"+a+"|b:"+b);
			
			sum += a*1+ b*3;
			
		}
		System.out.println(sum);
		sum = (10-sum%10)%10;
		System.out.println(sum);
		if(sum==Integer.parseInt(Character.toString (ISBNstr.charAt(13))))
				return true;
		else
			 return false;
		
	}

}
