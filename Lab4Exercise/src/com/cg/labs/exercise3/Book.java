package com.cg.labs.exercise3;

import java.util.Scanner;

public class Book extends WrittenItem {

	
	public Book() {
		super();
	}

	public Book(int uid, String tiles, int noOfCopies, String author) {
		super(uid, tiles, noOfCopies, author);
	}
	
	public void checkIn()
	{
		this.noOfCopies += 1;
	}
	
	public void checkOut() {
		this.noOfCopies -= 1;
	}
	
	@Override
	public void addItem() {		
		
		System.out.println("Enter UID");
		Scanner input = new Scanner(System.in);
		
		this.uid = input.nextInt();
		
		System.out.println("Type no of copies");
		this.noOfCopies = input.nextInt();
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter the title");
		this.titles = scanner1.nextLine();
		
		System.out.println("Enter the author name");
		this.author = scanner1.nextLine();
		
		input.close();
		scanner1.close();	
	}
	
	@Override
	public String toString() {
		return "Book [author=" + author + ", uid=" + uid + ", titles=" + titles + ", noOfCopies=" + noOfCopies + "]";
	}
	
	
}
