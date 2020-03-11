package com.java.algorithms;

import java.util.Scanner;

public class FactorialSum {

	private static void getFactorialSum(int number) {
		
		int N = number, rem = 0, sum = 1, factSum = 0;
		
		while(N > 0) {
			rem = N%10;
			for (int i = 1; i <= rem; i++) {
				sum = sum*i;
			}
			factSum = factSum + sum;
			N = N/10;
			rem = 0;
			sum = 1;
		}
		System.out.println("Factorial Sum -> " + factSum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = null;
				scanner = new Scanner(System.in);
				
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		getFactorialSum(number);
		
		scanner.close();
	}
}
