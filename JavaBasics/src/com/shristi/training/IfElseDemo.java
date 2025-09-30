package com.shristi.training;

public class IfElseDemo {

	public static void main(String[] args) {
		// find the greater of 3 numbers - use &&
		int num1 = 100;
		int num2 = 90;
		int num3 = 130;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}

		String name = "Sri";
		if (name.equals("Sri")) {
			System.out.println("Welcome " + name);
		} else {
			System.out.println("Wrong username");
		}
	}
}
