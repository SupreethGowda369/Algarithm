package com.java.oops;

interface Run {

	public void drive();
	
	public static void walk() {
		System.out.println("Walking Run......");
	}
	
	public default void sing() {
		System.out.println("Singig....");
	}
}

interface Run1 {
	public void repair();
	public void drive();
	
	public default void sing() {
		System.out.println("Singig....");
	}
	
	public static void walk() {
		System.out.println("Walking Run1......");
	}
}

class Sample implements Run, Run1 {

	@Override
	public void drive() {
		System.out.println("Driving....");
	}

	@Override
	public void repair() {
		System.out.println("Repair....");
	}

	@Override
	public void sing() {
		System.out.println("sing() overrided....");
		Run.super.sing();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.drive();
		s.repair();
		s.sing();
		
		Run.walk();
		Run1.walk();
	}
}
