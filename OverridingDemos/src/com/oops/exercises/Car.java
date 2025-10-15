package com.oops.exercises;

public class Car extends Vehicle {
	String color;
	String type;

	public Car(String brand, double price, String model, String color, String type) {
		super(brand, price, model);
		this.color = color;
		this.type = type;
	}

	@Override
	void getMileage() {
		// if type is sedan print the mileage
		System.out.println("Car mileage is good");
//		else if type is suv print the mileage
	}

	// own methods
	String[] showAccessories() {
		if(type.equals("suv"))
			return new String[] { "car cover", "rear a/c", "music system" };
		else return null;
	}
	
	void carInfo() {
		System.out.println("Details of car");
		//print all details of car
		printDetails(); // this prints model, brand, price
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
	}
}
