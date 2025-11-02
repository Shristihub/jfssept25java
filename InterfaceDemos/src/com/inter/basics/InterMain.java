package com.inter.basics;

public class InterMain {

	public static void main(String[] args) {
		// interface ref = implementation class
		IInsurance insurance =  new Vehicle();
		insurance.getPolicyDetails();
		Vehicle vehicle = (Vehicle) insurance;
		vehicle.printMileage();
		
		insurance = new Mobile();
		insurance.getPolicyDetails();
		
		Mobile mobile = (Mobile) insurance;
		// own methods of mobile
		mobile.showApps();
//		System.out.println(mobile.POLICYNAME);
		System.out.println(IInsurance.POLICYNAME);
		
		
	}
}
