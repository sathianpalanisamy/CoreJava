package com.learning.corejava.functionalprogramming.amigoscode.streams;

import static com.learning.corejava.functionalprogramming.amigoscode.streams._Stream.Gender.Female;
import static com.learning.corejava.functionalprogramming.amigoscode.streams._Stream.Gender.Male;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _Stream {


	public static void main(String[] args) {

		List<Person> people = List.of(new Person("sathian", Male), new Person("nivetha", Female),
				new Person("saravana", Male));

//		people.stream().map(p -> p.gender).collect(Collectors.toSet()).forEach(System.out::println);

//		people.stream().map(p -> p.name).mapToInt(String::length).forEach(System.out::println);
		
		boolean allMatch = people.stream().allMatch(p->p.gender.equals(Female));
		System.out.println(allMatch);
		
		boolean anyMatch = people.stream().anyMatch(p->p.gender.equals(Female));
		System.out.println(anyMatch);
		
		
		boolean noneMatch = people.stream().noneMatch(p->p.gender.equals(Female));
		System.out.println(noneMatch);


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
