package com.excep.basics;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String val = "0";
			System.out.println("Got value " + val);
			int num = Integer.parseInt(val); // NumberFormat
			System.out.println("Number: " + num);
			int result = 10 / num;
			System.out.println("Result " + result);
//		}catch (Exception e) {
//			System.out.println("error occured");
//			System.out.println(e);
		}finally {
			System.out.println("closing the database");
		}
		System.out.println("Continue with flow...");

	}
}
