package com.cg.labs.exercise3;

import java.util.Scanner;

public class Video extends MediaItem{
	
	protected String director;
	protected String genre;
	protected int yearReleased;
	
	public Video(int uid, String titles, int noOfCopies, int runtime, String director, String genre, int string) {
		super(uid, titles, noOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = string;
	}
	
	public Video() {
		super();
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
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
		
		System.out.println("Enter year");
		this.yearReleased = input.nextInt();
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("Enter the title");
		this.titles = scanner1.nextLine();
		
		System.out.println("Enter the genre");
		this.genre = scanner1.nextLine();
		
		System.out.println("Enter the director name");
		this.director = scanner1.nextLine();
		
		input.close();
		scanner1.close();	
	}

	@Override
	public String toString() {
		return super.toString() + " Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + "]";
	}
	
	
}
