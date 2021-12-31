package com.learning.corejava.collections.telsuko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	/*
	 * Collection Interface does not work with index
	 * 
	 * ArrayList -> supports duplicate value
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

//		Collection values=new ArrayList<>();

		List<Integer> values = new ArrayList<>();

		values.add(102);
		values.add(501);
		values.add(104);
		values.add(306);
//		values.add("sathian");
//		values.add(2, "saravana");

//		Comparator<Integer> c = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if (o1 % 10 > o2 % 10)
//					return 1;
//				else
//					return -1;
//			}
//
//		};

//		Comparator<Integer> c = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return (o1 % 10 > o2 % 10)?1:-1;
//			}
//
//		};

		Comparator<Integer> c = (o1, o2) -> o1 % 10 > o2 % 10 ? 1 : -1 ;
	

		Collections.sort(values, c);

//		Collections.sort(values);
//		Collections.reverse(values);
//		Collections.shuffle(values);

//		System.out.println(values);

		for (Integer object : values) {
			System.out.println(object);
		}

//		for (int i = 0; i < values.size(); i++) {
//			System.out.println(values.get(i));
//		}

//		Iterator itr=values.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}

	}

}
