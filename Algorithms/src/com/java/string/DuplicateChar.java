package com.java.string;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String str = "IBMINDIAI";
		
		char[] ch = str.toCharArray();
		String res = "";
		
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					res = res + str.charAt(i);
					break;
				}
			}
		}
		
		System.out.println("Duplicte values are : ");
		for (int i = 0; i < res.length(); i++) {
			System.out.println(res.charAt(i));
		}  
	}
}
