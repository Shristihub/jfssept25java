package com.threads.sync2;

public class Counter implements Runnable {

	String passengerName;
	int noOfTickets;
	TicketBooking booking;
	Thread t;

	public Counter(String passengerName, int noOfTickets, TicketBooking booking) {
		super();
		this.passengerName = passengerName;
		this.noOfTickets = noOfTickets;
		this.booking = booking;
		t = new Thread(this, passengerName);
		t.start();
	}

	@Override
	public void run() {
		synchronized (booking) {
			System.out.println("Welcome to OnlineTicketBooking");
			System.out.println("Checking details");
			System.out.println("Welcome " + passengerName);
			double totalPrice = booking.bookTicket(passengerName, noOfTickets);
			System.out.println("Booked amount " + totalPrice);
		}
		System.out.println();
	}

	void joinThread() {
		try {
			System.out.println(t.getName());
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
