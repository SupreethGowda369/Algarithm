package com.java.oops;

public class CustomException {
	
	public static void checkAge(int age) {
		try {
			if(age >= 18) {
				System.out.println("Age is : " + age);
			} 
			else {
				throw new AgeException("Caught AgeException");
			}
		} catch (AgeException e) {
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		checkAge(17);
	}
}
