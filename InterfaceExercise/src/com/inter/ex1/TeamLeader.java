package com.inter.ex1;

//method of IActivityClub and outdoor() method not implemented
public abstract class TeamLeader extends Employee implements IGames{

	double salary;

	public TeamLeader(String employeeName, int employeeId, String city, double salary) {
		super(employeeName, employeeId, city);
		this.salary = salary;
	}
	//from IInsurance
	@Override
	public void showPolicyDetails() {
		System.out.println("Policy provided for health - TeamLeader");		
	}
	//from Employee
	@Override
	void projectDetails() {
		System.out.println("For Ecommerce domain");
		System.out.println("Using MERN stack");		
	}
//	from Employee
	@Override
	void calcBonus(double amount) {
		System.out.println("Diwali Bonus for TL: "+amount);		
	}
    //from IGames
	//outdoor method not implemented
	@Override
	public String[] indoor() {
		return new String[] {"chess","table tennis"};
	}
	
	// own method
	String[] mandateCertifications() {
		return new String[] {"cloud","communications","leadership","kubernetes"};
	}
	
}
