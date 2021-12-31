package com.learning.corejava.in28minutes.e_loops;

import java.util.Scanner;

public class DoWhileExercise {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int no=-1;
        do {
            if(no!=-1)
                System.out.println("Cube is : "+(no*no*no));
            System.out.print("Enter a no : ");
            no =scanner.nextInt();
        }while (no>0);
        scanner.close();
        System.out.println("Thank you");

    }
}
