package com.java.string;

import java.util.Arrays;

public class StringArrayIteration {

	public static void main(String[] args) {

		String[] vowels = {"a","i","u","e","o"};
				
		System.out.println("Before sorting :" + Arrays.toString(vowels));
		
		Arrays.sort(vowels);
				
		System.out.println("After sorting  :"+Arrays.toString(vowels));
	}
}
