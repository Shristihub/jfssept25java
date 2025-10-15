package com.oops.override;

public class EmpOverride {

	public static void main(String[] args) {
		//super class ref = sub class object
		Employee employee = new Manager();
		//call the overridden method from Manager
		employee.calcBonus(2000);
		employee.greet(); // method from employee
		
		Manager manager = (Manager)employee;
		manager.projectDetails();
		
		
		
		//call the overridden method from Developer
		employee = new Developer();
		employee.calcBonus(2000);
		
	
		
	}
}
