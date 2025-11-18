package com.concurrent.comfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo4AnyOf {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
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
	
//        Returns a new CompletableFuture that is completed 
//        when any of the given CompletableFutures complete, with the same result. 
        CompletableFuture<Object> anyTask = CompletableFuture.anyOf(task1,task2);
       //non blocking
        anyTask.thenAccept(str->System.out.println(str));
        System.out.println(anyTask.get());
	}
}
