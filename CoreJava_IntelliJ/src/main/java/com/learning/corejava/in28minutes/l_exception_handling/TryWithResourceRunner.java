package com.learning.corejava.in28minutes.l_exception_handling;

import java.util.Scanner;

public class TryWithResourceRunner {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int value = scn.nextInt();
        }
    }
}
