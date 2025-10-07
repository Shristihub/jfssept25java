package com.oops.basics;

public class Employee {

	String empName;
	int empId;
	double salary;

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.empName + " " + emp.empId + " " + emp.salary);

		// assign values
		emp.empName = "Priya";
		emp.empId = 1;
		emp.salary = 2000;
		System.out.println(emp.empName + " " + emp.empId + " " + emp.salary);
		
		
		Employee emp1 = new Employee();
		// assign values
		emp1.empName = "Sri";
		emp1.empId = 2;
		emp1.salary = 12000;
		System.out.println(emp1.empName + " " + emp1.empId + " " + emp1.salary);
		
		Employee emp3 = emp1;
		System.out.println(emp3.empName + " " + emp3.empId);
		emp3.empName="Raj";
		System.out.println(emp1.empName );
		System.out.println(emp3.empName );
		
		// make emp1 as null;
		emp1 = null;
		System.out.println(emp3.empName); //stilll pointing to the object
		System.out.println(emp1.empName);
		System.out.println("hello"); // will not be executed
	}
}

//create a Student class with name,department, studId
//add psvm and create one student object and print the data








