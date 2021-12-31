package com.learning.corejava.in28minutes.n_concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {

        String word = "hello hello";
        Map<Character, LongAdder> occurrencesHahMap= new Hashtable<>();
        for (char character:word.toCharArray()) {
            LongAdder longAdder = occurrencesHahMap.get(character);
            if(longAdder==null){
                longAdder =new LongAdder();
            }
            longAdder.increment();
            occurrencesHahMap.put(character,longAdder);
        }
        System.out.println(occurrencesHahMap);


        ConcurrentMap<Character, LongAdder> occurrences= new ConcurrentHashMap<>();
        for (char character:word.toCharArray()) {
            occurrences.computeIfAbsent(character,(a)->new LongAdder()).increment();
        }
        System.out.println(occurrences);
    }
}
