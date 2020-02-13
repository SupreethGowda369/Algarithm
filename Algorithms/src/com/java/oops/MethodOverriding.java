package com.java.oops;

class ClassSuper {
	
	final int x = 10;
	public void counter(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print(i*i + " ");
		}
	}
	
	public void display() {
		System.out.println("Superclass  display().....");
	}
	
	public void name() {
		System.out.println("Superclass.....");
	}
}

class ClassSub extends ClassSuper {
	
	@Override
	public void counter(int count) {
		for (int i = count; i > 0; i--) {
			System.out.print(i*i + " ");
		}
	}
	
	@Override
	public void name() {
		System.out.println("Subclass.....");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		ClassSuper cs = new ClassSub();
		cs.name();
		cs.display();
		
		ClassSub sub = new ClassSub();
		sub.name();
		sub.counter(5);
	}
}
