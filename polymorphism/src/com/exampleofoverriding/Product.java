package com.exampleofoverriding;
// Example of overriding
public class Product {
	String name;
	String description;
	int price;
	public Product(String name, String description, int price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
    double calculateDiscoun(){
		return price * 0.05;
		}
	


      void displayProduct() {
        double discount = calculateDiscoun();
        double finalPrice = price - discount;

        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Original Price: " + price);
        System.out.println("Discounted Price: " + finalPrice);
        System.out.println("---------------------------");
	

      }
      
  }
