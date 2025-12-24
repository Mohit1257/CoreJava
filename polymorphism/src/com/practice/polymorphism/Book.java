package com.practice.polymorphism;

public class Book extends LibraryItems {
	String genre;
	int numberOfPages;
	
	public Book(String title, String author, String location,String genre, int numberOfPages) {
		super(title, author, location);
		  this.genre = genre;
	        this.numberOfPages = numberOfPages;
		
	}
	@Override
	void displayinfo() {
		super.displayinfo();
		System.out.println("Genre: "+ genre);
		System.out.println("Number Of Pages: "+ numberOfPages);
		
		
	}

}
