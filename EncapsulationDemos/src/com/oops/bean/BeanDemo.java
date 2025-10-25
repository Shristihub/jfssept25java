package com.oops.bean;

import java.util.Scanner;

public class BeanDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anme");
		String name = sc.next();
		Employee employee = new Employee();
		employee.setEmpName(name);
		employee.setEmpId(10);
		employee.setSalary(2000);
		employee.setMarried(true);
		
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getSalary());
		System.out.println(employee.isMarried());
		System.out.println(employee);
	}
}
