package com.java.algorithms;

import java.util.Scanner;

public class PrimeAndFibonacci {

	public static int findFibonacci(int n) {

		if (n == 1 || n == 2)
			return 1;
		return findFibonacci(n - 1) + findFibonacci(n - 2);
	}

	public static int findPrime(int n) {

		int count = 0, j = 2;
		while (count < n) {
			int flag = 0;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				count++;
				if (count == n) {
					return j;
				}
			}
			j++;
		}
		return j;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position"); 
		int n = sc.nextInt();
		
		int result = 0;

		if( n%2 != 0) { 
			result = findFibonacci((n/2)+1); 
		} 
		else { 
			result = findPrime(n/2); 
		}
		
		if(n == 1) {
			System.out.printf("%dst Element is : %d ", n, result);
		}
		else if(n == 2) {
			System.out.printf("%dnd Element is : %d ", n, result);
		}
		else if(n == 3) {
			System.out.printf("%drd Element is : %d ", n, result);
		}
		else {
			System.out.printf("%dth Element is : %d ", n, result);
		}
		
		System.out.println();
		
		System.out.print("The nth series is : [");
		for (int x = 1; x <= n; x++) {
			if (x % 2 != 0) {
				result = findFibonacci((x/2) + 1);
				System.out.print(result + " ");
			} else {
				result = findPrime(x/2);
				System.out.print(result + " ");
			}
		}
		System.out.print("]");
	}
}
