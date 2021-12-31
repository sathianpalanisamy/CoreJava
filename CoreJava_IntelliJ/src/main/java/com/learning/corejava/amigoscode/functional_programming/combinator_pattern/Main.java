package com.learning.corejava.amigoscode.functional_programming.combinator_pattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("sathian","sathianpalanisamy@fmail.com",
                "9597183773", LocalDate.of(1995,11,03));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.validate(customer));
    }
}
