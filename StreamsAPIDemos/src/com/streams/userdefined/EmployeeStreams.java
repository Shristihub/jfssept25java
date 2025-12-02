package com.streams.userdefined;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeStreams {
	public static void main(String[] args) {		List<Employee> employees= Arrays.asList(
				new Employee("Raji",22,12000,"Goa"),
				new Employee("Arav",10,4500,"Chennai"),
				new Employee("Nandhu",82,8000,"Pune"),
				new Employee("Rakesh",122,122000,"Chennai"),
				new Employee("Kumaran",110,14500,"Chennai"),
				new Employee("Harini",12,18000,"Pune")
				);
	
	employees.stream()
			.filter(emp->emp.getCity().equals("Chennai"))
//			.map(employee->employee.getEmployeeName()) //Steam<Employye>--> Stream<String>
			.map(Employee::getEmployeeName)
			.map(String::toUpperCase) //empname coming in Stream<String>
			.sorted()
			.forEach(System.out::println);
			
	System.out.println();
	employees.stream()
	       .map(empl->empl.getSalary())
	       .sorted()
	       .forEach(System.out::println);
	
	System.out.println();
	 double sumofsalaries =    employees.stream()
	       .mapToDouble(Employee::getSalary)
	       .sum();
	System.out.println(sumofsalaries);
	
	System.out.println();
	  employees.stream()
//	         .sorted((o1,o2)->o1.getEmployeeName().compareTo(o2.getEmployeeName()))
//	         .sorted(Comparator.comparing(emp->emp.getEmployeeName()))
	  		 .sorted(Comparator.comparing(Employee::getEmployeeName)) //alphabetical order
	  		.sorted(Comparator.comparing(Employee::getEmployeeName).reversed()) // reverse alphabetical order
             .forEach(System.out::println);
	
	System.out.println("By Id");
	  employees.stream()
		 .sorted(Comparator.comparing(Employee::getEmployeeId))
      .forEach(System.out::println);
	  
	  System.out.println();
	  System.out.println("By salary");
	  employees.stream()
//		 .sorted(Comparator.comparing(Employee::getSalary))
	     .sorted((o1,o2)->Double.compare(o2.getSalary(),o1.getSalary()))
         .forEach(System.out::println);
	  
	  System.out.println();
	  Optional<Employee> employee =  employees.stream()
			  				.filter(emp->emp.getEmployeeId()==12)
			  				.findFirst();
	  employee.ifPresent(emp->System.out.println(emp.getEmployeeName().toUpperCase()));
	
	  employees.stream()
		.filter(emp->emp.getEmployeeId()==12)
		.findFirst()
		.orElseThrow(()->new RuntimeException("invalid id"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
