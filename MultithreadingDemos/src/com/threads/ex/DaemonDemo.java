package com.threads.ex;

class MyRunner implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class DaemonDemo {

	public static void main(String[] args) {
		Runnable task =  new MyRunner();
		Thread thread =  new Thread(task,"poppy");
		thread.setDaemon(true);
		thread.start();
		
		Runnable task1 = ()->{
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread1 =  new Thread(task1);
		thread1.start();
		
		Thread thread2 =  new Thread(()->{
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread2.start();
		System.out.println("main started");
		
		
		
	}
}








