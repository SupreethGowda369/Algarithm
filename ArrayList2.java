package com.java.collections.list;

import java.util.ArrayList;

public class ArrayList2 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(10.55);
		a1.add("Java");
		a1.add(null);
		a1.add(null);
		a1.add("Java");
		a1.add(2,"Springs");
		a1.set(0, 20);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("-----------------");
		for(Object i:a1)
		{
			System.out.println(i);
		}
	}
}
