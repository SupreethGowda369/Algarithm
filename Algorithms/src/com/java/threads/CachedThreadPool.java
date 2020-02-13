package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Cachedpool {
	
	public void threadStatus() {
		System.out.println("CachedThreadPool executed....");
	}
}

public class CachedThreadPool {

	public static void main(String[] args) {
		
		Cachedpool cp = new Cachedpool();
		
		Runnable r1 = () -> {
			cp.threadStatus();
		};
		
		ExecutorService ctp = Executors.newCachedThreadPool();
		ctp.submit(r1);
	}
}
