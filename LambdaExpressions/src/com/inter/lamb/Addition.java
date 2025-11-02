package com.inter.lamb;

public class Addition implements ICalculator{

	@Override
	public void calculate(int x, int y) {
		System.out.println("Sum "+(x+y));
	}


}
