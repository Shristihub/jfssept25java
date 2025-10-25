package com.oops.stat;

public class Demo {

	static int x;
	static int y=100;
	static {
		System.out.println("in static block");
		x=30;
		System.out.println(x+y);
	}
	Demo(){
		System.out.println("Great");
	}
	static void call() {
		System.out.println("Helloo!");
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println("in main");
		
		call();
		System.out.println(x+y);
		
	}
}
