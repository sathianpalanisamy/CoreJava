package com.learning.corejava.functionalprogramming.amigoscode.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		int n = increementByOne(1);
		System.out.println(n);

		int n2 = incrementByFunction.apply(1);
		System.out.println(n2);
		
		int multiply = multiplyByFunction.apply(n2);
		System.out.println(multiply);
		
		
		int result=incrementByFunction.andThen(multiplyByFunction).apply(2);
		System.out.println(result);
		
		System.out.println(incrementByOneandMultiplt(10, 10));
		System.out.println(incrementByOneandMultipltyByFunction.apply(10, 10));
		

	}

	static Function<Integer, Integer> incrementByFunction = n -> ++n;

	static Function<Integer, Integer> multiplyByFunction = n -> n * 10;
	
	static BiFunction<Integer, Integer, Integer>incrementByOneandMultipltyByFunction=
			
			(n1,n2) -> (++n1)*n2;

	public static int increementByOne(int n) {
		return ++n;

	}
	
	public static int incrementByOneandMultiplt(int x,int y) {
		return (++x)*y;
	}

}
