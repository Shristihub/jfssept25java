package com.io.exercises;

import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		IBookConverter converter = new BookConverterImpl();
		
		//1st process
		//call the method to get the csv file and convert to List
		List<Book> books =  converter.convertToList("books.csv");
		System.out.println(books);
		
		//2nd process
		//serialize the books and save in a file - serializedFile
		String serializedFile = converter.serializeBooks(books);
		
		//deserialize books - read the serialized file(serializedFile) and print the books
		converter.deserializeBooks(serializedFile);
	}
}
