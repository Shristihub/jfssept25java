package com.io.exercises;

public class Book {
	int bookId;
	String title;
	double price;
	String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String title, double price, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	

}
