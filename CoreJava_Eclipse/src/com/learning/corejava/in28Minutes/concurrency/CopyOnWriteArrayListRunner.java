package com.learning.corejava.in28Minutes.concurrency;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayListRunner {
	public static void main(String[] args) {
//		List<String> list=new CopyOnWriteArrayList<>();
		
		Set<String> list=new CopyOnWriteArraySet<>();

		
		// Thread 3
		list.add("hello");
		list.add("welcome");
		list.add("sathian");
		
		
		// Thread 1000
		for (String string : list) {
			System.out.println(string);
		}
	}

}
