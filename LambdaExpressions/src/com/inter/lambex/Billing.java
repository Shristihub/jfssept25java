package com.inter.lambex;

public class Billing {

	public static void main(String[] args) {
		Orders orders = new Orders();
		//create a ref for IPayment
		IPayment payment = new UpiPayment();
		orders.processOrders(payment,1200, 5);
		System.out.println();
		payment =  new CardPayment();
		orders.processOrders(payment, 1200,2);
		
		System.out.println();
		System.out.println("Using Lambda");
		IPayment upipayment = amount->{
			System.out.println("Payment using upi: "+ amount);
			if(amount>5000)
				return "failed";
			return "success";
		};
		orders.processOrders(upipayment,1200, 2);
		System.out.println();
		
		
		orders.processOrders(amount->{
			System.out.println("Payment using card: "+ amount);
			return "success";
		}, 1200, 90);
		
		
		
		
		
		
	}
}
