package com.threads.sync1;

import java.util.Vector;

// place where the work is - thread has to call thismethod
public class Trainer {
	String name;

	public Trainer(String name) {
		super();
		this.name = name;
	}
  
	synchronized String askDoubts(String studentName,String question) {
		System.out.println("Doubt Session By "+name);
		System.out.println("Student Name: "+studentName);
		System.out.println("Question: "+question);
		try {
			Thread.sleep(1000); // holds the object
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String answer = question +" answered for you";
		System.out.println(answer);
		return answer;
	}
}
