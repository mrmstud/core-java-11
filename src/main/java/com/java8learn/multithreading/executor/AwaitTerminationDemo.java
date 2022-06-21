package com.java8learn.multithreading.executor;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationDemo {

	public static void main(String[] args) {
		/*
		 * Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue. 
		 * At any point, at most nThreads threads will be active processing tasks.
		 */
		ExecutorService ex = Executors.newFixedThreadPool(5);
		System.out.println(LocalDateTime.now());
		
		/* 25 tasks, each task takes 1 sec, since we have 5 threads, 25/5 = 5 sec, the work will be finished nin 5 sec */
		for(int i=0; i<25; i++) {
			ex.execute(new DemoThread(i));
		}
		
		ex.shutdown();
		try {
			ex.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(LocalDateTime.now());
		
	}

}

class DemoThread implements Runnable {
	int i;
	
	public DemoThread(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i + " ");
		try {
			Thread.sleep(1000); //sleep for 1 sec OR tasks takes 1 seconds to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
