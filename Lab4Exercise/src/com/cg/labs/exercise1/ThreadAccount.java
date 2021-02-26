package com.cg.labs.exercise1;

public class ThreadAccount extends Thread {
	
	private SavingsAccount account;
	private String name;
	
	public ThreadAccount(SavingsAccount account, String name) {
		super();
		this.account = account;
		this.name = name;
	}
	
	public void run() {
		this.account.deposit(1000);
	}
	
	public static void main(String[] args) {
		
		SavingsAccount amit = new SavingsAccount(11,3000.0,new Person("Amit",33));
		SavingsAccount sumit = new SavingsAccount(13,4000.0,new Person("sumit",32));
		
		ThreadAccount amit1 = new ThreadAccount(amit,"Amit Thread");
		ThreadAccount amit2 = new ThreadAccount(amit,"Dhruv Thread");

		ThreadAccount sumit1 = new ThreadAccount(sumit,"Sumit Thread");
		ThreadAccount sumit2 = new ThreadAccount(sumit,"Sourav Thread");
		
		amit1.run();
		amit2.run();
		sumit1.run();
		sumit2.run();
		
	
	}
	

}
