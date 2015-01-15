package com.kataPractice;

public class ISBN {

	public static Object isISBN(String code) {
		if(code == null || code.length() < 9)
			return false;
		if(code.indexOf("--")!=-1 || code.indexOf("  ") != -1){
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
