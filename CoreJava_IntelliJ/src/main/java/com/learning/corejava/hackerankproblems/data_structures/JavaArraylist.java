package com.learning.corejava.hackerankproblems.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaArraylist {
    public static void main(String[] args) {

        try(Scanner scn = new Scanner(System.in)){
            ArrayList<List<Integer>> nos = new ArrayList<>();
            int n = scn.nextInt();
            scn.nextLine();
            IntStream.range(0,n).forEach(i->{
                nos.add(Stream.of(scn.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
            });

            int q = scn.nextInt();
            scn.nextLine();
            IntStream.range(0,q).forEach(i->{
                Integer[] no = Stream.of(scn.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

                try {
                    System.out.println(nos.get(no[0]-1).get(no[1]));
                }catch (Exception e){
                    System.out.println("ERROR!");
                }

            });
        }
    }
}
