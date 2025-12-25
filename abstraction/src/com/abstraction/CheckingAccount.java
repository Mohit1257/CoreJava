package com.abstraction;

public class CheckingAccount extends BankAccount{

	private double overdraftLimit;
	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
		
	}
	@Override
	String getAccountNumber() {
		return null;
	}
	@Override
	String getAccountHolderName() {
		return null;
	}
	@Override
	double getBalance() {
		return 0;
	}
	@Override
	void deposit(double amount) {
		if (amount > 0) {
			balance +=amount;
			System.out.println("Deposited: " + amount);
		}
	}
	@Override
	void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: "+ amount);
		}else {
			System.out.println("Withdrawal denied! Overdraft limit exceeded.");
		}
	}
	
	

}
