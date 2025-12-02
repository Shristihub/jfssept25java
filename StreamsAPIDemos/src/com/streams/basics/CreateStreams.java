package com.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		
//		Stream<Integer>  IntStream 
		
		//list - Stream<Integer> 
		List<String> courses = Arrays.asList("Java","Angular","React","Css");
		courses.stream().forEach(str->System.out.println(str));
		
		String[] names = new String[] {"apple","kiwi","orange"};
		// use this when you do not know the size
		Stream.of(names);
		Stream.of(10,20,30,40);
		
		// for primitive array - IntStream 
		int[] nums =  new int[] {10,12,16,18,20};
		Arrays.stream(nums);
		
		
		// for Integer Array - Stream<Integer> 
		Integer[] numsobj =  new Integer[] {10,12,16,18,20};
		Arrays.stream(numsobj);
		
		// generating streams
		Stream.generate(()->100).limit(5).forEach(num->System.out.println(num));
		
		
		
	}
}
