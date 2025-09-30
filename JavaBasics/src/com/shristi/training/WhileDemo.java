package com.shristi.training;

public class WhileDemo {

	public static void main(String[] args) {
		int x =0;
		//will not print if condt is not satisfied
		while(x<10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println();
		//prints atleast once even if condt is not satisfied
		do {
			System.out.println(x);
			x++;
		}while(x<20);
	}
}
