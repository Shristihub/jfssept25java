package com.shristi.arrays;

import java.util.Scanner;

public class ScanDemo {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Name "+name.toUpperCase());
		
		System.out.println("Enter id");
		int empId = sc.nextInt();
		System.out.println("Id "+empId);
		sc.nextLine();
		
		System.out.println("Enter City");
		String city = sc.nextLine();
		System.out.println("City "+city);
		
		System.out.println("Enter salary");
		double salary =sc.nextDouble();
		System.out.println("Salary "+salary);
		
		sc.close();
		
		
	}
}






