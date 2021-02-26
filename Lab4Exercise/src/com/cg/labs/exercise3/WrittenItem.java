package com.cg.labs.exercise3;

public abstract class WrittenItem extends Item {
	
	protected String author;

	public WrittenItem(int uid, String titles, int noOfCopies, String author) {
		super(uid, titles, noOfCopies);
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString()+"Author: " +this.author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public WrittenItem() {
		super();
	}
	

}
