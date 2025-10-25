package com.oops.stat;
import static com.oops.stat.Student.printMessage;
import static com.oops.stat.Student.collegeName;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
public class StuMain {
	static {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		out.println("main");
		Student.call();
		// imported the static member
		printMessage();
		System.out.println(collegeName);
		System.out.println(Student.subjects);
		
		 int x = parseInt("100");
		 System.out.println(x);
	}
}












