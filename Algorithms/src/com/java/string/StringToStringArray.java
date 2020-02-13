package com.java.string;

import java.util.Arrays;

public class StringToStringArray {
	
	public static void main(String[] args) {

		String str = "a,e,i,o,u";
		String[] vowels = str.split(",");
		System.out.println(str);
		System.out.println(Arrays.toString(vowels)); //[a, e, i, o, u]
		
		String[] vowels1 = { "a", "e", "i", "o", "u" };
		System.out.println(vowels1);
		System.out.println(Arrays.toString(vowels1));
		
		String code = "code";
		System.out.println(code);
		StringBuilder sb = new StringBuilder(code);
		code = sb.reverse().toString();
		System.out.println(code);
	}
}
