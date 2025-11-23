package com.lang.examples;

public class CloneDemo {

	public static void main(String[] args) {
		Student student1 = new Student("Sri", 1, "Bengaluru");
		System.out.println("st1 "+student1);
		try {
			Student student2 =student1.clone();
			System.out.println("st2 "+student2);
			student2.setStudentName("Priya");
			System.out.println("st2 "+student2.getStudentName());
			System.out.println("st1 "+student1.getStudentName());
			System.out.println(student1==student2);
			System.out.println(student1.getClass()==student2.getClass());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
