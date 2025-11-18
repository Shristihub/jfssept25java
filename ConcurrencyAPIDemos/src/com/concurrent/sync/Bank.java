package com.concurrent.sync;

public class Bank {

	public double calcInterest(String name, double amount) {
		System.out.println("Interest cal for "+name);
		double interest = (amount*3*5)/100;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Work done "+interest);
		return interest;
	}
	
	public void payBills(String type, double amount) {
		System.out.println("Bill payment for "+type);
		System.out.println("Paid "+amount);
		
	}
}
