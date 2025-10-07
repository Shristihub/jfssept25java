package com.oops.basics;


public class StudentMain {
	public static void main(String[] args) {
		Student student =  new Student();
	
		//call the method for the first object
		student.getDetails();
		String result =student.greet();
		System.out.println(result);
		double avg = student.printAvg(90, 80);
		System.out.println("Average "+avg);
		
		
		Student student1 =  new Student();
	
		student1.getDetails();
		System.out.println(student1.greet());
		avg = student1.printAvg(80,96);
		System.out.println("Average "+avg);
		
		int average = (int)student1.printAvg(98,99);
		System.out.println(average);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
