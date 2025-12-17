package com.practice;

public class Voting {

	void Check(int age) {
		if (age >= 18 && age <=100) {
			System.out.println(" Eligible For Voting Age is: "+ age);
		}
		else {
			System.out.println(" Not Eligible For Voting Age is:"+  age);
		}
	} public static void main(String[] args) {
		Voting c = new Voting();
		c.Check(29); //Eligible For Voting
		c.Check(-18); // Not Eligible For Voting
		
	}

}
