package com.oops.override;

public class Tester extends Employee{

	@Override
	void calcBonus(double amount) {
		System.out.println("Tester bonus "+ amount*2);
	}

	
}
