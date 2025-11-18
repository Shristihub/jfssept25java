package com.concurrent.comfuture;

import java.util.concurrent.CompletableFuture;

public class Demo2ThenApply {

	public static void main(String[] args) {
		//task
		CompletableFuture<String> task1 = CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName());
			return "Happy weekday!!!";
		});
		//transform
		task1.thenApply(str->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("message: "+str);
			System.out.println("concat");
			return str.concat("Enjoy this");
		})
		//transform
		.thenApply(str->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("message: "+str); // "Happy weekday enjoy this
			System.out.println("format");
			return str.toUpperCase();
		})
		.thenAccept(str->System.out.println(str));
	}
}








