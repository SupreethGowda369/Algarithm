package com.java.array;

import java.util.Scanner;

public class CheckDivisibility {

	private static int countDivisibility(int input, int[] array) {
		int count = 0, result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if((array[i] >= array[j]) && (array[i] % array[j]) == 0) {
					count++;
					if (count == 2) {
						break;
					}
				}
			}
			if (count == 2) {
				result++;
			}
			count = 0;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		        sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the element");
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("int[] array = {");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.print("}");
		
		int count = countDivisibility(size, array);
		System.out.println("\nNumber of divisable elements : " + count);
		
		sc.close();
	}
}
