package com.practice;

public class Largest {
	
	void m1(int a , int b) {
		if (a > b) {
			System.out.println(" Largest Number is: " +  a);
		}else if (b> a) {
			System.out.println(" Largest Number is: " + b);
		}else {
			System.out.println(" Both are Equal Numbers");
		}
	}
	public static void main(String[] args) {
		Largest l = new Largest();
		l.m1(112, 110); // a is largest number
		l.m1(111, 124); // b is largest number
		l.m1(144, 144); // Both are Equal Number
	}

}
