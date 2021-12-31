package com.learning.corejava.in28minutes.h_collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {

        String para = "This is an awesome occasion. This is never happened before";
        char[] array = para.toCharArray();

        Map<Character, Integer> charOccurence = new HashMap<>();

        for (char c : array) {
            Integer value = charOccurence.get(c);
            if (value == null) {
                charOccurence.put(c, 1);
            } else {
                charOccurence.put(c, value + 1);

            }
        }
        System.out.println(charOccurence);

        String[] words = para.split(" ");

        Map<String, Integer> wordOccurs = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (wordOccurs.containsKey(words[i])) {
                wordOccurs.put(words[i], wordOccurs.get(words[i]) + 1);
            } else {
                wordOccurs.put(words[i], 1);

            }

        }
        System.out.println(wordOccurs);

    }
}
