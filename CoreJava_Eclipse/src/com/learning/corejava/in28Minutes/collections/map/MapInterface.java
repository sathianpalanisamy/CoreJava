package com.learning.corejava.in28Minutes.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	/*
	 * 
	 * HashMap i) unsorted,unordered ii) key's hashcode is used
	 * 
	 * HashTable i) Synchronized -Thread Safe - Version of HashMap ii)
	 * unsorted,unordered iii) key's hashcode is used iv) HashMap allows a key with
	 * null value HashTable doesn't
	 * 
	 * LinkedHashMap - i)instertion order is maintained ii) slower insertion and
	 * deletion iii) faster iteration
	 * 
	 * TreeMap i) Sorted order is maintained ii) implements NavigableMap
	 * 
	 */

	public static void main(String[] args) {

		Map<String, Integer> map = Map.of("A", 3, "B", 10, "Z", 5);
		System.out.println(map);
		
		System.out.println(map.get("A"));
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("Z"));
		System.out.println(map.containsValue(8));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Map<String, Integer> hashMap=new HashMap<String, Integer>(map);
		hashMap.put("Y", 10);
		hashMap.put("B", 11);
		System.out.println(hashMap);
		
		
		TreeMap<String, Integer> treeMap=new TreeMap<>(map);
		treeMap.put("Y", 10);
		treeMap.put("D", 9);
		System.out.println(treeMap);
		
		// NavigableMap Interface functions
		
		System.out.println(treeMap.higherKey("B"));
		System.out.println(treeMap.ceilingKey("B"));
		System.out.println(treeMap.lowerKey("B"));
		System.out.println(treeMap.floorKey("B"));
		System.out.println(treeMap.firstEntry());
		System.out.println(treeMap.lastEntry());
		System.out.println(treeMap.subMap("B", "Y"));



		

	}

}
