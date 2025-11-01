package com.inter.ex1;

public interface IGames {
	String[] outdoor();
	String[] indoor();
	
	default void playTournaments() {
		System.out.println("intra cricket tournaments");
	}

}
