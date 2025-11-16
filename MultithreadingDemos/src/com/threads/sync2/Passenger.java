package com.threads.sync2;

public class Passenger {

	public static void main(String[] args) {
		//shared resource
		TicketBooking booking = new TicketBooking();
		Counter counter1 = new Counter("Raju", 20,booking);
		Counter counter2 = new Counter("Rakesh", 30,booking);
		Counter counter3 = new Counter("Rohan", 15,booking);
		
		counter1.joinThread();
		counter2.joinThread();
		counter3.joinThread();
				
		
		System.out.println("Booking completed");
	}
}
