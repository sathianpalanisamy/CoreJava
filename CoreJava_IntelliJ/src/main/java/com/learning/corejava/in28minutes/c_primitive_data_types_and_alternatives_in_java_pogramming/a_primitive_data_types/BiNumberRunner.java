package com.learning.corejava.in28minutes.c_primitive_data_types_and_alternatives_in_java_pogramming.a_primitive_data_types;
class BiRunner{

    private int number1;
    private int number2;

    BiRunner(int number1, int number2){
        this.number1 =number1;
        this.number2=number2;
    }

    public int add(){
        return number1+number2;
    }

    public int multiply(){
        return number1*number2;
    }

    public void doubleValue() {
        this.number1*=number1;
        this.number2*=number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}

public class BiNumberRunner {
    public static void main(String[] args) {
        BiRunner biRunner = new BiRunner(2,3);
        System.out.println(biRunner.add());
        System.out.println(biRunner.multiply());
        biRunner.doubleValue();
        System.out.println(biRunner.getNumber1());
        System.out.println(biRunner.getNumber2());


    }
}
