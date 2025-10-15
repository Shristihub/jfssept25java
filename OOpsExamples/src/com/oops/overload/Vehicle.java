package com.oops.overload;

public class Vehicle {

	String model;
	String brand;
	double price;

	public Vehicle() {
		super();
		System.out.println("In default constr");
	}

	public Vehicle(String model) {
		this();
		System.out.println("In one param constr");
		this.model = model;
	}

	public Vehicle(String model, String brand) {
		this(model);
		System.out.println("In 2 param constr");
		this.brand = brand;
	}

	public Vehicle(String model, String brand, double price) {
		this(model, brand);
		this.price = price;
		System.out.println("In 3 param constr");

	}

	void getDetails() {
		if (model != null)
			System.out.println("Model " + model);
		if (brand != null)
			System.out.println("Brand " + brand);
		if (price > 0)
			System.out.println("Price " + price);
	}

}
