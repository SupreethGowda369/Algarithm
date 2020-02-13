package com.java.threads;

public class SynchronizedBlock {

	static String s1 = "IBM India";
	
	public static void main(String[] args) {
		
		Runnable RUN1 = () -> {
			synchronized (s1) {
				s1 = s1 + " Welcomes";
				System.out.println(s1);
			}
		};
		
		Runnable RUN2 = () -> {
			synchronized (s1) {
				s1 = s1 + " World";
				System.out.println(s1);
			}
		};
		
		Thread t1 = new Thread(RUN1);
		Thread t2 = new Thread(RUN2);
		
		t1.start();
		t2.start();
	}
}
