package com.exampleofoverriding;

public class Main {
	public static void main(String[] args) {
		 Product p1= new Electronics("Laptop","Gaming Laptop",80000, 2,"Dell");
		 Product p2 = new Clothing("T-Shirt", "Cotton Casual Wear", 1500, "xl", "Black", "Cotton" );
		p1.displayProduct();
		p2.displayProduct();
		 
	}
	

}
