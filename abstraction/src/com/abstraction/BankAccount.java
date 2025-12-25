package com.abstraction;

public abstract class BankAccount {
	
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	
	
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	// abstract methods with body
	abstract String getAccountNumber();
    abstract String getAccountHolderName();
    abstract double getBalance();
  abstract void deposit(double amount);
  abstract void withdraw(double amount);
  
//Common method
  void displayInfo() {
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Account Holder: " + accountHolderName);
      System.out.println("Balance: " + balance);
      
  }
  
}

