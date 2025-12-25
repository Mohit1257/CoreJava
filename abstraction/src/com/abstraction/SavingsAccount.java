package com.abstraction;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	private static final double MIN_BALANCE= 1000;
	
	public SavingsAccount(String accountNumber, String accountHolderName,double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate= interestRate;
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
		if (amount >0 ) {
			balance +=amount;
			System.out.println("Deposited: "+ amount);
		}
		
	}

	@Override
	void withdraw(double amount) {
		if (balance - amount >= MIN_BALANCE) {
			balance -= amount;
			System.out.println("withdrawn: "+ amount);
			
		}else {
			System.out.println("Withdrawal denied Minimum balance reuired: "+ MIN_BALANCE);
		}
		
	}
}

