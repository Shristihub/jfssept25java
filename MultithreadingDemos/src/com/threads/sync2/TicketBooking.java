package com.threads.sync2;

public class TicketBooking {
	int availableTickets = 600;
	final double costPerTicket = 120;

	double bookTicket(String passengerName, int noOfTickets) {
		System.out.println("Booking Ticket for " + passengerName);
		System.out.println("Tickets needed: " + noOfTickets);
		System.out.println("AvailableTickets "+availableTickets);
		if (availableTickets-noOfTickets<=0)
			throw new RuntimeException("no tickets ");
		availableTickets -= noOfTickets;
		System.out.println("Tickets Remaining "+availableTickets);
		// connect to the database
		// check for no of tickets and category
		// if tickets are available
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double price = costPerTicket * noOfTickets;
		System.out.println("Total Price " + price);
		return price;

	}

}
