package com.oops.override1;

public class Frontend extends Course{

	@Override
	String[] showCourses() {
		return new String[] {"HTML","CSS","JS"};
	}

}
