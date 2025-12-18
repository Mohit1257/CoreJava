package com.practice.forloop;

//  print count of odd No 1 to 25 no. 
public class Fifteen {
	
	public static void main(String[] args) {
		int count =0;
		 for(int i= 1; i <= 25; i++) {
			 if (i % 2 != 0) {
				count++;
			}
		 }
		 System.out.println("count of odd No 1 to 25 numb is: " + count);
	}

}
