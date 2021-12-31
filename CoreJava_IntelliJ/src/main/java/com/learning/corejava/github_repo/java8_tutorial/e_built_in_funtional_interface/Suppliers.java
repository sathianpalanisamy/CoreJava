package com.learning.corejava.github_repo.java8_tutorial.e_built_in_funtional_interface;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Person {

    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Person> supplier =Person::new;
        supplier.get();

        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.toString());
        greeter.accept(new Person("Luke", "Skywalker"));

        Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getLastName());

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0

        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.computeIfPresent(9, (num, val) -> null);
        map.forEach((id, val) -> System.out.println(val));
        map.containsKey(9);     // false
        System.out.println(map.containsKey(9));

        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        map.get(9);             // va
        System.out.println(map.get(9));

    }
}
