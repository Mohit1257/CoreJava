package com.practice;

public class Number {

	
	void check(int num) {
		if (num >0 ) {
			System.out.println(" Number is Positive: "+ num);
		} else if (num <0 ) {
			System.out.println(" Number is Negative: "+  num);
		} else {
			System.out.println("Number is zero");

		}
	}public static void main(String[] args) {
		Number n= new Number();
		
		// Print Positive Number
		n.check(7);
		
		// Print Negative Number
		n.check(-7);
		 
		// Print Zero
		n.check(0);
	}
}
