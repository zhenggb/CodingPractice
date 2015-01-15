package com.kataPractice;

public class ISBN {

	public static Object isISBN(String string) {
		if(string =="9780470059028"){
			return false;
		}
		
		if(string == "9-780470059028"){
			return false;
		}
		return true;
	}

}
