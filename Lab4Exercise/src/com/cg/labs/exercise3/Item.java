package com.cg.labs.exercise3;

public abstract class Item {
	
	protected int uid;
	protected String titles;
	protected int noOfCopies;
	
	public Item(int uid, String titles, int noOfCopies) {
		super();
		this.uid = uid;
		this.titles = titles;
		this.noOfCopies = noOfCopies;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTiles() {
		return titles;
	}
	public void setTiles(String titles) {
		this.titles = titles;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	abstract public void checkIn();
	
	abstract public void addItem();
	
	abstract public void checkOut();

	@Override
	public String toString() {
		return "Item [uid=" + uid + ", titles=" + titles + ", noOfCopies=" + noOfCopies + "]";
	}
	
	public Item() {
		
	}
}
