package com.excep.throwsdemo;

public class ATM {

	public static void main(String[] args) throws Exception {
		System.out.println("In ATM");
		Bank bank = new Bank();
//		try {
			bank.withdraw(0);
			System.out.println("Amount withdrawn");
//		} catch (Exception e) {
//			System.out.println("Exception..");
//			System.out.println("try again");
//		}
		System.out.println("Goodbye");
	}
}
