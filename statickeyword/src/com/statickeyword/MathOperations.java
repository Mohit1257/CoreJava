package com.statickeyword;

public class MathOperations {

	 // static method to add two numbers
	static int add(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		  // calling static method using class name
		int result1 = MathOperations.add(5,7);
		System.out.println("adding 5 & 7: "+ result1);
		
		int result2 = MathOperations.add(10, 20);
		System.out.println("adding 10 & 20: "+ result2);
	}
}
