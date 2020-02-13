package com.java.array;

import java.util.stream.IntStream;

public class SecondHighestNum {

	public static void main(String[] args) {
		
		int[] array = {54,32,65,13,78,92,12};
		
		int[] copyTo = java.util.Arrays.copyOfRange(array,0,array.length);
		
		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(array[i] + " " + copyTo[i]);
		}
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = i; j < array.length; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		IntStream.of(array)
				 .sorted()
				 .skip(array.length - 1)
				 .forEach(i -> System.out.print("Second maximum number is : " + array[1] + " "));
		System.out.println("\nSecond maximum number is : " + array[1]);
	}
}
