package com.learning.corejava.in28minutes.g_object_oriented_programming.object_composition;

public class Address {

    private String line1;
    private String country;
    private String zipCode;

    public Address(String line1, String country, String zipCode) {
        this.line1 = line1;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
