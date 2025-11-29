package com.list.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Book> books= Arrays.asList(
				new Book("Java", 900.8, 22,"Kathy"),
				new Book("Conversation", 320.1, 12,"Kevin"),
				new Book("Habits", 670.5, 56,"Steve"),
				new Book("Yogi", 546.3, 82,"Benny"),
				new Book("Heal", 340.2, 10, "Joy"),
				new Book("Spring", 1900.8, 95, "Rod"));

//		implementation using a class that implements the interface
//		Comparator<Book> comp = new TitleSort();
		Collections.sort(books, new TitleSort());

		// iterate
		System.out.println("Sort by title");
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println();
		//implementation using lambda expression
		Comparator<Book> comp = (o1, o2)-> Double.compare(o1.getPrice(), o2.getPrice());
		Collections.sort(books, comp);
		System.out.println("Sort by price");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		//implementation using lambda expression
		Collections.sort(books, (b1,b2)->{
			return b2.getAuthor().compareTo(b1.getAuthor());
		});
		
		System.out.println("Sort by author");
		for (Book book : books) {
			System.out.println(book);
		}
		
		System.out.println();
		//implementation using lambda expression
		// bookId type is int use this
		Collections.sort(books, (b1,b2)->Integer.compare(b1.getBookId(),b2.getBookId()));
		
		//bookId type is int use this
		Collections.sort(books, (b1,b2)->b1.getBookId().compareTo(b2.getBookId()));
		System.out.println("Sort by Id");
		for (Book book : books) {
			System.out.println(book);
		}
		
		
	}
}
