package com.oops.basics;

public class Student {
	String name;
	int studId;
	String department;
	
	Student(){
		name="Jo";
		studId=10;
		department = "CSE";
	}
	
	void getDetails() {
		System.out.println("Name "+name);
		System.out.println("Id "+studId);
		System.out.println("Department "+department);
	}

	String greet(){
		return "Have a great day";
	}
	
	double printAvg(int marks1, int marks2) {
		int sum = marks1+marks2;
		double avg = sum/2;
		return avg;
		
	}
	
	String[] showCourses() {
//		String[] courses = {"Java","Spring"};
//		String[] courses = new String[] {"Java","Spring","Html"};
//		return courses;
		
		return  new String[] {"Java","Spring","Html"};
		
		
	}
	
	
}












