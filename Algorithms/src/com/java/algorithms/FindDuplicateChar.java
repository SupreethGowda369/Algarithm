package com.java.algorithms;

import java.io.*;
import java.util.Scanner;

public class FindDuplicateChar {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException { 
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the Statement : ");

		String string = scan.nextLine();
		int count=0, len=0;
		
		do {  
			try {
				char ch[] = string.toCharArray();
				len = ch.length;
				count = 0;
				
				for(int j=0; j<len; j++) {
					if((ch[0] == ch[j]) && ((ch[0] >= 65 && ch[0] <= 91)
							||(ch[0] >= 97 && ch[0] <= 123))) {
						count++;
					}		
				}	
				
				if(count != 0) {
					System.out.println(ch[0] + " : " + count + " Times");
				}
				
				string = string.replace(""+ch[0],"");   
				
			} catch(Exception e) {
				System.out.println(e);
			}
		} while(len!=1);
	}
}
