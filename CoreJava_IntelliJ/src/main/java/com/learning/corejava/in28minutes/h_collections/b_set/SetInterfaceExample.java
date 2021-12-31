package com.learning.corejava.in28minutes.h_collections.b_set;

import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {

        Set<String> words= Set.of("Apple","Banana");

        Set<String> hashSet = new HashSet<>(words);
        System.out.println(hashSet.add("Apple"));
        System.out.println(hashSet);


        Set<Integer> numbers =new HashSet<>();
        numbers.add(10);
        numbers.add(18);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);

        System.out.println(numbers);

        Set<Integer> linkedHashSetNumbers =new LinkedHashSet<>();
        linkedHashSetNumbers.add(10);
        linkedHashSetNumbers.add(18);
        linkedHashSetNumbers.add(5);
        linkedHashSetNumbers.add(7);
        linkedHashSetNumbers.add(3);

        System.out.println(linkedHashSetNumbers);

        Set<Integer> treeSetNumbers =new TreeSet<>();
        treeSetNumbers.add(10);
        treeSetNumbers.add(18);
        treeSetNumbers.add(5);
        treeSetNumbers.add(7);
        treeSetNumbers.add(3);

        System.out.println(treeSetNumbers);

        List<Character> characters =List.of('A','C','B','Z','M','Z');

        Set<Character> uniqueChars =new HashSet<>(characters);
        System.out.println(uniqueChars);

        Set<Character> insertionOrder =new LinkedHashSet<>(characters);
        System.out.println(insertionOrder);

        Set<Character> sortedOrder = new TreeSet<>(characters);
        System.out.println(sortedOrder);


        System.out.println("-------------- NavigableSet ---------------");

        TreeSet<Integer> nos = new TreeSet<>(Set.of(10,12,5,3,7));
        System.out.println(nos);

        System.out.println("lower then or equal to 12 : "+nos.floor(12));
        System.out.println("lower then 12 : "+nos.lower(12));

        System.out.println("greater then or equal to 12 : "+nos.ceiling(12));
        System.out.println("greater then 12 : "+nos.higher(12));


        System.out.println("between 3 and 12 : "+nos.subSet(3,12));
        System.out.println("between 3 and 12 : "+nos.subSet(3,true,12,true));

        System.out.println(nos.headSet(10));
        System.out.println(nos.tailSet(10));
    }
}
