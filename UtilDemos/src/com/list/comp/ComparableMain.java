package com.list.comp;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Rohan",12,"Chennai"));
		students.add(new Student("Zeena",82,"Bengaluru"));
		students.add(new Student("Ashok",30,"Mysore"));
		students.add(new Student("Nandu",24,"Bengaluru"));
		students.add(new Student("Aadhi",56,"Ooty"));
		
		
		Collections.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		
	}
}
