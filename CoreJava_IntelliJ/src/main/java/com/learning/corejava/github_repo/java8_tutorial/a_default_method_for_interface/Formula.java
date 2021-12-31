package com.learning.corejava.github_repo.java8_tutorial.a_default_method_for_interface;

public interface Formula {

    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }


}
class FormulaRunner{
    public static void main(String[] args) {
        Formula formula =new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));

    }
}
