package com.practice.overloading;

public class Main {
	 public static void main(String[] args) {

	        Calculator calc = new Calculator();

	        System.out.println(calc.add());
	        System.out.println(calc.add(5, 10));
	        System.out.println(calc.add(1, 2, 3));
	        System.out.println(calc.add(2.5, 3.5));
	    }

}
