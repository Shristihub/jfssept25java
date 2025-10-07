package com.oops.basics;

/*
 * create a class Product with name, price, brand, id
 * add a paramterized constructor
 * add one method printInfo to rpint details
 * add next method 
 *   String[] showModels(String brand){
 *    return an array of product models(S11, s12, A11) for this brand(Samsung)
 * }
 * add another method
 *   double totalCost(int quantity){
 *     return price* quantity;
 *    }
 * 
 */
public class Book {
	String title;
	double price;
	String author;
	 Book(String title, double price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}

	void printInfo() {
		System.out.println(title+" "+author+" "+price);
	}
	
}
