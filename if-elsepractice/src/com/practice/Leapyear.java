package com.practice;

public class Leapyear {
	
	void check(int year) {
		if ((year% 4 ==0  && year % 100 !=0) || (year % 400 ==0)) {
			System.out.println(" this is a leaf year: "+ year);
		}
		else {
			System.out.println("this is not a leaf year: "+ year);
		}
	} public static void main(String[] args) {
		Leapyear s= new Leapyear();
		s.check(2024); // leaf year
		s.check(11); // not leaf year
		s.check(1900);// not leap year
		s.check(2000); // leap year
	}

}
