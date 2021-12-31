package com.learning.corejava.in28minutes.h_collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceExample {

    public static void main(String[] args) {
        Map<String,Integer> values =Map.of("A",3,"C",2,"B",9);
        System.out.println(values);
        System.out.println(values.get("A"));
        System.out.println(values.size());
        System.out.println(values.isEmpty());
        System.out.println(values.containsKey("A"));
        System.out.println(values.containsValue(2));
        System.out.println(values.values());

        Map<String,Integer> keys= new HashMap<>(values);
        System.out.println(keys);
        keys.put("Z",10);
        System.out.println(keys);


        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A",10);
        linkedHashMap.put("C",5);
        linkedHashMap.put("B",10);
        System.out.println(linkedHashMap);


        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("A",10);
        treeMap.put("C",5);
        treeMap.put("B",10);
        System.out.println(treeMap);


        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.ceilingKey("B"));
        System.out.println(treeMap.higherKey("B"));
        System.out.println(treeMap.floorKey("B"));
        System.out.println(treeMap.lowerKey("B"));
        System.out.println(treeMap.subMap("A","C"));
    }
}
