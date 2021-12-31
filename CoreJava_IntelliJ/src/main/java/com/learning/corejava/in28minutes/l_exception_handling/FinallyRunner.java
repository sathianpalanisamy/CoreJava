package com.learning.corejava.in28minutes.l_exception_handling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int[] numbers = {10, 3};
            int no = numbers[1];

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Before Closing Scanner");
            if (scanner != null)
                scanner.close();
            System.out.println("Scanner is closed");
        }

    }
}
