package com.streams.opt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo1 {
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("Java","Angular","React","Css","Spring","Java","Javascript");
		
		Optional<String> opt = courses.stream()
		 			.filter(str->str.startsWith("D"))
		 			//		 .forEach(System.out::println);//		 .toList() //collect()
		 			.findFirst();
		if(opt.isPresent()){
			System.out.println(opt.get());
		}
		
//		String str = courses.stream().filter(str1->str1.startsWith("D")).findFirst().get();
//		System.out.println(str);
		System.out.println();
		
		
		String result = courses.stream()
			.filter(str->str.startsWith("A"))
			.findFirst()
			.orElse(substituteData());
		System.out.println(result);
		
		result = courses.stream()
				.filter(str->str.startsWith("A"))
				.findFirst()
				.orElseGet(()->substituteData());
		System.out.println(result);
		
		result = courses.stream()
		 .filter(str->str.startsWith("J"))
		 .findFirst()
		.orElseThrow(()->new RuntimeException("invalid course"));
		System.out.println(result);
		
		result = courses.stream()
		 .filter(str->str.startsWith("S"))
		 .findFirst()
		 .or(()->Optional.of("Microservices to be launched"))
		 .get();
		System.out.println(result);
		
	}
	
	 static String substituteData() {
		 System.out.println("Inside the method");
		 return "no course available";
	 }
	
	

}
