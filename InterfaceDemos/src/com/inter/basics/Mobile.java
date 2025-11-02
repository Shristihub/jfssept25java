package com.inter.basics;

public class Mobile implements IInsurance{

	@Override
	public void getPolicyDetails() {
		System.out.println("policy for smart phones");
	}
	
	void showApps() {
		System.out.println("whatsapp, insta, snapchat");
	}

}
