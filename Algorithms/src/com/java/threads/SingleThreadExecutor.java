package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThread {
	
	public void threadStatus() {
		System.out.println("SingleThreadExecutor1 executed....");
		System.out.println("SingleThreadExecutor2 executed....");
		System.out.println("SingleThreadExecutor3 executed....");
	}
}

public class SingleThreadExecutor {

	public static void main(String[] args) {
		
		SingleThread st = new SingleThread();
		
		Runnable r1 = () -> {
			st.threadStatus();
		};
		
		ExecutorService ste =  Executors.newSingleThreadExecutor();
		
		ste.submit(r1);
	}
}
