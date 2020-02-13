package com.java.collections.list;

import java.util.Vector;

public class Vector1
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
    {
		Vector a1 = new Vector();

        a1.add(10);
        a1.add(7.75);
        a1.add(10);
        a1.add(null); 
        a1.add("java");
        a1.add(null);

        for(int i=0;i<a1.size();i++)
        {
        	System.out.println(a1.get(i));
        }
    }
	
}
