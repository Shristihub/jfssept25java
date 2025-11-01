package com.inter.ex1;

public class Developer extends TeamLeader{
	String email;

	
	public Developer(String employeeName, int employeeId, String city, double salary, String email) {
		super(employeeName, employeeId, city, salary);
		this.email = email;
	}
	// from IGames
	@Override
	public String[] outdoor() {
		System.out.println("Games for developer");
		return new String[] {"cricket","football"};
	}
	// from IACtivityClub
	@Override
	public void showActivities() {
		System.out.println("Activities available: Trekking, Yoga, Games - Developer");
		System.out.println("weekend team dinner");
	}
	// override the method indoor from teamlead
	@Override
	public void showPolicyDetails() {
		super.showPolicyDetails();
		System.out.println("policy for vehicles - developer");
	}
	@Override
	void calcBonus(double amount) {
		System.out.println("Diwali bonus for developer: "+amount);
	}
	@Override
	public String[] indoor() {
		return new String[] {"Squash","carrom"};
	}
	
	 void skillsNeeded() {
		 System.out.println("Backend: Java, SPring");
		 System.out.println("Frontend: React");
		 System.out.println("Devops: Jenkins, CI/CD pipelines ");
	 }

}








