package com.practice;

public class Digitscheck {

	
	void check(int num) {
		if (num >= -9 && num <= 9) {
			System.out.println(num +": Is a Single Digit Number");
		}else if ((num >= -99 && num <= -10) || (num >= 10 && num <= 99)) {
			System.out.println(num +": Is a Double Digit Number ");
		}else {
			System.out.println(num +": is not a Single or Double Digit Number");
		}
	}
	public static void main(String[] args) {
		 Digitscheck s = new  Digitscheck ();
		 s.check(-6);
		 s.check(5);
		 
		 s.check(78);
		 s.check(-88);
		 
		 s.check(123);
		 s.check(1234);
	}
	
}
