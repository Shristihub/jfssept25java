package com.inter.def;

public class DefMain {

	public static void main(String[] args) {
		IBonusCalculator bonusCalculator = new EmployeeDetails();
		bonusCalculator.calculate(2000); // from Employee class
		bonusCalculator.processDetails(); // from employee class - as overridden
		//can call but not right practice
		System.out.println(bonusCalculator.DESCRIPTION);
		//correct practice - call using interface name
		System.out.println(IBonusCalculator.DESCRIPTION);
		System.out.println(IBonusCalculator.DESCRIPTION);
		
		
		//downcasting
		ILoanProcessor processor = (ILoanProcessor)bonusCalculator;
		processor.calculate(1000);
		System.out.println(processor.processDetails(2020));
		
//		ONLY using interface ref
		IBonusCalculator.showPolicy();
		EmployeeDetails.showPolicy();
		
		
		System.out.println(EmployeeDetails.companyName);
		EmployeeDetails.companyName ="Shristi";
		System.out.println(EmployeeDetails.companyName);
	}
}
