package com.java.string;

public class StringToInt {
  
	public static void main(String[] args) {
		
		String characterNumeric = "238";
		Integer convertedValue = Integer.parseInt(characterNumeric);
		System.out.println(convertedValue);
		
		Integer boxedValue = Integer.valueOf(238);
		String characterNumeric1 = boxedValue.toString();
		System.out.println(characterNumeric1);
		System.out.println(characterNumeric1.length());
    }
}
