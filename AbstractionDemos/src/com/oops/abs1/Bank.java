package com.oops.abs1;

public abstract class Bank {
	// must be extended
	abstract void carLoan();
	abstract void eduLoan();
	abstract void housingLoan();
	
	//cannot be extended
	final void adminDetails() {
		System.out.println("Bank admin details");
	}

}
