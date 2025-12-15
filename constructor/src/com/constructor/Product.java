package com.constructor;

public class Product {
	int productId;
	String productName;
	double price;
	int quantityInstock;
	
	// Default Constructor
	Product(){
		productId=0;
		productName="";
		double price= 0.0;
		int quantityInstock=0;
		System.out.println("default constructor: ");
	}
	
	// Parameterized Constructor
		public Product(int productId, String productName, double price, int quantityInstock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityInstock = 0;
		System.out.println("parameterized constructor: ");
	}
		// Method to update quantity
		
		void updatequantity(int quantity) {
			 quantityInstock= quantityInstock+ quantity;
		}
		
		// Method to display product details
		void displayproduct() {
			System.out.println("productId:" + productId);
			System.out.println("productName:" + productName);
			System.out.println("price: "+ price);
			System.out.println("quantityInstock: "+ quantityInstock);
			System.out.println("-----------------");
			
		}
		public static void main(String[] args) {
		Product s= new Product();
		s.displayproduct();
		
		Product s2 = new Product(102, "samsung mobile",65789,10);
		s2.displayproduct();
		
		s2.updatequantity(13);
		System.out.println("after updating quantity of paramterized constructor: ");
		s2.displayproduct();
	}
}
