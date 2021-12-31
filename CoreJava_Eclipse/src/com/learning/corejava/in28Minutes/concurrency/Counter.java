package com.learning.corejava.in28Minutes.concurrency;

public class Counter {

	private int i;

	public synchronized void increementI() {
		i++;
	}

	public int getI() {
		return i;
	}

}
