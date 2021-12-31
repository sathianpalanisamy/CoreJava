package com.learning.corejava.in28Minutes.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
	
	public static void main(String[] args) {
		
		String str = "I am Sathian MP";
		ConcurrentMap<Character, LongAdder> charOccrence=new ConcurrentHashMap<>();
		
		char[] charArray=str.toCharArray();
		
		for (char c : charArray) {
			
			charOccrence.computeIfAbsent(c, ch->new LongAdder()).increment();;
			
//			LongAdder adder=charOccrence.get(c);
//			if(adder==null)
//			{
//				adder=new LongAdder();
//				
//			}
//			adder.increment();
//			charOccrence.put(c, adder);

			
		}
		System.out.println(charOccrence);
		

	}

}
