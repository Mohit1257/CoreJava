package com.practice;

public class Smallest {
	
	
	 void check(int a, int b) {
		 
		 if (a < b ) {
			System.out.println("  Smallest Number is : "+ a);
		}else if (b < a) {
			System.out.println(" Smallest is Number  :"+ b);
		} else {
			System.out.println(" Both are Equal Number ");

		}
		
		
	 }
	 public static void main(String[] args) {
		Smallest x= new Smallest();
		x.check(12, 140); // a is smallest number
	    x.check(15, 13); // b is Smallest number
	    x.check(10, 10); // Both are Equal Number
	}
}