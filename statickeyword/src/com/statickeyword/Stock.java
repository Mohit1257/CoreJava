package com.statickeyword;

public class Stock {

	static int totalStocks =0;
	String tickerSymbol;
	double currentPrice;
	
	
	public Stock(String tickerSymbol, double currentPrice) {
		
		this.tickerSymbol = tickerSymbol;
		this.currentPrice = currentPrice;
		totalStocks ++;
	}
	static  int getTotalStocks() {
		return totalStocks;
		
	}
	void updatePrice(double newprice) {
		currentPrice =  newprice;
	}
	
	void displayStockInfo() {
		System.out.println("tickerSymbol: "+ tickerSymbol);
		System.out.println("currentprice: " + currentPrice);
		 System.out.println("----------------------");
	}
	public static void main(String[] args) {
		Stock s = new Stock("M",324.3);
		Stock s1 = new Stock("T", 67.89);
		
		System.out.println("total Stock: "+ Stock.getTotalStocks());
		System.out.println("--------------");
		 
		s.displayStockInfo();
		
		System.out.println("updated Price of stock is given below : ");
		s.updatePrice(3478);
		s.displayStockInfo();
		
		s1.displayStockInfo();
		
	}
}
