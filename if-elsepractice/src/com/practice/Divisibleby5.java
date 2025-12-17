package com.practice;

public class Divisibleby5 {
  
	void check(int num) {
		if (num % 5 ==0) {
			System.out.println(" is divisible by 5: "+  num);
		}else {
			System.out.println("Not divisible by 5: "+ num);
		}
		
	} public static void main(String[] args) {
		Divisibleby5 s = new Divisibleby5();
		s.check(11);
		s.check(10);
	}
	
}
