package com.io.exercises;

import java.util.List;

public interface IBookConverter {

	List<Book> convertToList(String csvFile);
	String serializeBooks(List<Book> books); // return the serailized file name
	void deserializeBooks(String serializedFile);
}
