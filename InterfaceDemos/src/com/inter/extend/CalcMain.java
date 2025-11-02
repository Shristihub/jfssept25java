package com.inter.extend;

public class CalcMain {

	public static void main(String[] args) {
		ICalculator calculator = new BasicCalculator();
		calculator.add(10, 20);
		calculator.difference(10, 20);
		
		IScientific scientific = new SciCalculator();
		scientific.add(1, 10);
		scientific.difference(30, 10);
		scientific.square(4);
		scientific.cube(2);
		
	}
}
