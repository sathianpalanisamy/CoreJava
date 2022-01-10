package com.learning.corejava.hackerankproblems.object_oriented_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class JavaInstanceofkeyword {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int noOfInputs = scanner.nextInt();
            ArrayList objects = new ArrayList();
            while (noOfInputs-- > 0) {
                String s =scanner.next();
                if (s.equals("Student")) {
                    objects.add(new Student());
                    continue;
                }
                if (s.equals("Rockstar")) {
                    objects.add(new Rockstar());
                    continue;
                }
                if (s.equals("Hacker")) {
                    objects.add(new Hacker());
                    continue;
                }
                System.out.println("exit");
            }

            printInstanceCount(objects);
        }

    }

    static void printInstanceCount(List objects) {

        int student = 0;
        int rockstar = 0;
        int hacker = 0;

        for (Object o : objects) {
            if (o instanceof Student) {
                student++;
            }
            if (o instanceof Rockstar) {
                rockstar++;
            }
            if (o instanceof Hacker) {
                hacker++;
            }
        }
        System.out.println(student+" "+rockstar+" "+hacker);

    }
}
