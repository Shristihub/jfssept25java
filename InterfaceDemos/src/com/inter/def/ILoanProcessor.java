package com.inter.def;

public interface ILoanProcessor {

	void calculate(double amount);
	default double processDetails(double amount) {
		System.out.println("processing loan");
		return amount*2;
	}
}
