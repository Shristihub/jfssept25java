package com.threads.basics;

public class SleepDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " X 5=" + 5 * i);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
