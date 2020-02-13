package com.java.algorithms;

public class BubbleSort {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] a = {11,22,11,33,55,44,99,66,88,77};
		int[] array = searchElement(a);
		
		System.out.print("Bubble sort :" + "[");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
	
	public static int[] searchElement(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int temp ;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>=a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}

