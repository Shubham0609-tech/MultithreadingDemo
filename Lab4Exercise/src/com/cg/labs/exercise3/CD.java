package com.cg.labs.exercise3;

import java.util.Scanner;

public class CD extends MediaItem {
	
	protected String artist;
	protected String genre;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public CD(int uid, String titles, int noOfCopies, int runtime, String actor, String genre) {
		super(uid, titles, noOfCopies, runtime);
		this.artist = actor;
		this.genre = genre;
	}
	
	public CD() {
		super();
	}
	
	public void checkIn()
	{
		this.noOfCopies += 1;
	}
	
	public void checkOut() {
		this.noOfCopies -= 1;
	}
	
	public void addItem() {
		
		//Int data members
		System.out.println("Enter UID");
		Scanner input = new Scanner(System.in);
		
		this.uid = input.nextInt();
		
		System.out.println("Type no of copies");
		this.noOfCopies = input.nextInt();
		
		System.out.println("Enter runtime");
		this.runtime = input.nextInt();
		
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter the title");
		this.titles = scanner1.nextLine();
		
		System.out.println("Enter the genre");
		this.genre = scanner1.nextLine();
		
		System.out.println("Enter the actor name");
		this.artist = scanner1.nextLine();
		
		input.close();
		scanner1.close();	
	}
	@Override
	public String toString() {
		return super.toString() + " CD [artist=" + artist + ", genre=" + genre + "]";
	}
	
	
}
