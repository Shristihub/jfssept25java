package com.oops.overload;

public class ThisDemo {

	public ThisDemo() {
		this(10);
		System.out.println("hello");
	}
	public ThisDemo(String name) {
		this();
		System.out.println("welcome "+name);
	}
	public ThisDemo(int x) {
		System.out.println("val "+x);
	}

	public static void main(String[] args) {
		ThisDemo demo =  new ThisDemo("Priya");
		
	}
	
}
