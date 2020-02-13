package com.java.algorithms;

import java.util.Scanner;

public class PowerSeries {

	private static long findSeries(long n) {
		
		if(n%2 != 0) 
			return (long) Math.pow(2, n/2);
		return (long) Math.pow(3, (n/2)-1);	
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position");
		int n = sc.nextInt();

		long result = 0;
		result = findSeries(n);
		
		if(n == 1) {
			System.out.printf("%dst Power Number is : %d ", n, result);
		}
		else if(n == 2) {
			System.out.printf("%dnd Power Number is : %d ", n, result);
		}
		else if(n == 3) {
			System.out.printf("%drd Power Number is : %d ", n, result);
		}
		else {
			System.out.printf("%dth Power Number is : %d ", n, result);
		}
		System.out.println();
		
		System.out.print("Power series is : [");
		for(int x = 1; x <= n; x++) {
			result = findSeries(x);
			System.out.print(result + " ");
		}
		System.out.print("]");
	}
}
