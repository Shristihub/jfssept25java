package com.concurrent.comfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo3AllOf {

	public static void main(String[] args) {
		CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() ->{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Complete Task 1";
		});
		CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Complete Task 2";
		});
		

		//allOf
//		Returns a new CompletableFuture that is completed when all of the given CompletableFutures complete.
//		If any of the given CompletableFutures complete exceptionally, 
//		then the returned CompletableFuture also does so
        
		CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1,task2);
       
		//both the tasks are completed
        allTasks.thenRun(()->{
        	System.out.println(Thread.currentThread().getName());
        	System.out.println("All tasks");
			try {
				System.out.println(task1.get()+" "+task2.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
