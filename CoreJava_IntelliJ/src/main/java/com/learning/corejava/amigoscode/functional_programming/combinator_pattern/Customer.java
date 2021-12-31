package com.learning.corejava.amigoscode.functional_programming.combinator_pattern;

import java.time.LocalDate;

public class Customer {
    private final String firstName;
    private final String email;
    private final  String phoneNo;
    private final LocalDate dob;

    public Customer(String firstName, String email, String phoneNo, LocalDate dob) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public LocalDate getDob() {
        return dob;
    }
}
