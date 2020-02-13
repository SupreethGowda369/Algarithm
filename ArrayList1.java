package com.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1
{
	public static void main(String[] args) 
	{
		List<String> a1 = new ArrayList<String>();
		
		a1.add("Java");
		a1.add("HTML");
		a1.add("CSS");
		a1.add("J2EE");
		a1.add("Springs");
		a1.add("SPRINGS");
		a1.add("Hibernate");
		a1.add("MySQL");
		a1.add("Python");
		
		Collections.sort(a1);		
		System.out.println(a1);
		
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println(a1.get(0));
		System.out.println(a1.remove(0));
		a1.clear();
		System.out.println("The element after remove : "+ a1);
	}
}
