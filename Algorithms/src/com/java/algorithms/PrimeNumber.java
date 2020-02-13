package com.java.algorithms;

import java.util.Scanner;

public class PrimeNumber {

	public static int findPrime(int n) {
		
		int count=0, j=2;
		
		while(count < n) {
			int flag=0;
			for(int i=2; i<j; i++) {
				if(j%i == 0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				count++;
				if(count == n) {
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
		
		result = findPrime(n); 
		
		if(n == 1) {
			System.out.printf("%dst Prime Number is : %d ", n, result);
		}
		else if(n == 2) {
			System.out.printf("%dnd Prime Number is : %d ", n, result);
		}
		else if(n == 3) {
			System.out.printf("%drd Prime Number is : %d ", n, result);
		}
		else {
			System.out.printf("%dth Prime Number is : %d ", n, result);
		}
		  
		System.out.println();
		
		System.out.print("Prime Number series is : [");
		for(int x = 1; x <= n; x++) {
			result = findPrime(x);	
			System.out.print(result + " ");
		}
		System.out.print("]");
	}
}
