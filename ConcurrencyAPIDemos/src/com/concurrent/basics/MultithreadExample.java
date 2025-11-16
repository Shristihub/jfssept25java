package com.concurrent.basics;

public class MultithreadExample {

	// old way
	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			// creating the thread
			Thread thread = new Thread(() -> {
				System.out.println(Thread.currentThread().getName());
			});
			// start and execute
			thread.start();
		}

		System.out.println("main started");

	}
}
