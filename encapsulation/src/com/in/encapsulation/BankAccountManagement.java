package com.in.encapsulation;
// Encapsulation Example Project For Practice
public class BankAccountManagement {
	

	    private String accountHolderName;
	    private int accountNumber;
	    private int balance;

	    public BankAccountManagement(String accountHolderName, int accountNumber, int balance) {
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        this.balance = (balance >= 0) ? balance : 0;
	    }

	    public void deposit(int amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(int amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Current balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void printDetails() {
	        System.out.println("Account Holder Name: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccountManagement s =
	                new BankAccountManagement("Mohit Shinde", 145377388, 748940);

	        s.printDetails();
	        s.deposit(124);
	        s.withdraw(5738);

	        System.out.println("Final Balance: " + s.getBalance());
	    }
	}



