package com.threads.ex;

class Child extends Thread {
	String name;

	Child(String name, int priority) {
		super(name);
		this.name = name;
		this.setPriority(priority);
		this.start();
	}

	@Override
	public void run() {
		System.out.println("Current Thread " + name);
		System.out.println("In run method");
		for (int i = 1; i < 5; i++) {
			System.out.println(i + " X 2=" + 2 * i + " By child: " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MainEx {

	public static void main(String[] args) {
		Child t1 = new Child("Thread-11", 6);
		Child t2 = new Child("Thread-12", 6);
		Child t3 = new Child("Thread-10", 6);
		for (int i = 1; i < 5; i++) {
			System.out.println("main thread");
			System.out.println(i + " X 5=" + 5 * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("work completed");

	}
}
