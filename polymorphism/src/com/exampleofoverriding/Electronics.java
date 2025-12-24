package com.exampleofoverriding;

public class Electronics extends Product{
	int warrantyPeriod;
	String brand;
	public Electronics(String name, String description, int price , int warrantyPeriod, String brand) {
		super(name, description, price);
		this.warrantyPeriod= warrantyPeriod;
		this.brand = brand;
		
		
	}
	@Override
	double calculateDiscoun(){
		return price * 0.10;
		
		}
	
	

}
