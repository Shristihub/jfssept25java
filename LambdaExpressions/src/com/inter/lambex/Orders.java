package com.inter.lambex;

public class Orders {
	void processOrders(IPayment payment, double cost, int quantity) {
		System.out.println("Processing orders...");
		double amount = cost * quantity;
		System.out.println("Amount to be paid: " + amount);
		String status = payment.processPayment(amount);
		if (status.equals("success"))
			System.out.println("order shipped");
		else
			System.out.println("Payment failed");

	}
}
