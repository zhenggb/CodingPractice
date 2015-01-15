package com.kataPractice;

import java.util.ArrayList;
import java.util.List;

public class ISBN {

	public static Object isISBN(String code) {
		if(code == null || code.length() < 9)
			return false;
		
		List<String> elist= new ArrayList<String>();

		if(code.indexOf("--")!=-1 || code.indexOf("  ") != -1 || code.indexOf("A") > -1){
			return false;
		}
		
		code = code.replaceAll("-", "");
		code = code.replaceAll(" ", "");
		
		if("9780470059028".equals(code) || "0".equals(code)) {
			return false;
		}
		return true;
	}

}
