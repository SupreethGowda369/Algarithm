package com.java.string;

import java.util.Random;

public class RandomOutput {

	public static void main(String[] args) {
		
		System.out.println(System.nanoTime()%10);
		
		/*---------------- OR ----------------- */
		
		Random random = new Random();
		System.out.println(random.nextInt(10));	
	}
}
