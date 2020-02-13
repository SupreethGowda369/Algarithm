package com.java.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(60);
		queue.add(10);
		queue.add(30);
		queue.add(20);
		queue.add(60);
		queue.add(40);
		queue.add(50);
		
		System.out.println("Size :"+queue.size());
		
		Iterator<Integer> x = queue.iterator();
		while(x.hasNext()==true)
		{
			System.out.print(x.next()+" ");
		}
		
		System.out.println("\nSize : "+queue.size());

		while(queue.size()>0)
		{
			System.out.print(queue.poll()+" ");
		}
		
		System.out.println("\nSize : "+queue.size());
	}
}
