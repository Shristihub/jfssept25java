package com.oops.override;

public class Developer extends Employee{

	@Override
	void calcBonus(double amount) {
		System.out.println("Dev bonus "+ amount*3);
		super.calcBonus(amount);
	}

	
}
