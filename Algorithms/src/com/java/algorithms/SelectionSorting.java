package com.java.algorithms;

public class SelectionSorting {
	
	public static void main(String[] args) {
		int[] a = {11,22,11,33,55,44,99,66,88,77};
		searchElement(a);
	}
	
	public static void searchElement(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			int temp ;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>=a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
	}
}
