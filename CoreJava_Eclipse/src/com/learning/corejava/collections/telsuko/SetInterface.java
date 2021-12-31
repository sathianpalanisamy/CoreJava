package com.learning.corejava.collections.telsuko;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	/*
	 * Set does not allow to store the duplicate values
	 */
	public static void main(String[] args) {

		/*
		 * HashSet does not maintain insertion order
		 */
		System.out.println("HashSet");
		Set<Integer> values = new HashSet<>();
		values.add(10);
		values.add(27);
		values.add(17);
		values.add(17);

		for (Integer integer : values) {
			System.out.println(integer);
		}

		System.out.println("TreeSet");
		/*
		 * Treeset maintain ascending order
		 */

		Set<Integer> tree = new TreeSet<>();
		tree.add(10);
		tree.add(27);
		tree.add(17);
		tree.add(17);

		for (Integer integer : tree) {
			System.out.println(integer);
		}
	}
}
