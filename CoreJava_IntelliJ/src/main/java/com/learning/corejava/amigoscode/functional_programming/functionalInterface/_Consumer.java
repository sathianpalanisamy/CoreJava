package com.learning.corejava.amigoscode.functional_programming.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer sathian = new Customer("Sathian", "9597183773");

        greetCustomer(sathian);
        // Consumer Functional Interface
        greetCustomerByConsumer.accept(sathian);

        //BiConsumer

        greetCustomerByBiConsumer.accept(sathian,false);


    }

    static BiConsumer<Customer, Boolean> greetCustomerByBiConsumer = (customer, showPhoneNumber) ->
            System.out.println(
                    "Hello " + customer.customerName + " your phone no is "
                            + (showPhoneNumber ? customer.phoneNumber : "*********"));
    static Consumer<Customer> greetCustomerByConsumer = customer ->
            System.out.println("Hello " + customer.customerName + " your phone no is " + customer.phoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " your phone no is " + customer.phoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String phoneNumber;

        public Customer(String customerName, String phoneNumber) {
            this.customerName = customerName;
            this.phoneNumber = phoneNumber;
        }
    }
}
