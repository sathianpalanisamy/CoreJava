package com.learning.corejava.in28Minutes.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	/*
	 * ArrayList
	 * LinkedList
	 * Vector
	 * 
	 */

	public static void main(String[] args) {
		List<String> words = List.of("sathian", "nivetha"); // Immutable List

		System.out.println(words);
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		System.out.println(words.get(1));
		System.out.println(words.contains("nivetha"));
		System.out.println(words.indexOf("nivetha")); // if it returns -1 then the value is not present in the list

		// List.of is Immutable so, u cant add any value
		// words.add("sathian");

		/*
		 * for creating a Mutable List either u can use ArrayList,LinkedList,Vector
		 * 
		 */

		List<String> wordsArrayList = new ArrayList<>(words);
		wordsArrayList.add("mahesh");
		System.out.println("ArrayList ->" + wordsArrayList);

		List<String> wordsLinkedList = new LinkedList<>(words);
		wordsLinkedList.add("mahesh");
		System.out.println("LinkedList ->" + wordsLinkedList);

		List<String> Wwrdsvector = new Vector<>(words);
		Wwrdsvector.add("mahesh");
		System.out.println("Vector ->" + Wwrdsvector);

		/*
		 * Arrays DataStructure (ArrayList,Vector)
		 * 
		 * i) Insertion and Deletion are slower compared to LinkedList ii) Almost
		 * Constant Time -Access
		 * 
		 * 
		 * 
		 * Linked List DataStructure( LinkedList)
		 * 
		 * i) Elements are Doubly Linked - forward and backward - to on ii) Iteration is
		 * slower than ArrayList iii) Faster Insertion and Deletion
		 * 
		 * 
		 * Difference b/w ArrayList and Vector
		 * 
		 * i) Vector is Thread Safe -> Synchronized Methods ii) Almost Constant Time
		 * -Access
		 * 
		 */

		// for add an element
		wordsArrayList.add("swetha");
		System.out.println("add ->" + wordsArrayList);

		// for add an element at a specific position
		wordsArrayList.add(2, "raja");
		System.out.println("add ->" + wordsArrayList);

		// we can add duplicate in the list
		wordsArrayList.add(2, "raja");
		wordsArrayList.add("raja");
		System.out.println("add ->" + wordsArrayList);

		List<String> newList = List.of("saravana", "maha");

		// for adding one list to another list
		wordsArrayList.addAll(newList);
		System.out.println(wordsArrayList);

		// for updating element at a specific position
		wordsArrayList.set(2, "kaniha");
		System.out.println(wordsArrayList);

		// for removing an element from the list
		wordsArrayList.remove(2);
		wordsArrayList.remove("maha");
		System.out.println(wordsArrayList);

		/*
		 * 
		 * Exercise: i) do these operation for LinkedList and Vector ii) merge three
		 * list in to a singlelist
		 */

		// i) using for loop to iterate the list
		System.out.println("----- for loop -----");
		for (int j = 0; j < wordsArrayList.size(); j++) {

			System.out.println(wordsArrayList.get(j));

		}

		// ii) using enhanced for loop to iterate the list
		System.out.println("----- enhanced for loop -----");
		for (String string : wordsArrayList) {
			System.out.println(string);
		}

		// iii) using iterator to iterate the list
		System.out.println("----- iterator -----");

		Iterator<String> lis = wordsArrayList.iterator();
		while (lis.hasNext()) {
			System.out.println(lis.next());

		}

		Iterator<String> itr = wordsArrayList.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals("raja")) {
				itr.remove();
			}

		}
		System.out.println(wordsArrayList);

		/*
		 * Note: i) use iterator to removing an element in the list ii) use enhanced for
		 * loop for iteration
		 */
		
		
		List nl=List.of("A",'a',1,1.0);
		System.out.println(nl.get(0) instanceof String);
		System.out.println(nl.get(1) instanceof Character);
		System.out.println(nl.get(2) instanceof Integer);
		System.out.println(nl.get(3) instanceof Double);
		
		List<Integer> nuIntegers=List.of(1,4,2,9);
		System.out.println(nuIntegers.indexOf(9));
		
		List<Integer> integers=new ArrayList<>(nuIntegers);
		System.out.println(integers.indexOf(9));
		System.out.println(integers.remove(Integer.valueOf(9)));


		//sorting the numbers
		
		List<Integer> sortNo=List.of(23,67,17);
		
		List<Integer> no=new ArrayList<>(sortNo);
		Collections.sort(no);
		System.out.println("sorted no are "+no);
	}

}
