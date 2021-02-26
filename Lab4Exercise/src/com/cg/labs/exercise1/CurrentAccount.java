package com.cg.labs.exercise1;

public class CurrentAccount extends Account{
	
	protected double overdraftLimit = 2000;
	
	@Override
	public void withdraw(double inr) {
		
		if(inr > (balance+overdraftLimit)) {
			System.out.println("OverdraftLimit reached....");
		}else {
			balance = balance - inr;
			System.out.println("The new balance is " + balance);
		}
	}
	
	public CurrentAccount(long accountNumber, double accountBalance, Person accHolder) {
		super(accountNumber,accountBalance,accHolder);
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accountNumber, double accountBalance, Person accHolder, double overdraftLimit) {
		super(accountNumber, accountBalance, accHolder);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraftLimit=" + overdraftLimit + "]";
	}
	
	
	//Create getters and setters for the overdraft limit
	//Create default constructor
	//Create constructor which takes 4 parameters
	//Override toString() method

}
