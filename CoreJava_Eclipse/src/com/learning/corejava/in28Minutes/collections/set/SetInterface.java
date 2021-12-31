package com.learning.corejava.in28Minutes.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	/*
	 * i) Unique things only - Does not allow duplication ii) if obj1.equals(obj2)
	 * then only one of them in the set
	 * 
	 * 
	 * - HashSet - LinkedHashSet - TreeSet
	 */
	public static void main(String[] args) {
		Set<String> sets = Set.of("Apple", "Banana");
		System.out.println(sets);

		Set<String> modifiableSet = new HashSet<>(sets);
		modifiableSet.add("Banana");
		System.out.println(modifiableSet);

		// HashSet
		Set<Integer> nos = new HashSet<>();
		nos.add(10);
		nos.add(17);
		nos.add(54);
		System.out.println("HahSet " + nos);

		// LinkedHashSet
		Set<Integer> lhnos = new LinkedHashSet<>();
		lhnos.add(10);
		lhnos.add(65);
		lhnos.add(54);
		System.out.println("LinkedHahSet " + lhnos);
		
		Set<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(65);
		ts.add(54);
		System.out.println("TreeSet " + ts);

	}

}
