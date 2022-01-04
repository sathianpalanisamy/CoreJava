package com.learning.corejava.hackerankproblems.data_structures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Java2DArray {
    public static void main(String[] args) throws IOException {

        ArrayList<List<Integer>> values = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            IntStream.range(0, 6).forEach(i -> {
                try {
                    values.add(
                            Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });


        }
        Integer minValue = Integer.MIN_VALUE;

        for (int i = 0; i < values.size()-2; i++) {
            for (int j = 0; j < values.get(i).size()-2; j++) {

                int sum = values.get(i).get(j) + values.get(i).get(j + 1) + values.get(i).get(j + 2) + values.get(i + 1).get(j + 1)
                        + values.get(i + 2).get(j) + values.get(i + 2).get(j + 1) + values.get(i + 2).get(j + 2);
                if(sum>minValue)
                    minValue =sum;

            }
        }
        System.out.println(minValue);

    }
}
