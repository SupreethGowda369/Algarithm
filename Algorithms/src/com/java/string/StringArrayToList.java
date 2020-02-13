package com.java.string;

import java.util.Arrays;
import java.util.List;

public class StringArrayToList {

	public static void main(String[] args) {
		
		String[] vowels = { "a", "e", "i", "o", "u", "a", "o" };
		
		List<String> vowelsList = Arrays.asList(vowels);
		System.out.println("vowelsList = "+vowelsList);
		//vowelsList.add("x"); //java.lang.UnsupportedOperationException
		
		vowelsList.set(0, "x"); //allowed because no structural modification
		System.out.println("vowelsList = "+vowelsList);

	}
}
