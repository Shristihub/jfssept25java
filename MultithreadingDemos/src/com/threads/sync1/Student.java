package com.threads.sync1;

//task - the place wher the cpu is to call the methods of other classes
public class Student implements Runnable {

	private String studentName;
	private String question;
	Trainer trainer;

	public Student(String studentName, String question, Trainer trainer) {
		super();
		this.studentName = studentName;
		this.question = question;
		this.trainer = trainer;
		Thread th = new Thread(this, studentName);
		th.start();
	}

	//CPU- RUNNable state
	@Override
	public void run() {
		synchronized (trainer) {
			System.out.println("Student in the room/cpu "+Thread.currentThread().getName());
			String result = trainer.askDoubts(studentName, question);
			System.out.println("Answer "+result);
			System.out.println("Doubts cleared ");	
			System.out.println();
		}
		System.out.println("Goodbye");
	}

	public static void main(String[] args) {
		Trainer trainer = new Trainer("Sripriya");
		Student s1 = new Student("Rakesh", "What is Java",trainer);
		Student s2 = new Student("Raju", "What is Static",trainer);
		Student s3 = new Student("Rahul", "What is API",trainer);
		
	}
}
