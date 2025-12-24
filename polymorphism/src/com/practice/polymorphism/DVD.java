package com.practice.polymorphism;

public class DVD extends LibraryItems {
	String director;
	int runTime;
	public DVD(String title, String author, String location,String director, int runTime) {
		super(title, author, location);
		  this.director = director;
	        this.runTime = runTime;
		
}
	@Override
	void displayinfo() {
		super.displayinfo();
		System.out.println("Director Name Is: "+ director);
		System.out.println("Runtime: "+ runTime + " minutes");
		
		
	}

	

}
