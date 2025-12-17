package com.practice;

public class Odd {

	
	void check(int num) {
		if (num % 2 !=0) {
			System.out.println("Num is Odd: "+ num);
		}else {
			System.out.println(" Num is not Odd");
		}
	}
	public static void main(String[] args) {
		Odd x = new Odd();
		
		// if check odd num
		x.check(3);
		
		
	}
}
