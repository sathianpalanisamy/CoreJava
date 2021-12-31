package com.learning.corejava.in28minutes.a_first_java_programming.a_multiplication_table;

class MultiplicationTable{

     void print(){
         print(5);
    }

    void print(int table){
         print(table,1,10);
    }

    void print(int table,int from,int to){
        for (int i=from;i<=to;i++){
            System.out.printf("%d * %d = %d",table,i,table*i).println();
        }
    }
}

public class MultiplicationTableRunner {

    public static void main(String[] args) {

        MultiplicationTable multiplicationTable = new MultiplicationTable();
//        multiplicationTable.print();
//        multiplicationTable.print(3);
        multiplicationTable.print(2,1,10);
    }
}
