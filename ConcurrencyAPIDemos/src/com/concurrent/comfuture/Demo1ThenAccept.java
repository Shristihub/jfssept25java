package com.concurrent.comfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo1ThenAccept {

	public static void main(String[] args) {
		//task
		CompletableFuture<String> task1 = CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Happy weekday";
		});
		
		//accepts and prints the data
		task1.thenAccept(str->System.out.println(str.toUpperCase()));
		System.out.println("in main");
		
		try {
			//blocking io
			System.out.println(task1.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		task1.thenAccept(str->System.out.println(str.toUpperCase()));
		System.out.println("in main completed");
	}
}
