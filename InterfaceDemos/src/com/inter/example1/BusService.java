package com.inter.example1;

public abstract class BusService implements IBooking{

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Tickets booked for bus "+noOfTickets);
	
	}
	// own method
	public void availDiscount() {
		System.out.println("Festive discount available");
	}

}
