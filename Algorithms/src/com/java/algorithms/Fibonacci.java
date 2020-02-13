package com.java.algorithms;

import java.util.Scanner;

public class Fibonacci {

	public static int findFibonacci(int n) {

		if (n == 1 || n == 2)
			return 1;
		return findFibonacci(n - 1) + findFibonacci(n - 2);
	}
		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position"); 
		int n = sc.nextInt();
		 
		int result = 0;
		
		result = findFibonacci(n); 
		
		if(n == 1) {
			System.out.printf("%dst Fibonacci Number is : %d ", n, result);
		}
		else if(n == 2) {
			System.out.printf("%dnd Fibonacci Number is : %d ", n, result);
		}
		else if(n == 3) {
			System.out.printf("%drd Fibonacci Number is : %d ", n, result);
		}
		else {
			System.out.printf("%dth Fibonacci Number is : %d ", n, result);
		}
		  
		System.out.println();
		
		System.out.print("Fibonacci series is : [");
		for(int x = 1; x <= n; x++) {
			result = findFibonacci(x);	
			System.out.print(result + " ");
		}
		System.out.print("]");
	}
}
