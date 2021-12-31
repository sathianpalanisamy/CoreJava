package com.learning.corejava.in28minutes.c_primitive_data_types_and_alternatives_in_java_pogramming.a_primitive_data_types;

import java.math.BigDecimal;

class SimpleInterestCalculator{
    BigDecimal principalAmount;
    BigDecimal interest;

    public SimpleInterestCalculator(String principalAmount,String interest) {
        this.principalAmount =new BigDecimal(principalAmount);
        this.interest=new BigDecimal(interest).divide(new BigDecimal("100"));
    }

    public BigDecimal calculateToTotal(int years) {

        return principalAmount.add(principalAmount.multiply(interest).multiply(new BigDecimal(years)));

    }
}
public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {

        SimpleInterestCalculator simpleInterestCalculator=new SimpleInterestCalculator("4500.00","7.5");
        System.out.println(simpleInterestCalculator.calculateToTotal(5));
    }
}
