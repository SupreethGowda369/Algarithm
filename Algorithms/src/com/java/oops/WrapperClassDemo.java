package com.java.oops;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int x = 100;
		Integer i = new Integer(x);
		System.out.println(i);
		
		int y = i;
		System.out.println(y);
		
		int j = i.intValue();
		System.out.println(j);
		
		String str = "1234";
		System.out.println(str);
		int i1 = Integer.parseInt(str);
		System.out.println(i1);
		
		long l1 = Long.parseLong(str);
		System.out.println(l1);
		
		double d1 = Double.parseDouble(str);
		System.err.println(d1);	
	}
}
