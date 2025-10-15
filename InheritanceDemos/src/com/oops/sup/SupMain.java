package com.oops.sup;

public class SupMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("A123",1000);
		vehicle.getDetails();
		Car car = new Car("X12",100000,"red");
		car.getDetails();
	}
}
