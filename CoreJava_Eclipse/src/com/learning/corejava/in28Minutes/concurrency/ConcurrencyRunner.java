package com.learning.corejava.in28Minutes.concurrency;

public class ConcurrencyRunner {
	
	public static void main(String[] args) {
		
		Counter counter=new Counter();
		counter.increementI();
		counter.increementI();
		System.out.println(counter.getI());
	}

}
