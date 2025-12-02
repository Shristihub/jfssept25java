package com.streams.basics;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunDemo {

	static void printMessage(Supplier<String> supplier) {
		String message = supplier.get();
		System.out.println(message);
	}
	
	static void getMessage(Consumer<String> consumer,String message) {
		System.out.println("Started");
		consumer.accept(message);
	}
	static Integer getMsgLength(Function<String,Integer> fun, String str) {
		return fun.apply(str);
	
	}
	
	public static void main(String[] args) {
		//implementation
		Supplier<String> sup = ()-> "Great day";
		//call
		System.out.println(sup.get());
		
		Supplier<Integer> num =()->100;
		System.out.println(num.get());
		
		printMessage(()->"Have a good day");
		
		Consumer<String> con = (str)->System.out.println(str.toUpperCase());
		//call it
		con.accept("Sri");
		
		getMessage(str-> System.out.println(str.toUpperCase()), "Java Full Stack");
		
		Function<String,String> fun = str->str.toUpperCase();
		System.out.println(fun.apply("Priya"));
		
		int len = getMsgLength(str->str.length(), "this is a demo. welcome");
		System.out.println(len);
		
		int index = getMsgLength(str->str.lastIndexOf('e'), "welcome");
		System.out.println(index);
		
		BiFunction<String, String, Boolean> fun1 = (str1,str2)->{
			if(str1.equals(str2)) return true;
			else return false;
		};
		System.out.println(fun1.apply("a","b"));
		
		
		
		
		
		
	}
}
