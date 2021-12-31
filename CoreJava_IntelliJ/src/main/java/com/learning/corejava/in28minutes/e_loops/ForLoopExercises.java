package com.learning.corejava.in28minutes.e_loops;

class MyNumber {

    private int num;

    MyNumber(int num) {
        this.num = num;
    }

    public boolean isPrime() {

        if (num < 2)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public int sumUpToN() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;

    }

    public int sumOfDivisors() {


        int sum = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;

    }

    public void printNumberTriangle() {

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

public class ForLoopExercises {

    public static void main(String[] args) {

        MyNumber number = new MyNumber(9);

        boolean isPrime = number.isPrime();
        System.out.println("is Prime : " + isPrime);

        int sumUpToN = number.sumUpToN();
        System.out.println("sum up to n : " + sumUpToN);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisors : "+sumOfDivisors);

        number.printNumberTriangle();

    }
}
