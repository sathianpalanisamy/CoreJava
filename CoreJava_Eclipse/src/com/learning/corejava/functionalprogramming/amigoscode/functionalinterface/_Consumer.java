package com.learning.corejava.functionalprogramming.amigoscode.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		greetEmployee(new Employee("sathian", "9597183773"));
		greetEmployeeByFunction.accept(new Employee("sathian", "9597183773"));
		greetEmployeeByFunctionv2.accept(new Employee("sathian", "9597183773"),false);


	}

	static void greetEmployee(Employee emp) {
		System.out.println("Hello " + emp.getName() + ", your phone number is " + emp.getPhoneNo());
	}

	static Consumer<Employee> greetEmployeeByFunction = emp -> System.out
			.println("Hello " + emp.getName() + ", your phone number is " + emp.getPhoneNo());

	static BiConsumer<Employee, Boolean> greetEmployeeByFunctionv2 = (emp, is) -> System.out
			.println("Hello " + emp.getName() + ", your phone number is " + (is ? (emp.getPhoneNo()) : "******"));

	static class Employee {

		private final String name;
		private final String phoneNo;

		public Employee(String name, String phoneNo) {
			super();
			this.name = name;
			this.phoneNo = phoneNo;
		}

		public String getName() {
			return name;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

	}

}
