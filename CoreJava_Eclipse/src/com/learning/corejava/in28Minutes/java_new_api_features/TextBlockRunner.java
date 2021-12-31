package com.learning.corejava.in28Minutes.java_new_api_features;

public class TextBlockRunner {
	
	public static void main(String[] args) {
		
		String str ="""
			   ""line1"
			      "\"""line2""\""
				       line3""";
		System.out.print(str);
	}

}
