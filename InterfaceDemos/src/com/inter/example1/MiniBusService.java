package com.inter.example1;

public class MiniBusService extends BusService {

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("cancel ticket "+noOfTickets);
	}
	//own method
	public void buyMonthlyPass() {
		 System.out.println("Purchased monthly pass for city mini bus travel.");
	}
}
