package com.shristi.training;

public class SwitchDemo {
	public static void main(String[] args) {
		// create a variable day as sunday
		// case sunday, saturday - print enjoing weekend
		// case monday -print gloomy days starting to work
		// case friday - print waiting for weekend
		// case thursday,wednesday, tuesday - busy with work
		// add default also
		String day = "Sunday";
		switch (day.toUpperCase()) {
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("enjoying weekend");
			break;
		case "MONDAY":
			System.out.println("Gloomy days starting to work");
			break;
		case "FRIDAY":
			System.out.println("Waiting for weekend");
			break;
		case "THURSDAY":
		case "TUESDAY":
		case "WEDNESDAY":
			System.out.println("Busy Day");
		default:
			System.out.println("wrong choice");
		}

		String choice = "reade";
		switch (choice.toUpperCase()) {
		case "READ":
			System.out.println("Reading a file");
			break;
		case "WRITE":
			System.out.println("Writing a file");
			break;
		case "EXECUTE":
			System.out.println("Executing a file");
			break;
		default:
			System.out.println("wrong choice");
		}

	}
}
