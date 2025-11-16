package com.threads.ex;

class Runner implements Runnable{
	String name; 
	public Runner(String name, int priority) {
		super();
		this.name = name;
		Thread thread = new Thread(this,name);
		thread.setPriority(8);
		thread.start();
	}
	@Override
	public void run() {
		System.out.println("hello ");
		Greeter greeter =  new Greeter();
		System.out.println(greeter.greetUser(name));
	}
}
public class MainRunDemo {
	public static void main(String[] args) {
		Runner runner1 = new Runner("Runner-1",5);
		Runner runner2 = new Runner("Runner-2",5);
		Runner runner3 = new Runner("Runner-3",5);
//		Thread thread1 = new Thread(runner, "Runner");
//		thread1.start();
//		Thread thread2 = new Thread(runner, "Runner");
//		thread2.start();
//		Thread thread3 = new Thread(runner, "Runner");
//		thread3.start();
	
	
	
	}

}
