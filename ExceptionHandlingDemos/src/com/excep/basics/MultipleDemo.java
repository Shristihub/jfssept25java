package com.excep.basics;

public class MultipleDemo {

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
		} catch (ArithmeticException e) {
			System.out.println("dont enter 0 "+e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter value "+e.getMessage());
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("dont enter String");
			System.out.println(e);
		} catch (RuntimeException e) {
			System.out.println("runtime exception");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("other exception");
			System.out.println(e);
		}
		System.out.println("Continue with flow...");

	}
}
