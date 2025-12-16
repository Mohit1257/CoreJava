package com.statickeyword;

public class InventoryItem {
	static int totalItems=0;
	String Itemname;
	int quantity;
	public InventoryItem(String itemname, int quantity) {
		super();
		Itemname = itemname;
		this.quantity = quantity;
		totalItems+=quantity;
	}
	
	static int getTotalItems() {
		return totalItems;
	}
	
	void  addInventory(int qty) {
		quantity= quantity+ qty;
		totalItems= totalItems+ qty;
		
	}
	void removeFromInventory(int qty) {
		quantity= quantity- qty;
		totalItems= totalItems - qty;
	}
	
	public static void main(String[] args) {
		
		InventoryItem s= new InventoryItem ("Pen",12);
		s.addInventory(5);
		InventoryItem s2= new InventoryItem ("notebook",46);
		s2.removeFromInventory(9);
		System.out.println("total in stock:"+ InventoryItem.getTotalItems());
		
	}
	

}
