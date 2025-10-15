package com.oops.abs1;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Car loan in branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("Education loan in branch1");
	}

	@Override
	void housingLoan() {
		System.out.println("Housing loan in branch1");
	}

	void depositTypes() {
		System.out.println("fixed, recurring,short-term,long-term");
	}
}



