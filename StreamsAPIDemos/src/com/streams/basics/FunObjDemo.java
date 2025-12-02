package com.streams.basics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunObjDemo {
	public static void main(String[] args) {
		// implementation of Consumer
		Consumer<String> con = str->System.out.println(str);
		//calling the method of Consumer
		con.accept("Priya");
		
		// implementation of Consumer
		Consumer<Book> conbook = (Book  nbook)->System.out.println(nbook.getTitle());
		//calling the method of Consumer
		conbook.accept(new Book("Java",900,1,"Kathy"));
		
		Predicate<Book> pred = bookobj->{
			if(bookobj.getTitle().equals("Spring"))return true;
			else return false;
		};
		System.out.println(pred.test(new Book("Java",900,1,"Kathy")));	
		
		Predicate<Book> pred1 = bookobj->bookobj.getTitle().equals("Spring");
		System.out.println(pred1.test(new Book("Java",900,1,"Kathy")));	
		

		Supplier<Book> sup = ()->new Book("Java",900,1,"Kathy");
		System.out.println(sup.get());
		
		
		Function<Book, String> fun = (book)->book.getTitle();
		System.out.println(fun.apply(new Book("Habits",900,1,"Kathy")));
		
		
		
		
		
	}

}
