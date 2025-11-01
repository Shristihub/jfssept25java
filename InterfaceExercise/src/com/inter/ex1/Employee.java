package com.inter.ex1;

public abstract class Employee implements IInsurance,IActivityClubs{

	private String employeeName;
	private int employeeId;
	private String city;
	public Employee(String employeeName, int employeeId, String city) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.city = city;
	}
	void printDetails() {
		System.out.println("Name: "+employeeName);
		System.out.println("Id: "+employeeId);
		System.out.println("City: "+city);
	}
	
	// 4 abstract method in Employee - 2  from interfaces
	abstract void projectDetails();	
	abstract void calcBonus(double amount);
	
	
}








