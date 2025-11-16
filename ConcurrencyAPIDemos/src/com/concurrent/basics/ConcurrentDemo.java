package com.concurrent.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentDemo {
//please finish both examples
	public static void main(String[] args) {
		// create a thread pool using Executors
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 1; i < 50; i++) {
			service.execute(()->{
				System.out.println(Thread.currentThread().getName()+ " ");
			
			});
		}
		service.shutdown();

	}
}


