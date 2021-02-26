package com.cg.labs.exercise1;

public class Account {
	
	protected long accNumber;
	protected double balance;
	protected Person accHolder;
		
	public long getAccNumber() {
		return accNumber;
	}
	
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double inr) {
		this.balance = balance + inr;
		return this.balance;
	}
	
	public void withdraw(double inr) {
		this.balance = balance - inr;
	}
	
	public Account(long accountNumber,double accountBalance,Person accHolder ) {
		this.accNumber = accountNumber;
		this.balance = accountBalance;
		this.accHolder = accHolder;
	}
	
	public Account() {
		
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	
	//	Create default constructor and create toString()
	
}
