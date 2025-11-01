package com.inter.ex1;

public class CompanyDetails {

	public static void main(String[] args) {
//		super class ref = sub class object
		Employee employee = new Manager("Kevin", 10, "Bengaluru", "Marketing");
		employee.printDetails(); // from Employee
		employee.calcBonus(2000); // from Manager
		employee.projectDetails();
		
		employee.showPolicyDetails(); //IInsurance
		employee.showActivities(); // IActivityClubs
		
		// interface ref = impl class
		IInsurance insurance =  (IInsurance)employee;
		insurance.showPolicyDetails();
		IInsurance.policyProvider();
		
		IActivityClubs activityClubs = (IActivityClubs)employee;
		activityClubs.showActivities();
		
		// this is for developer - cant create an object of TeamLead
		employee = new Developer("Kumaran", 20, null, 0, null);
		employee.printDetails(); // from Employee
		employee.calcBonus(2000); // from Developer
		employee.projectDetails(); // from teamlead
		employee.showActivities(); // from Developer
		
		// now call indoor and outdoor
		TeamLeader devLead = (TeamLeader)employee;
		devLead.indoor();// from Developer
		devLead.outdoor();// from Developer
		String[] certifciations =  devLead.mandateCertifications(); // own method of TeamLeader
		System.out.println(certifciations.toString());
		
		
		
	}
}








