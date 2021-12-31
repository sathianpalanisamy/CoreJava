package com.learning.corejava.github_repo.java8_tutorial.c_funtional_interface;

class Person {

    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
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

interface PersonFactory<P extends Person>{
       P create(String fn,String ln);
}

public class PersonFactoryRunner {
    public static void main(String[] args) {

        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("sathian", "mp");
        System.out.println(person);

    }
}
