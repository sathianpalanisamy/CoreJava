package com.learning.corejava.hackerankproblems.data_structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int noOfOperation = scanner.nextInt();
            scanner.nextLine();

            Map<String, Integer> phoneBook = new HashMap<>();
            while (noOfOperation-- > 0) {
                String name = scanner.nextLine();
                Integer phoneNo = scanner.nextInt();
                phoneBook.put(name, phoneNo);
                scanner.nextLine();
            }

            while (scanner.hasNext()) {
                String query = scanner.nextLine();


                String result = phoneBook.containsKey(query)
                        ? query + "=" + phoneBook.get(query)
                        : "Not found";
                System.out.println(result);
            }

        }

    }
}
