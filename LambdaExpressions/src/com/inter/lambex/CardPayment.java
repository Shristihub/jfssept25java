package com.inter.lambex;

public class CardPayment implements IPayment{

	@Override
	public String processPayment(double amount) {
		System.out.println("Payment using card: "+ amount);
		return "success";
	}

}
