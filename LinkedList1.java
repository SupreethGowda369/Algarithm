package com.java.collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(20);
		list.add(0,10);
		list.add(40);
		list.addLast(60);
		list.addFirst(50);
		list.add(30);
		
		for(Integer x :list)
		{
			System.out.print(x +" ");
		}
		
		System.out.println();
		
		Iterator<Integer> x = list.descendingIterator();
		while(x.hasNext()==true)
		{
			System.out.print(x.next()+" ");
		}
		
		System.out.println();
		
		Collections.sort(list);
		for(Integer x1 :list)
		{
			System.out.print(x1 +" ");
		}
		
		System.out.println();
		
		while(list.size()>0)
		{
			System.out.print(list.poll()+" ");
		}	
	}
}
