package com.learning.corejava.telusko.d_iteration;

public class ForLoop {

    public static void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            System.out.println("Hello World");
//        }



        /*

         * * * *
         * * * *
         * * * *
         * * * *

         */

        for (int i =0;i<4;i++)
        {
            for(int j =0; j<4 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        1 2 3 4
        1 2 3 4
        1 2 3 4
        1 2 3 4
         */

        for (int i =1;i<=4;i++)
        {
            for(int j =1; j<=4 ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
