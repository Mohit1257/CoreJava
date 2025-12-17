package com.practice;

public class Sumofodd {

	void m2(int a , int b) {
		if (a % 2 !=0 && b % 2 !=0) {
			int sum= a+b;
			System.out.println(" Sum of Odd Number: "+ sum);
		}else {
			System.out.println("Both Number Is Not Odd , So Sum Not Possible");
		}
	}
	public static void main(String[] args) {
		Sumofodd t = new Sumofodd();
		t.m2(7, 9); // Sum of odd Number
		t.m2(2, 10); // Not Possible
	}
}
