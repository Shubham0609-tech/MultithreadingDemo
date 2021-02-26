package com.cg.labs.exercise3;

import java.util.Scanner;

public class Journal extends WrittenItem {
	
	protected int yearPublished;
	
	public Journal() {
		super();
	}

	public Journal(int uid, String titles, int noOfCopies, String author, int yearPublished) {
		super(uid, titles, noOfCopies, author);
		this.yearPublished = yearPublished;
	}
	
	public void addItem() {
		
		System.out.println("Enter UID");
		Scanner input = new Scanner(System.in);
		
		this.uid = input.nextInt();
		
		System.out.println("Type no of copies");
		this.noOfCopies = input.nextInt();
		
		System.out.println("Enter the year of publishing");
		this.yearPublished = input.nextInt();		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter the title");
		this.titles = scanner1.nextLine();
		
		System.out.println("Enter the author name");
		this.author = scanner1.nextLine();
		
		input.close();
		scanner1.close();		
	}
	
	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void checkIn() {
		
		this.noOfCopies +=1;
		
	}
	
	public void checkOut() {
		
		this.noOfCopies -= 1;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Year: "+ this.yearPublished;
	}
	
	
}
