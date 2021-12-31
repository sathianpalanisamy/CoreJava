package com.learning.corejava.in28Minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i;
	private int j;

	Lock lockForI =new ReentrantLock();
	Lock lockForJ =new ReentrantLock();	
	

	public void increementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}
	
	public void increementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	

}
