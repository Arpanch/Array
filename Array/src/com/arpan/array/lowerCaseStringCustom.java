package com.arpan.array;

public class lowerCaseStringCustom {
	
	public static String lowerCaseStringCustom(String x){
		char[] stringChar=x.toCharArray();
		for(int i=0;i<stringChar.length;i++){
			stringChar[i]=(char) (stringChar[i] & '_');
		}
		return new String(stringChar);
		
	}
	public static void main(String[] args) {
		System.out.println(lowerCaseStringCustom("arpan"));
		char c=' ';
		System.out.println((int)c);
	}

}
