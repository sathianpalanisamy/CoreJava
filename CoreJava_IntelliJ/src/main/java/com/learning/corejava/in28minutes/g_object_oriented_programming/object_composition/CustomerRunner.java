package com.learning.corejava.in28minutes.g_object_oriented_programming.object_composition;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("thevur","india","637104");
        Customer customer =new Customer("sathian",homeAddress);
        Address workAddress = new Address("chennai","india","63812");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);

    }
}
