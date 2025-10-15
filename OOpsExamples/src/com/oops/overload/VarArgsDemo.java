package com.oops.overload;

public class VarArgsDemo {
	
	void calcSum(String name) {
		System.out.println("hello");
	}

	void calcSum(String name,int... marks) {
		System.out.println("Welcome "+name);
		System.out.println(marks.length);
		int sum=0;
		for (int mark : marks) {
			sum+=mark;
		}
		System.out.println("Sum "+sum);
	}
	
	public static void main(String[] args) {
		VarArgsDemo demo =  new VarArgsDemo();
		demo.calcSum("Raju");
		demo.calcSum("Raju",90,80,70);
		demo.calcSum("Raju",90,80,70,90);
	}
}






