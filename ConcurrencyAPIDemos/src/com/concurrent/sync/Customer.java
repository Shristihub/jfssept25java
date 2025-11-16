package com.concurrent.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Runner implements Runnable{
	private Bank bank;
	private String name;
	private double amount;
	public Runner( String name, double amount,Bank bank) {
		super();
		this.bank = bank;
		this.name = name;
		this.amount = amount;
	}
	@Override
	public void run() {
		System.out.println("inside my run "+Thread.currentThread().getName());
		double interest = bank.calcInterest(name, amount);
		System.out.println(interest);
		bank.payBills("mobile",2000);
		System.out.println();
	}
}
public class Customer {

	public static void main(String[] args) {
		Bank bank =  new Bank();
		//create a thread pool
		ExecutorService service = Executors.newFixedThreadPool(5);
		//pass the task inside execute method
		service.execute(new Runner("Raju",10000,bank));
		service.execute(new Runner("Rani",1000,bank));
		service.execute(new Runner("Rak",10000,bank));
		service.execute(new Runner("Rohan",1000,bank));
		service.execute(new Runner("Roni",10000,bank));
		service.execute(new Runner("Ra",1000,bank));
		System.out.println();
		
		String name = "Priya";
		double amount=5000;
		
		service.execute(()->{
			System.out.println("New task");
			System.out.println("inside run"+Thread.currentThread().getName());
			double interest = bank.calcInterest(name, amount);
			System.out.println(interest);
			bank.payBills("mobile",2000);
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
