package com.oops.exercises;

public class Bike extends Vehicle{
	int cc;
	String ignitionType;
	boolean isGearless;
	public Bike(String brand, double price, String model, int cc, String ignitionType, boolean isGearless) {
		super(brand, price, model);
		this.cc = cc;
		this.ignitionType = ignitionType;
		this.isGearless = isGearless;
	}
	@Override
	void getMileage() {
		if(isGearless)
			System.out.println("Mileage is ok for bike");
		else
			System.out.println("Good Mileage for bike");
	}
	String[] showBrands(String type) {
		if(type.equals("sports"))
			return new String[] {"Ducatti"};
		else if(type.equals("regular"))
			return new String[] {"Honda","Bajaj"};
		else
			return null;
	}
	
	void bikeInfo() {
		printDetails();
		System.out.println("cc "+cc);
		System.out.println("IgnitionType"+ignitionType);
	}
	
	
	

}
