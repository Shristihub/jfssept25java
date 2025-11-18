package com.concurrent.comfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo5exception {

	public static void main(String[] args) {
		CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() ->{
			System.out.println(Thread.currentThread().getName());
			int x = 10/0;
			return "Complete Task 1";
		});
//	    .exceptionally(ex->ex.getMessage());

				
		CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			return "Complete Task 2";
		});
	
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
