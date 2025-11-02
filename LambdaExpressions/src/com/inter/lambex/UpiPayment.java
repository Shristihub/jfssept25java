package com.inter.lambex;

public class UpiPayment implements IPayment{

	@Override
	public String processPayment(double amount) {
		System.out.println("Payment using upi: "+ amount);
		if(amount>5000)
			return "failed";
		return "success";
	}

}
