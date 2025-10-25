package com.oops.stat;

public class StaticCall {

	public static void main(String[] args) throws ClassNotFoundException {
		// just call the static blocks
		Class.forName("com.oops.stat.Student");
	}
}

//connecting java app to database
// driver helps to connect
// connection details - static block of the driver class
