package com.practice;

public class EvenNo {
	void check(int num) {
		if (num % 2 == 0 ) {
			System.out.println(" Num is even: "+ num);
		}else {
			System.out.println(" Num is odd: "+ num);
		}
	}
	public static void main(String[] args) {
		EvenNo  c = new EvenNo();
		// if check even no
		c.check(12);
		
		// else check odd no
		c.check(11);
	}

}
