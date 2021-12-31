package com.learning.corejava.in28Minutes.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> chars = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> hashChars = new HashSet<>(chars);
		System.out.println("unique " + hashChars);

		Set<Character> linkedHashChars = new LinkedHashSet<>(chars);
		System.out.println("Insertion Order " + linkedHashChars);

		Set<Character> treeChars = new TreeSet<>(chars);
		System.out.println("Sorted Order " + treeChars);

		TreeSet<Integer> nos = new TreeSet<>(Set.of(17, 26, 15, 9, 16, 8));
		System.out.println("list of numbers " + nos);

		System.out.println("the no is lower than 9 -> " + nos.floor(9)); // this is strictly inclusive
		System.out.println("the no is lower than 9 -> " + nos.lower(9)); // this is strictly lower
		System.out.println("the no is greater than 9 -> " + nos.ceiling(16)); // this is strictly inclusive
		System.out.println("the no is greater than 9 -> " + nos.higher(16)); // this is strictly higher

		System.out.println("the no is greater than 9 -> " + nos.subSet(9, 16)); // this is strictly higher
		System.out.println("return 9<no<16 -> " + nos.subSet(9, false, 16, false)); // this is strictly higher

		
		System.out.println("return no<15 -> " + nos.headSet(15)); 
		System.out.println("return no>=15 -> " + nos.tailSet(15)); 

	}

}
