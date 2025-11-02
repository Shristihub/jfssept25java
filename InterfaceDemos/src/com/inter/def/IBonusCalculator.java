package com.inter.def;

public interface IBonusCalculator {
  //	by default the variables are public static final
	String DESCRIPTION = "Bonus Calculator process";
	double BASEAMOUNT =1000;
	
	// by default public and abstract
	void calculate(double amount);
	//can be overridden
	// by default it is public ONLY
	// add a new functionality to an existing interface
	default void processDetails() {
		System.out.println("processing bonus");
	}
	//CANNOT be overridden
	// by default it is public ONLY
    // add a common functionality  for all the implementation classes
	static void showPolicy() {
		System.out.println("Bonus policy for employees");
	}
}
