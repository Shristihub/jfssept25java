package com.lang.examples;

public class Student implements Cloneable {
	private String studentName;
	private int studentId;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentId, String city) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.city = city;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	protected  Student clone() throws CloneNotSupportedException {
		System.out.println("cloning....");
		
		return (Student)super.clone();
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", city=" + city + "]";
	}

	
	
}
