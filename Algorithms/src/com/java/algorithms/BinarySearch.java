package com.java.algorithms;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] a = {10,20,30,40,50,60,70,80,90};
		int index = searchElement(a,10);
		
		if(index != -1)
			System.out.println("Index is : " + index);
		else
			System.out.println("Element not found");
	}

	public static int searchElement(int[] a, int num) 
	{
		int low = 0;
		int high = a.length-1;
		
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if(a[mid] == num)
				return mid;
	
			else if(num > a[mid])
				low = mid+1;

			else
				high = mid-1;
		}
		return -1;
	}
}

