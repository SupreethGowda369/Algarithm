package com.java.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(40);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(50);
		
		System.out.println(set);
		
		TreeSet<Integer> sort = (TreeSet<Integer>)set.descendingSet();
		System.out.println(sort);
		
		Iterator<Integer> x = set.descendingIterator();
		while(x.hasNext()== true)
		{
			System.out.println(x.next());
		}
	}
}
