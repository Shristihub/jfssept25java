package com.list.comp;

public class Student implements Comparable<Student>{


	private String name;
	private int studentId;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int studentId, String city) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public int compareTo(Student student1) {
//		 int val = this.getName().compareTo(student1.getName());
////		return val;
//		int val1 = getCity().compareTo(student1.getCity());
//		if(val1==0)
//			return val;
//		else
//			return val1;
		
		//legacy way
//		Integer id = this.getStudentId();
//		return id.compareTo(student1.getStudentId());		
			
		//optimum approach
		return Integer.compare(student1.getStudentId(),this.getStudentId());
		
		
	} 
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", city=" + city + "]";
	}
	
	
	
}
