package com.java.algorithms;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] a = {11,22,33,44,55,99,66,88,77};
		
		int res = searchElement(a,99);
		
		if(res != -1)
			System.out.println("Index is : " + res);
		else
			System.out.println("Element not found");	
	}
	
	public static int searchElement(int[] a,int num) {
		
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
			if(num == a[i]) {
				return i;
			}
		}
		return -1;	
	}
}
