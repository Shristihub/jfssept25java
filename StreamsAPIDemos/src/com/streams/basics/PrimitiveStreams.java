package com.streams.basics;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		
		int[] nums = {10,45,11,66,84,65,36,20,81};
		//primitive array to stream
		int total = Arrays.stream(nums).sum();
		System.out.println(total);
		
		OptionalDouble opt = Arrays.stream(nums).average();
		System.out.println(opt.getAsDouble());
		
		 int max = Arrays.stream(nums).filter(num->num%2==0).max().getAsInt();
		 System.out.println(max);
	
		 IntStream.rangeClosed(10, 21).filter(num->num%2!=0).forEach(System.out::println);
		 
	
	
	}
}
