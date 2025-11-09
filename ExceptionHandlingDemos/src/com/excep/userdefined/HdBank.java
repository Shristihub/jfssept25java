package com.excep.userdefined;

public class HdBank {
	double balance;
	public HdBank(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) throws ExceedingLimitsException, MinBalanceException {
		System.out.println("In HD Bank");
		try {
			if (amount > 5000)
				throw new ExceedingLimitsException("amount should be less than 5000");

			if (balance - amount < 2000)
				throw new MinBalanceException("Min balance not maintained");
			balance -= amount;
			System.out.println("Amount withdrawn successfully");
		} catch (Exception e) {
			System.out.println("Wrong input");
			throw e; // throw to the calling class
		} finally {
			System.out.println("close the conection");
		}
		System.out.println("continue with code ...");

	}

}
