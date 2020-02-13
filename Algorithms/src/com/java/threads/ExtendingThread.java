package com.java.threads;

class ThreadOne extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Extending Thread Class One...");
		}
	}
}

class ThreadTwo extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Extending Thread Class Two...");
		}
	}
}

public class ExtendingThread {

	public static void main(String[] args) {
		
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();
	}
}
