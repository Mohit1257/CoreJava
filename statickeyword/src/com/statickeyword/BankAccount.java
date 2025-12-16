package com.statickeyword;

public class BankAccount {
	String accountNumber;
	String accountHolder;
	double balance;
	// Static variable
	static String bankName;
	
	 // Parameterized constructor
	 BankAccount(String accountNumber, String accountHolder,  double balance){
		 this.accountNumber= accountNumber;
		 this.accountHolder= accountHolder;
		 this.balance= balance;
		 
	 }
	 // No-argument constructor
	 public BankAccount() {
		this.accountNumber = "Unknown";
		this.accountHolder = "Unknown";
		this.balance = 0.0;
	 }
	
	 void deposit(double amount) {
		 balance=amount+ balance;
		 
	 }
	 void withdraw(double amount) {
		 if (amount <= balance) {
			balance = balance - amount;
		}else {
			System.out.println("Insufficient balance");
		}
	 }
	 void printAccountDetail() {
		 System.out.println("AccountNumber: "+ accountNumber);
		 System.out.println("AccountHolder: "+ accountHolder);
		 System.out.println(" Balance: "+ balance);
		 System.out.println("BankName: "+ bankName);
		 System.out.println("--------------------");
	 } 
	   // Static method to set bank name
	 static void setBankName(String name) { 
		 bankName=name; 
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 // common bank name
		 BankAccount.bankName="HDFC Bank";
		 
		 BankAccount s1= new BankAccount("132","Mohit Shinde",12563.89);
		 BankAccount s2= new BankAccount();
		 
		 s1.deposit(12334);
		 s1.withdraw(1445);
		
		 
		 s1.printAccountDetail();
		 s2.printAccountDetail();
	}
	 
}
