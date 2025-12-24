package com.practice.polymorphism;
// Method overloading
public class Find {
	void searchItem(String title) {
		System.out.println("Searching by Title: "+ title);
		
		
	}
	
	void searchItem(String author, String location) {
		System.out.println("Searching by Author: " + author +
                " and Location: " + location);
	}
	
}
