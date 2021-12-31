package com.learning.corejava.functionalprogramming.amigoscode.imperitive;

import static com.learning.corejava.functionalprogramming.amigoscode.imperitive.Main.Gender.Female;
import static com.learning.corejava.functionalprogramming.amigoscode.imperitive.Main.Gender.Male;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("sathian", Male), new Person("nivetha", Female),
				new Person("saravana", Male));

		System.out.println("Imperitive Approach");

		for (Person person : people) {
			if (person.gender.equals(Female))
				System.out.println(person);
		}

		System.out.println("Declarative Approach");
//		people.stream().filter(p -> p.gender.equals(Female)).forEach(System.out::print);
		Predicate<Person> predicate = p -> p.gender.equals(Female);
		List<Person> fm = people.stream().filter(predicate).collect(Collectors.toList());
		fm.forEach(System.out::print);
	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		Male, Female
	}

}
