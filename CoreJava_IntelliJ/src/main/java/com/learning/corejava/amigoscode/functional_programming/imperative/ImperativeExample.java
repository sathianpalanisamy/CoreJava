package com.learning.corejava.amigoscode.functional_programming.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.learning.corejava.amigoscode.functional_programming.imperative.ImperativeExample.Gender.*;

public class ImperativeExample {
    public static void main(String[] args) {

        List<Person> persons = List.of(new Person("sathian", MALE),
                new Person("sasipriya", FEMALE),
                new Person("saravana", MALE),
                new Person("sanjay", MALE),
                new Person("sathya", FEMALE));

        //Imperative Example
        System.out.println("// Imperative Example");

        List<Person> females = new ArrayList<>();

        for (Person person:persons) {
            if(person.gender.equals(FEMALE)) {
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);
        }

        //Declarative Example
        System.out.println("// Declarative Example");

        Predicate<Person> personPredicate = person -> person.gender.equals(FEMALE);
        List<Person> females2 = persons.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", gender=").append(gender);
            sb.append('}');
            return sb.toString();
        }
    }
}
