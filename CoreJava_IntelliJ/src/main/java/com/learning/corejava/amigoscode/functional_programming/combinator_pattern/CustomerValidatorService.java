package com.learning.corejava.amigoscode.functional_programming.combinator_pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.TimeZone;

public class CustomerValidatorService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNo) {
        return phoneNo.length() == 10;
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }


    public boolean validate(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhoneNo())
                && isAdult(customer.getDob());
    }
}
