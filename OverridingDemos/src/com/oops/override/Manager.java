package com.oops.override;

public class Manager extends Employee{

	@Override
	void calcBonus(double amount) {
		super.calcBonus(amount);
		System.out.println("Mgr bonus "+ amount*5);
		
	}
	// own method of Manager
	void projectDetails() {
		System.out.println("Ecommerce Application");
	}

	
}
