package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FixedPool {
	
	public void threadStatus() {
		System.out.println("FixedThreadPool executed....");
	}
}

public class FixedThreadpool {

	public static void main(String[] args) {
		
		FixedPool fp = new FixedPool();
		
		Runnable r1 = () -> {
			fp.threadStatus();
		};
		
		Runnable r2 = () -> {
			System.out.println("Available Processors.....");
		};
		
		int nThreads = 5;
		
		ExecutorService ftp = Executors.newFixedThreadPool(nThreads);
		
		for (int i = 0; i < nThreads; i++) {
			ftp.submit(r1);
		}
		
		int nThread = Runtime.getRuntime().availableProcessors();
		
		ExecutorService ftp1 = Executors.newFixedThreadPool(nThread);
		
		for (int i = 0; i < nThread; i++) {
			ftp1.submit(r2);
		}
	}
}
