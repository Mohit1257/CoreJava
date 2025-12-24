package com.practice.polymorphism;

public class LibraryMain {
	public static void main(String[] args) {
		LibraryItems b = new Book("Core Java", "James", "Shelf 1", "Programming", 350);
		
		LibraryItems e = new Ebooks("OOP Concepts", "Mohit", "Online", "PDF", 5.2);
		
		LibraryItems d = new DVD("Inception", "Thomas", "Rack D", "Raj kapoor", 148);
		
		b.displayinfo();
		System.out.println("--------------------");
		
		e.displayinfo();
		System.out.println("--------------------");
		
		d.displayinfo();
		
		
		System.out.println("=========== SEARCH ===========");
		
		Find f = new Find();
		f.searchItem("Java Basics");
		f.searchItem("James", "Shelf A");
		
		
		
		
		
		
		
		
		
		
	}

}
