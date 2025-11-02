package com.inter.example1;

public class TrainService implements IBooking{

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Booking tickets");
		System.out.println("No of tickets booked: "+noOfTickets);
	}

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Canceling tickets - no refund");
		System.out.println("No of tickets canceled: "+noOfTickets);		
	}

	// own method 
	void showFacilities() {
		System.out.println("Food and refreshment provided");
	}
}
