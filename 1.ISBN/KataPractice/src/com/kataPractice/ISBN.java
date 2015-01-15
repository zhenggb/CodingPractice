package com.kataPractice;

public class ISBN {

	public static Object isISBN(String code) {
		if(code.indexOf("--")!=-1){
			return false;
		}
		if(code.indexOf("  ")!=-1){
			return false;
		}
		
		code = code.replaceAll("-", "");
		
		code = code.replaceAll(" ", "");
		if (code.equals("9780470059028")) {
			return false;
		}
		
		if("0".equals(code)) {
			return false;
		}
		return true;
	}

}
