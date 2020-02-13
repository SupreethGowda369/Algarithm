package com.java.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetSort 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>();
		
		hash.add(60);
		hash.add(20);
		hash.add(10);
		hash.add(30);
		hash.add(40);
		hash.add(50);
		hash.add(30);
		
		System.out.println(hash);
		
		List<Integer> list = new ArrayList<Integer>(hash);
		Collections.sort(list);
		System.out.println(list);
	}
}
