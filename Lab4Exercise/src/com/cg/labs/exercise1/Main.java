package com.cg.labs.exercise1;


public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Kathy",23f);
		Account acc1 = new CurrentAccount(1111, 3000 , p1);
		
		Person p2 = new Person("Smith", 20f);
		Account acc2 = new Account(2222, 2000 , p1);
		
		acc1.withdraw(4000);
		acc2.deposit(2000);
		
		System.out.println(acc1.getBalance());
		//System.out.println(acc2.getBalance());
		
	}

}