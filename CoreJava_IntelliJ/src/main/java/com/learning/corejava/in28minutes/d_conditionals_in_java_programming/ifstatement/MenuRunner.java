package com.learning.corejava.in28minutes.d_conditionals_in_java_programming.ifstatement;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {

        System.out.print("Enter Number1: ");
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();

        System.out.print("Enter Number2: ");
        int number2 = scn.nextInt();

        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - operation");

        int operation;
        do {
            System.out.print("Enter operation: ");
            operation = scn.nextInt();
            performOperationUsingSwitch(number1, number2, operation);
        }while (operation<=4);




    }

    private static void performOperationUsingNetedIfElse(int number1, int number2, int operation) {
        if (operation == 1) {
            System.out.println("Result : " + (number1 + number2));
        } else if (operation == 2) {
            System.out.println("Result : " + (number1 - number2));
        } else if (operation == 3) {
            System.out.println("Result : " + (number1 * number2));
        } else if (operation == 4) {
            System.out.println("Result : " + (number1 / number2));
        } else {
            System.out.println("Invalid Operation");
        }
    }


    private static void performOperationUsingSwitch(int number1, int number2, int operation) {

        switch (operation) {
            case 1:
                System.out.println("Result : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result : " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result : " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Operation");

        }
    }
}
