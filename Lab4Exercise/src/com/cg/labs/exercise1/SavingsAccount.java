package com.cg.labs.exercise1;

public class SavingsAccount extends Account {
	
	final double minimumBalance = 1000;
	
	@Override
	public void withdraw(double inr) {
		if(balance < minimumBalance) {
			System.out.println("Not enough Balance");
		}else if(inr > balance){
			System.out.println("Ammount greater than balance");
		}else {
			super.balance = super.balance - inr;
		}
	}
	
	public SavingsAccount(long accountNumber, double accountBalance, Person accHolder) {
		super(accountNumber,accountBalance,accHolder);
	}
	
	@Override
	public synchronized double deposit(double inr) {
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.getMessage();
		}
		this.balance += inr;
		System.out.println(this.accHolder +" "+ this.balance +" " +Thread.currentThread().getName());
		return this.balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}
	
	public SavingsAccount() {
		
	}

	@Override
	public String toString() {
		return "SavingsAccount [minimumBalance=" + minimumBalance + "]";
	}
	
	
	
	//Create getters for the minimum balance
	//Create default constructor
	//Create constructor which takes 3 parameters
	//Override toString() method
}

