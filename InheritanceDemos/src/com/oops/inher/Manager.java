package com.oops.inher;

public class Manager extends Employee{
	double salary;
	void calcBonus(double amount) {
		System.out.println(salary+amount);
	}

}
