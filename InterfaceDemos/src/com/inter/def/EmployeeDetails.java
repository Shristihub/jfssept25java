package com.inter.def;

public class EmployeeDetails implements IBonusCalculator,ILoanProcessor{
    public static String  companyName;
	@Override
	public void calculate(double amount) {
		System.out.println("Bonus calculation "+(amount*2));
	}

	@Override
	public void processDetails() {
		//call from interface - not mandatory
//		ILoanProcessor.super.processDetails();
//		IBonusCalculator.super.processDetails();
		
		System.out.println("processing for employee");
	}

	@Override
	public double processDetails(double amount) {
		System.out.println("processing loan for employee "+amount);
		return amount*3;
	}
	//own static method not interface method
	static void showPolicy() {
		System.out.println("Bonus policy modified");
	}
	

}
