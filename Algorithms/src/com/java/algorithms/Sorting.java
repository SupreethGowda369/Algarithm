package com.java.algorithms;

import java.util.Collections;
import java.util.LinkedList;

public class Sorting {

	public static void main(String[] args) {
	
		LinkedList<Integer> array = new LinkedList<>();
		
		array.add(40);
		array.add(10);
		array.add(50);
		array.add(20);
		array.add(70);
		array.add(60);
		array.add(30);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		
		Collections.sort(array);
		
		System.out.println();
		System.out.println("Ascending order :");
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Descending order :");
		Collections.sort(array, Collections.reverseOrder());
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
	}
}
