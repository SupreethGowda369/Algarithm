package com.java.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> l1 = new LinkedHashSet<Object>();
		
		l1.add(10);
		l1.add(10.75);
		l1.add("Java");
		l1.add("J2ee");
		l1.add(null);
		l1.add(null);
		l1.add(10);
		
		System.out.println(l1);	
	}
}
