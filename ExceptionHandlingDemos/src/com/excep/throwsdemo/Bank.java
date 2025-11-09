package com.excep.throwsdemo;

public class Bank {
	// declare the method saying it is throwing an exception
	void withdraw(int amount) throws Exception {
		System.out.println("In Bank");
		try {
			if (amount <= 0)
				throw new Exception();
			System.out.println("Balance " + amount);
		} catch (Exception e) {
			System.out.println("Technical error");
			throw e; // compiletime exception
		} finally {
			System.out.println("close db");
		}
		System.out.println("work done");
	}
}
