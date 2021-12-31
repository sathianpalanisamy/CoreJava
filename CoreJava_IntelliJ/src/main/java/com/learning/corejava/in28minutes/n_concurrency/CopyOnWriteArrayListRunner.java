package com.learning.corejava.in28minutes.n_concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> words = new CopyOnWriteArrayList<>();
        words.add("bat");
        words.add("cat");
        words.add("rat");

        words.stream().forEach(s-> System.out.println(s));
    }
}
