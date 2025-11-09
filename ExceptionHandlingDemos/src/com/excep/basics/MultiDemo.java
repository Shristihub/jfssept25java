package com.excep.basics;

public class MultiDemo {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String val = args[0];
			System.out.println("Got value " + val);
			int num = Integer.parseInt(val); // NumberFormat
			System.out.println("Number: " + num);
			int result = 10 / num;
			int[] marks = null;
			System.out.println(marks[0]);
			System.out.println("Result " + result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Please enter num greater than zero");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("other exception");
			System.out.println(e);
		}
		System.out.println("Continue with flow...");

	}
}
