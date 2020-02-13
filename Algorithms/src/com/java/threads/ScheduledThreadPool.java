package com.java.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledPool {
	
	public void statusSchedule() {
		System.out.println("Schedule() executed....");
	}
	
	public void fixedRate() {
		System.out.println("ScheduleAt \'FixedRate\' executed....");
	}
	
	public void fixedDelay() {
		System.out.println("ScheduleWith \'FixedDelay\' executed....");
	}
}
public class ScheduledThreadPool {

	public static void main(String[] args) {

		ScheduledPool sp = new ScheduledPool();
		
		Runnable RUN1 = () -> {
			sp.statusSchedule();
		};
		
		Runnable RUN2 = () -> {
			sp.fixedRate();
		};
		
		Runnable RUN3 = () -> {
			sp.fixedDelay();
		};
		
		ScheduledExecutorService stp = Executors.newScheduledThreadPool(5);
		
		stp.schedule(RUN1, 1, TimeUnit.SECONDS);
		stp.scheduleAtFixedRate(RUN2, 2, 2, TimeUnit.SECONDS);
		stp.scheduleWithFixedDelay(RUN3, 3, 3, TimeUnit.SECONDS);	
	}
}
