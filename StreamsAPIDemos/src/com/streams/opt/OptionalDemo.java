package com.streams.opt;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String str = "Priya";
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt);
		System.out.println(opt.get());
		System.out.println();
		
		str = null;
		Optional<String> opt1 = Optional.ofNullable(str);
		System.out.println(opt1);
//		System.out.println(opt1.get());
		
		
		opt.ifPresent(System.out::println);
		opt.ifPresentOrElse(System.out::println,()->System.out.println("default value"));
		opt1.ifPresentOrElse(System.out::println,()->System.out.println("default value"));
		System.out.println();
		if(opt.isPresent()){
			String result =  opt.get();
			System.out.println(result);
		}
		
		if(!opt1.isEmpty()){
			String result =  opt1.get();
			System.out.println(result);
		}
		
		
		Optional<Double> optnum = Optional.of(100.5);
		System.out.println(optnum.get());
		
		
		
		
	}

}
