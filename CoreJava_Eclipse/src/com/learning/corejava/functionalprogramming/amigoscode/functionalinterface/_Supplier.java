package com.learning.corejava.functionalprogramming.amigoscode.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println(getConnectionURL());
		System.out.println(getConnectionURLBySupplier.get());
		System.out.println(getListOfConnectionURLBySupplier.get());

	}

	static Supplier<String> getConnectionURLBySupplier = () -> "jdbc:mysql//localhost";

	static Supplier<List<String>> getListOfConnectionURLBySupplier = () -> List.of("jdbc:mysql//localhost",
			"jdbc:mysql//localhost1");

	static String getConnectionURL() {
		return "jdbc:mysql//localhost";
	}

}
