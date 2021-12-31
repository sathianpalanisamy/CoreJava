package com.learning.corejava.in28Minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {

	private AtomicInteger i=new AtomicInteger();
	private AtomicInteger j=new AtomicInteger();
	

	public void increementI() {
		i.incrementAndGet();
	}
	
	public void increementJ() {
		j.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public int getJ() {
		return j.get();
	}
	

}
