package com.java.threads;

public class LambdaFunction {

	public static void main(String[] args) {
		
		Runnable RUN1 = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Lambda Functions One....");
			}
		};
		
		Runnable RUN2 = () ->  {
			for (int i = 0; i < 3; i++) {
				System.out.println("Lambda Functions Two....");
			}
		};
		
		Thread t1 = new Thread(RUN1);
		Thread t2 = new Thread(RUN2);
		
		t1.start();
		t2.start();
	}
}
