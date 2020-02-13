package com.java.string;

import java.util.Scanner;

public class CharCaseSwap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.nextLine();
		
		char[] a = s.toCharArray();
		
		System.out.println("Enter the character you are looking for");
		System.out.println(s);
		String c = scanner.nextLine();
		
		char d = c.charAt(0);
		
		for (int i = 0; i <= s.length(); i++) {
			if (a[i] == d) {
				if (d >= 'a' && d <= 'z') {
					d -= 32;
				} else if (d >= 'A' && d <= 'Z') {
					d += 32;
				} else {
					System.out.println("Invalid request......");
				}
				a[i] = d;
				break;
			}
		}
		s = String.valueOf(a);
		System.out.println(s);
	}
}
