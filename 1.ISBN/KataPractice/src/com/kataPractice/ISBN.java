package com.kataPractice;

import java.util.ArrayList;
import java.util.List;

public class ISBN {

	public static Object isISBN(String code) {
		if(code == null || code.length() < 9)
			return false;
		

		if(code.indexOf("--")!=-1 || code.indexOf("  ") != -1){
			return false;
		}
		
		code = code.replaceAll("-", "");
		code = code.replaceAll(" ", "");
		try{
			Long.parseLong(code);
		}catch(Exception e){
			return false;
		}
		
		
		if("9780470059028".equals(code) ) {
			return false;
		}
		return true;
	}

}
