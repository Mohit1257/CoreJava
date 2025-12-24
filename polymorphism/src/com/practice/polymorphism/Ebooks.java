package com.practice.polymorphism;

public class Ebooks extends LibraryItems{
	String format;
	double fileSize;
	public Ebooks(String title, String author, String location,String format, double fileSize) {
		super(title, author, location);
		  this.format = format;
	        this.fileSize = fileSize;
	} 
	@Override
	void displayinfo() {
		super.displayinfo();
		System.out.println("Formate Is: "+ format);
		System.out.println("File Size Is: "+ fileSize+ " MB");
	}
	
	

}
