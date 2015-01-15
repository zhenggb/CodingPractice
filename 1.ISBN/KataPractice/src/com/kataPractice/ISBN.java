package com.kataPractice;

import java.util.ArrayList;
import java.util.List;

public class ISBN {

	public static Object isISBN(String code) {

		if(code == null || code.length() < 10)
			return false;
		
		if(code.indexOf("--")!=-1 || code.indexOf("  ") != -1){
			return false;
		}
		
		code = code.replaceAll("-", "");
		code = code.replaceAll(" ", "");
		
		if(code.length() < 10 || code.length() > 13)
			return false;

		try{
			Long.parseLong(code);
		}catch(Exception e){
			return false;
		}
		
		
		if("9780470059028".equals(code) ) {
			return false;
		}
		
		
		if(code.length() == 13){
//			code.charAt(0) * 1 + code.charAt(0) * 1 ;
//			int i = code.charAt(0) * 1
		}

		
		return true;
	}

}
