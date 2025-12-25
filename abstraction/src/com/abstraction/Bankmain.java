package com.abstraction;

public class Bankmain {
	public static void main(String[] args) {
		 BankAccount s = new SavingsAccount("s22","Mohit Shinde",5000,4.5);
		 
		 BankAccount c = new CheckingAccount("s23","Raj", 2000,3000);
		 
		 System.out.println("****Savings Acccount*****");
		 s.displayInfo();
		 s.deposit(1000);
		 s.withdraw(4500);
		 s.displayInfo();
		 
		 
		 System.out.println("\n=====Checking Account=====");
		 c.displayInfo();
		 c.deposit(4000);
		 c.withdraw(2000);
		 c.displayInfo();
	}

}
