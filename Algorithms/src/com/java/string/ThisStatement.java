package com.java.string;

class Statement {
	
	public Statement(int a) {
		this(2,3);
		System.out.println(a*a);
	}
	
	public Statement(int a, int b) {
		this(2,3,4);
		System.out.println(a*b);
	}
	
	public Statement(int a, int b, int c){
		System.out.println(a*b*c);
	}
}

public class ThisStatement {

	public static void main(String[] args) {
		new Statement(2);
	}
}
