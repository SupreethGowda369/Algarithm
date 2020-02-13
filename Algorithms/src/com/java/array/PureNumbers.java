package com.java.array;

import java.util.Scanner;

public class PureNumbers { 

	static void findNumber(int num) 
	{ 
		String[] array = new String[num+1];  
		array[0] = ""; 
		int curSize = 1; //Current size 
		int eleAdd = 1;  //Elements Added
		
		while (curSize <= num) 
		{  
			for (int i = 0; i < eleAdd && (curSize+i) <= num; i++) { 
				array[curSize + i] = "44" + array[curSize - eleAdd + i]; 
			}
			
			for (int i = 0; i < eleAdd && (curSize + eleAdd + i) <= num; i++) {
				array[curSize + eleAdd + i] = "55" + array[curSize - eleAdd + i]; 
			}
			eleAdd = eleAdd * 2;
 
			curSize = curSize + eleAdd; 
		} 
		System.out.print(array[num] + "\n");
	} 
	
	public static void main (String[] args) { 
		Scanner sc = null;
		        sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		System.out.println("Elements are : ");
		for (int i = 0; i < size; i++) {
			System.out.print(i+1 + " -> ");
			findNumber(i+1); 
		}
		sc.close();
	} 
} 
