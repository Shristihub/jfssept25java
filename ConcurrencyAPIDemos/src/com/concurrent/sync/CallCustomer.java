package com.concurrent.sync;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallCustomer {

	public static void main(String[] args) {
		Bank bank = new Bank();
		// implement Callable - task
		Callable<Double> call = ()->{
			System.out.println("New task");
			System.out.println("inside run"+Thread.currentThread().getName());
			double interest = bank.calcInterest("Pri",2000);
			return interest;
		};
		ExecutorService executorService =  Executors.newFixedThreadPool(10);
//		represents the result of an asynchronous computation.  
//		Methods are provided to check if the computation is
//		 complete, to wait for its completion, and to retrieve the result of
//		 the computation.
		Future<Double> future = executorService.submit(call);
		try {
			System.out.println("interest is "+future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println();
		Future<String> futurestr = executorService.submit(()->{
			System.out.println("Greeting message");
			return "Welcome to Async";
		});
	
		try {
			System.out.println(futurestr.cancel(true));
			System.out.println(futurestr.isCancelled());
			System.out.println(futurestr.isDone());
			System.out.println("msg: "+futurestr.get());
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}











