package com.java.array;

import java.util.Scanner;

public class ArithmaticSeries {

	private static void arithSeries(int start, int diff, int size) {
		
		if (size > 0 && size <= 20) {
			int arith_series = 0;
			
			for (int i = 1; i <= size; i++) {
				arith_series = start + (i-1)*diff;
				if (arith_series > 0) {
					System.out.print(arith_series + " ");
				}
				else {
					break;
				}
			}
		} 
		else {
			System.out.println("Beyond limits...");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = null;
		        sc = new Scanner(System.in);
		        
		System.out.println("Enter the starting number");
		int start = sc.nextInt();
		
		System.out.println("Enter the common difference");
		int diff = sc.nextInt();
		
		System.out.println("Enter the nth series size");
		int size = sc.nextInt();
		
		System.out.println("Excpected output:");
		arithSeries(start, diff, size);
		sc.close();
	}
}
