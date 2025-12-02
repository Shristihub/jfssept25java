package com.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterOperations {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Angular","React","Css","Spring","Java","Javascript");
		
		//filter
		courses.stream()
		        .filter(str->str.length()>3)
//		        .filter(str->str.startsWith("J"))
		        .forEach(str->System.out.println(str.toUpperCase()));
		
		System.out.println();
		
		//sorted, limit,skip,distinct
		courses.stream()
        .filter(str->str.length()>3)
        .sorted()
        .distinct()
//        .limit(3)
        .skip(3)
        .forEach(str->System.out.println(str));
		
		//map, toList
		List<String> ncourses = courses.stream()
        .filter(str->str.length()>3)
        .map(str->str.concat(" Course"))
        .toList();
		
		System.out.println(ncourses);
		
		//map, toList
		List<Integer> mycourses = courses.stream()
		      .filter(str->str.length()>3)
		      .map(str->str.toUpperCase())
			  .map(String::toUpperCase) //string
		      .map(String::length)
		      .collect(Collectors.toList());
				
		System.out.println(mycourses);
		
		ncourses = courses.stream()
			  .filter(str->str.length()>3)
			  .map(str->str.concat(" Course")) //string
			  .map(str->str.length()) // nums
			  .map(num->num.toString())    // string
			  .collect(Collectors.toList());
		
			System.out.println(ncourses);
			System.out.println();
			System.out.println();
			
			//get sum of length of all element s
			int length = courses.stream()
			  .map(String::length) // num  Stream<Integer>
			  .reduce((a,b)->a+b).get();
			System.out.println(length);
			
			
			 length = courses.stream()
			  .mapToInt(String::length)   //IntStream
			  .sum();
			  
			 System.out.println(length);
		
			  
		System.out.println();
		List<Integer> nums = List.of(10,66,84);
		int sum = nums.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
		
	    Integer val	= nums.stream().reduce(100,(a,b)->a+b);
		System.out.println(val);
	}
}
