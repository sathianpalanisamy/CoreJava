package com.learning.corejava.amigoscode.functional_programming.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.learning.corejava.amigoscode.functional_programming.streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {

        List<Person> persons = List.of(new Person("sathian", MALE),
                new Person("sasipriya", FEMALE),
                new Person("saravana", MALE),
                new Person("sanjay", MALE),
                new Person("sathya", FEMALE));

//        Set<Gender> collect = persons.stream().map(person -> person.gender).collect(Collectors.toSet());
//        collect.forEach(System.out::println);

//        persons.stream()
//                .map(person -> person.name)
//                .mapToInt(name -> name.length())
//                .forEach(System.out::println);


//        boolean containsOnlyFemale = persons.stream()
//                .allMatch(person -> person.gender.equals(FEMALE));

//        boolean containsOnlyFemale = persons.stream()
//                .anyMatch(person -> person.gender.equals(FEMALE));

        boolean containsOnlyFemale = persons.stream()
                .noneMatch(person -> person.gender.equals(PREFER_NOT_TO_SAY));

        System.out.println(containsOnlyFemale);

    }

    enum Gender {
        MALE, FEMALE,PREFER_NOT_TO_SAY
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
