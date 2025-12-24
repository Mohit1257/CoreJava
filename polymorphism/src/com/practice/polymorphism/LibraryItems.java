package com.practice.polymorphism;

public class LibraryItems {
	String title;
	String author;
	String location;
	public LibraryItems(String title, String author, String location) {
		this.title = title;
		this.author = author;
		this.location = location;
	}
	
	void displayinfo() {
		
		System.out.println("Book Title Is: "+ title);
		System.out.println("Book Author Is: "+ author);
		System.out.println("Location Is: "+ location);
	}

}
