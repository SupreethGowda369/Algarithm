package com.java.algorithms;

import java.util.Scanner;

public class NumberSorting {

	private static void getSortedNumber(int number) {
		int N = number, length = 0;
		while(N > 0) {
			N = N/10;
			length++;
		}
		
		int[] array = new int[length];
		
		N = number;
		int index = 0, rem = 0;
		
		while(N > 0) {
			rem = N%10;
			array[index] = rem;
			++index;
			N = N/10;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.print("Sorted Number -> ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = null;
				scanner = new Scanner(System.in);
				
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		getSortedNumber(number);
		
		scanner.close();
	}
}
