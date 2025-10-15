package com.oops.exercises;

public class Showroom {

	public static void main(String[] args) {
		//super class ref =  sub class object;
		Vehicle vehicle = new Car("Honda",10000.0, "City", "white","Sedan");
		vehicle.printDetails();
		vehicle.getMileage();
		
		vehicle = new Bike("Honda",10000, "A123", 10,"self", false);
		vehicle.printDetails();
		vehicle.getMileage();
		
		
		// long x =10;
		// int y =x; //Compiler error		
		//downcast to car ref
		Car car = (Car) vehicle;   // int y=x;
		//own method of car class
		car.carInfo();
		String[] accessories =  car.showAccessories();
		if(accessories!=null) {
			for (String acc : accessories) {
				System.out.println(acc);
			}
		}
	}

}
