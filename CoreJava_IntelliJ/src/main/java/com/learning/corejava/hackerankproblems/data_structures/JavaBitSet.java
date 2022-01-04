package com.learning.corejava.hackerankproblems.data_structures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {


        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();

            BitSet[] bitSets = {new BitSet(n), new BitSet(n)};

            while (m-- > 0) {
                String operation = scn.next();
                int input1 = scn.nextInt() - 1;

                switch (operation) {
                    case "AND": {
                        int input2 = scn.nextInt() - 1;
                        bitSets[input1].and(bitSets[input2]);
                        break;
                    }
                    case "OR": {
                        int input2 = scn.nextInt() - 1;
                        bitSets[input1].or(bitSets[input2]);
                        break;
                    }
                    case "XOR": {
                        int input2 = scn.nextInt() - 1;
                        bitSets[input1].xor(bitSets[input2]);
                        break;
                    }
                    case "FLIP": {
                        int input2 = scn.nextInt();
                        bitSets[input1].flip(input2);
                        break;
                    }
                    case "SET": {
                        int input2 = scn.nextInt();
                        bitSets[input1].set(input2);
                        break;
                    }
                }
                System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
            }
        }
    }
}
