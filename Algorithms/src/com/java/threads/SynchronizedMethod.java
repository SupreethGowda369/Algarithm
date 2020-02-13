package com.java.threads;

class Counter {
	
	private  int value = 0;
	
	synchronized public  void increment() {
		value++;
	}
	
	synchronized public  void decrement() {
		value--;
	}
	
	synchronized public void showValue() {
		System.out.println("Value is : " + value);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
	
		Counter c =  new Counter();
		
		Runnable RUN1 = () -> {
			c.increment();
			c.showValue();
		};
		
		Runnable RUN2 = () -> {
			c.decrement();
			c.showValue();
		};
		
		Thread t1 = new Thread(RUN1);
		Thread t2 = new Thread(RUN2);
		
		t1.start();
		t2.start();
	}
}
