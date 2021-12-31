package com.learning.corejava.in28minutes.e_loops;


class WhileNumberPlayer{

    private int limit;

    WhileNumberPlayer(int limit){
        this.limit=limit;
    }

    public void printSquareUpToLimit() {

        int i=1;

        while ((i*i)<=limit){
            System.out.print((i*i)+" ");
            i++;
        }

    }

    public void printCubeUpToLimit() {

        int i=1;

        while ((i*i*i)<=limit){
            System.out.print((i*i*i)+" ");
            i++;
        }
    }
}

public class WhileLoopExercise {

    public static void main(String[] args) {

        WhileNumberPlayer whileNumberPlayer=new WhileNumberPlayer(30);

        whileNumberPlayer.printSquareUpToLimit();
        System.out.println();
        whileNumberPlayer.printCubeUpToLimit();

    }
}
