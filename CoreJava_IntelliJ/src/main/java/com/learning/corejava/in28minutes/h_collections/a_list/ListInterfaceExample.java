package com.learning.corejava.in28minutes.h_collections.a_list;

import java.util.*;

public class ListInterfaceExample {

    public static void main(String[] args) {
        List<String> words=List.of("Apple","cat","bat");
//        words.add("sathian");
        System.out.println(words);

        System.out.println("Size : "+words.size());
        System.out.println("isEmpty : "+words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("cat"));
        System.out.println(words.indexOf("bat"));

        List<String> wordsArrayList = new ArrayList<>(words);
        List<String> wordsLinkedList = new LinkedList<>(words);
        List<String> wordsVector = new Vector<>(words);


        wordsArrayList.add("elephant");
        wordsArrayList.add(2,"dog");
        wordsArrayList.add("dog");

        List<String> newList = List.of("yak","zebra");

        wordsArrayList.addAll(newList);
        wordsArrayList.addAll(1,newList);

        wordsArrayList.set(1,"fish");

        System.out.println(wordsArrayList);

        wordsArrayList.remove(2);
        wordsArrayList.remove("zebra");

        System.out.println(wordsArrayList);

        List<String> list1= List.of("1","2");
        List<String> list2= List.of("3","4");
        List<String> list3= List.of("5","6");

        List<String> mergeList = new ArrayList<>();
        mergeList.addAll(list1);
        mergeList.addAll(list2);
        mergeList.addAll(list3);

        System.out.println(mergeList);

        System.out.println("----- using for loop -----");

        for (int i=0;i<wordsArrayList.size();i++){
            System.out.println(wordsArrayList.get(i));
        }

        System.out.println("----- enhanced for loop -----");

        for(String word : wordsArrayList){
            System.out.println(word);
        }

        System.out.println("----- Iterator -----");

        Iterator<String> iterator = wordsArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
