package com.learning.corejava.in28Minutes.concurrency;

public class BiCounter {

	private int i;
	private int j;


	public synchronized void increementI() {
		i++;
	}
	
	public synchronized void increementJ() {
		j++;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	

}
