package com.java.oops;

class Author {
	
	String authorName;
	int age;
	String place;

	public Author(String authorName, int age, String place) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getAge() {
		return age;
	}

	public String getPlace() {
		return place;
	} 
}

class Book {
	
	String name;
	int price;
	Author author;
	
	public Book(String name, int price, Author author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}
  
	public void showDetail() {
		System.out.println("Book   : " + name);
		System.out.println("Price  : Rs." + price);
		System.out.println("Author : " + author.getAuthorName());
	}
}

public class Aggregation {

	public static void main(String[] args) {
		
		Author author = new Author("Supreeth", 22, "India");
	    Book book = new Book("Java", 550, author);
	    book.showDetail();
	}
}
