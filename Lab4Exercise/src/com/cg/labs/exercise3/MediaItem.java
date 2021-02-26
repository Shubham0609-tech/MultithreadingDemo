package com.cg.labs.exercise3;

public abstract class MediaItem extends Item{

	protected int runtime;

	public MediaItem(int uid, String titles, int noOfCopies, int runtime) {
		super(uid,titles,noOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return super.toString() + " runtime: " + runtime;
	}
	
	public MediaItem() {
		super();
	}

	
	
}
