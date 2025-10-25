package com.oops.stat;

public class Student {

	static String collegeName;
	static int subjects;
	
	static {
		System.out.println("Block 1");
		subjects = 5;
	}
	static {
		System.out.println("Block 2");
		collegeName = "MVJ College";
		System.out.println(collegeName);
	}
	
	static void printMessage() {
		System.out.println("Great Day");
	}
	static void call() {
		System.out.println("calling");
	}
}
