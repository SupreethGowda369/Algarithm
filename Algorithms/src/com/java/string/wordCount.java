package com.java.string;

import java.util.Scanner;

public class wordCount {

	public static void countWord(String sentence) {
		
		String[] wordCount = sentence.split(" ");
		System.out.println(wordCount.length);
		
		/*--------------------OR------------------*/
		
		char[] WordCount = sentence.toCharArray();
		int count = 1;
		for (int i = 0; i < WordCount.length-1; i++) {
			if(WordCount.length > 0) {
				if (WordCount[i] == ' ' && WordCount[i+1] != ' ') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		countWord(str);
	}
}
