package com.java.oops;

public class ClassAndObject {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		Account.dispBalance();
		System.out.println();
		
		a1.checkBalance();
		String s=a1.deposit(2000);
		System.out.println(s);
		
		System.out.println();
		a1.checkBalance();
		
		System.out.println();
		s=a1.withdraw(3345.00); 
		a1.checkBalance();
		
		System.out.println(s);
		
		System.out.println("--------------------------------------------");
		
		Account a2 = new Account();
		a2.checkBalance();
		
		String s1=a2.deposit(2000);
		System.out.println(s1);
		System.out.println();
		a2.checkBalance();
		a1.checkBalance();
		
		System.out.println();
		s1=a2.withdraw(2345.5); 
		a2.checkBalance();
		System.out.println(s1);
	}
}

