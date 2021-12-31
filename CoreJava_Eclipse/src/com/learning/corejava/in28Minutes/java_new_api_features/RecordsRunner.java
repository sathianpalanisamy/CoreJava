package com.learning.corejava.in28Minutes.java_new_api_features;

public class RecordsRunner {

	record Person(String name, String email, String phoneno) {

		static int i = 10;

		Person {
			if (name == null) {
				throw new IllegalArgumentException("null");
			}
		}

		public String name() {
			return name + " sathian";
		}

	}

	public static void main(String[] args) {

		Person person = new Person("sathian", "sathian@gmail.com", "115151");
		Person person1 = new Person("sathian", "sathian@gmail.com", "115151");
		Person person2 = new Person("sathian1", "sathian@gmail.com", "115151");

		System.out.println(person);

		System.out.println(person.name());

//		System.out.println(person.equals(person1));
//		System.out.println(person.equals(person2));

	}

}
