package com.oops.abs1;

public class AbsMain {

	public static void main(String[] args) {
		Bank bank = new Branch1();
		//using bank reference call all methods of bank
		bank.carLoan();
		bank.housingLoan();
		bank.eduLoan();
		bank.adminDetails();
		
		//own method of Branch1
		Branch1 branch1 = (Branch1)bank;
		branch1.depositTypes();
		System.out.println();
		//Branch2 is abstract cant create object of that
		bank =  new SubBranch();
		bank.carLoan();
		bank.housingLoan();
		bank.eduLoan();
		bank.adminDetails();
		
		System.out.println();
		SubBranch sub = (SubBranch)bank;
		sub.cardTypes(); //own method of Subbranch
		sub.loanTypes();//own method of Branch2
		
		//subclass ref= subclass object
//		Branch2 branch2 = new SubBranch();// new object
		Branch2 branch2 = (Branch2)bank;
		branch2.loanTypes();//own method of Subbranch
		
		
		
	}

}











