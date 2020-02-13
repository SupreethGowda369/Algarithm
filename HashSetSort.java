package com.java.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetSort 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		h1.add(11);
		h1.add(11);
		h1.add(55);
		h1.add(33);
		h1.add(22);
		h1.add(44);
	
		System.out.println(h1);
		
		List<Integer> list = new ArrayList<Integer>(h1);
		Collections.sort(list);	
		System.out.println(list);
	}
}
