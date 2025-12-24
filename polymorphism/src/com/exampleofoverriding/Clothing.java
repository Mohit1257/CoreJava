package com.exampleofoverriding;

public class Clothing extends Product{
	String size;
	String color;
	String material;
	public Clothing(String name, String description, int price, String size,
			String color, String material) {
		super(name, description, price);
		this.size = size;
		this.color = color;
		this.material= material;
	}@Override
	 double calculateDiscoun(){
			return price * 0.20;
			}

}
