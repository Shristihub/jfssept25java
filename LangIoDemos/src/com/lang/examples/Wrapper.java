package com.lang.examples;

public class Wrapper {

	public static void main(String[] args) {
		
		int x =100;
		long y = x; //upcasting
		
		Long a = y; //autoboxing
		Object  o = a; //upcasting of objects
		Long s1 = (Long) o; //downcasting of objects
		long s2 = s1; // autounboxing
		
		int x1 =200;
		Integer y1 = x1; //autoboxing
		Object o1 = y1;  // upcasting
		//throws classcast exception
//		Long a1 = (Long) o1; //downcasting
		
		int  x2 = (Integer)o1; // downcasting and then autounboxing
		
	}
}
