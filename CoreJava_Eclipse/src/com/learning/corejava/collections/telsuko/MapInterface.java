package com.learning.corejava.collections.telsuko;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {

//	Map<String, String> map=new HashMap<>();
	Map<String, String> map=new Hashtable<>();          // thread-safe
	map.put("name", "sathian");
	map.put("address", "thevur");
	map.put("company", "p3");
	map.put("name", "nivetha");

	Set<String> keys=map.keySet();
	for (String string : keys) {
		System.out.println(map.get(string));
	}
}

}
