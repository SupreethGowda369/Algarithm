package com.java.oops;

class SuperClass {
	
	int x = 10;
	public void  display() {
		System.out.println("SuperClass display()");
	}
}

class SubClass extends SuperClass{
	
	int x = 100;
	@Override
	public void  display() {
		System.out.println("SubClass display()");
	}
	
	public void show() {
		System.out.println(x);
		System.out.println(super.x);
		display();
		super.display();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		sub.show();
	}
}

