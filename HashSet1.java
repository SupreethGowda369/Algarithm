package com.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		
		h1.add(10);
		h1.add(10.5);
		h1.add("Java");
		h1.add("Collections");
		h1.add(null);
		h1.add(null);
	
		System.out.println(h1);
		
		Iterator x = h1.iterator();
		while(x.hasNext()!=false)
		{
			System.out.println(x.next());
		}
	}
}
