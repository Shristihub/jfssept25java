package com.inter.lamb;

public class AnonyDemo {

	public static void main(String[] args) {
		ICalculator ref = new Addition();
		ref.calculate(10, 20);

		//anonymous inner class - implementation
		ICalculator ref1 = new ICalculator() {
			@Override
			public void calculate(int x, int y) {
				System.out.println("Product "+(x*y));
			}

		};
//		calling the method
		ref1.calculate(20, 20);
	
	
	
	
	}

}
