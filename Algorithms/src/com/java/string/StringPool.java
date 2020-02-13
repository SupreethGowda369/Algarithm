package com.java.string;

import java.util.Arrays;

public class StringPool {

	public static void main(String[] args) {
		
		String a = "alpha";
		String b = "alpha";
		String c = new String("alpha");
		
		//All three strings are equivalent
		System.out.println(a.equals(b) && b.equals(c));
		
		//Although only a and b reference the same heap object
		System.out.println(a == b);
		System.out.println(a != c);
		System.out.println(b == c);
		
		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
		String[] dataCells = lineFromCsvFile.split(";");
		
		System.out.println(Arrays.toString(dataCells));

		System.out.println();
		
		for (int j=0; j < lineFromCsvFile.length(); j++) {
			if(lineFromCsvFile.charAt(j) != ';') {
				System.out.print(lineFromCsvFile.charAt(j));
			}
			else {
				System.out.print(" ");
			}
		}
	}
}
