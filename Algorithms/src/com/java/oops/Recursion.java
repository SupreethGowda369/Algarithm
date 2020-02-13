package com.java.oops;

public class Recursion 
{
	public static void main(String[] args) 
	{
		recursion(10);
	}
	
	public static void recursion(int num)
	{
		if(num>=0)
		{
			recursion(num-1);
		}
		System.out.println(num);
	}
}


