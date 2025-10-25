package com.oops.bean;

public class Employee {
	// Book - title, double price int bookId, boolean availability
	private String empName;
	private double salary;
	private int empId;
	private boolean married;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", empId=" + empId + ", married=" + married
				+ "]";
	}

}
