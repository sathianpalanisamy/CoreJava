package com.learning.corejava.hackerankproblems;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        String[] nos = new String[limit];

        for (int i = 0; i < limit; i++) {
            nos[i] = scanner.next();
        }

        Arrays.stream(nos).sorted((o1, o2) -> {
            BigDecimal no1 = new BigDecimal(o1);
            BigDecimal no2 = new BigDecimal(o2);
            return no2.compareTo(no1);
        }).forEach(System.out::println);


    }
}
