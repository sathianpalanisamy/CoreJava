package com.learning.corejava.hackerankproblems.data_structures;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {

            int m = scn.nextInt();
            int n = scn.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();
            Set<Integer> set = new HashSet<>();
            Integer minValue = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {

                Integer element = scn.nextInt();
                deque.add(element);
                set.add(element);

                if (deque.size() == n) {
                    if (minValue < set.size()) {
                        minValue = set.size();
                    }
                    Integer integer = deque.removeFirst();

                    if (!deque.contains(integer))
                        set.remove(integer);
                }


            }
            System.out.println(minValue);

        }


    }
}
