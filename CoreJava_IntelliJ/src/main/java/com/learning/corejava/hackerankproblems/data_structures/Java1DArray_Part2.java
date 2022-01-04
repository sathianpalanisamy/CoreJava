package com.learning.corejava.hackerankproblems.data_structures;

import java.util.*;

public class Java1DArray_Part2 {

    public static boolean find_path(int leap, int[] game, int x) {
        if (x < 0) {
            return false;
        }

        if (x > game.length - 1) {
            return true;
        }

        if (game[x] != 0) {
            return false;
        }
        game[x] = 1;

        if (find_path(leap, game, x + 1)) {
            return true;
        }
        if (find_path(leap, game, x + leap)) {
            return true;
        }
        if (find_path(leap, game, x - 1)) {
            return true;
        }
//        game[x] = 0;

        return false;
    }

    public static boolean canWin(int leap, int[] game) {
        return find_path(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for (int j = 0; j < q; j++) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}