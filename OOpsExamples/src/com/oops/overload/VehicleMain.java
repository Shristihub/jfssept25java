package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("City","Honda",972839);
		vehicle1.getDetails();
		System.out.println();
		
		Vehicle vehicle2 = new Vehicle("City");
		vehicle2.getDetails();
		System.out.println();
				
		Vehicle vehicle3 = new Vehicle("City","Honda");
		vehicle3.getDetails();
		System.out.println();
		
		Vehicle vehicle = new Vehicle();
		vehicle.getDetails();
		System.out.println();
	}
}
