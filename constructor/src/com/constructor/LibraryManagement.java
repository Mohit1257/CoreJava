package com.constructor;

public class LibraryManagement {
	String title;
	String author;
	String isbn;
	boolean available;
	
	LibraryManagement(String title, String author, String isbn){
		this.title = title;
		this.author=author;
		this.isbn=isbn;
		this.available=true;
		
	}
	void borrowBook() {
		available =false;
	}
	void returnBook() {
		available = true;
	}
	public static void main(String[] args) {
		LibraryManagement s = new LibraryManagement("Java","James Gosling","79249847");
		LibraryManagement s2 =new LibraryManagement("Paython","Mohit","79249847988");
		
		s.borrowBook();
		s2.borrowBook();
		s2.returnBook();

	System.out.println("s available: "+ s.available);
	System.out.println("s2 available: "+ s2.available);
	}
}
