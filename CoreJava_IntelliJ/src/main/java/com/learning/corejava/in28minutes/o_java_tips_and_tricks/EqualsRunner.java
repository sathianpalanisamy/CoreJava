package com.learning.corejava.in28minutes.o_java_tips_and_tricks;

import java.util.Objects;

class Client{
    private int id;

    public Client(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        System.out.println("hello");
        return Objects.hash(id);
    }
}
public class EqualsRunner {
    public static void main(String[] args) {

        Client c1 = new Client(1);
        Client c2 = new Client(1);
        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
