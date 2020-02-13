package com.java.threads;

class ThreadRun implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Implementing Runnable Interface.......");
		}	
	}
}

public class ImplementingThread {

	public static void main(String[] args) {
		ThreadRun run = new ThreadRun();
		Thread t1 = new Thread(run);
		
		t1.start();
	}
}
