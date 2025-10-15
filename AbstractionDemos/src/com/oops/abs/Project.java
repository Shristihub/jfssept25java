package com.oops.abs;

public class Project {

	public static void main(String[] args) {
		TeamLead teamLead = new GroupOne();
		teamLead.doTask();
		
		GroupOne groupone = (GroupOne)teamLead;
		groupone.printTools();
		
		teamLead = new GroupTwo();
		teamLead.doTask();
		teamLead.projectInfo();
	}
}
