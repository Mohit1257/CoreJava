package com.practice;

       // find the greatest number in 3
public class Greatestno {

	void find(int a, int b, int c) {
		if (a > b && a> c) {
			System.out.println("Greatest number is: " +a );
		
		}else if (b>a && b>c) {
				System.out.println("Greatest number is: " +b);
			}
		else if (c > a && c >b) {
			System.out.println("Greatest number is: " + c);
		} else {
			System.out.println("All numbers are equal or two numbers are equal");
		}
		
		}
	      public static void main(String[] args) {
	    	  Greatestno s= new Greatestno();
	    	  s.find(134, 260, 241); // 260
	    	  s.find(465, 899, 901); // 901
	    	  s.find(536, 90, 410); // 536
	    	  s.find(120, 120, 119); // 120, 120 equals
	}
}
