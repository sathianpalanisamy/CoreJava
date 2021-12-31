package com.learning.corejava.in28Minutes.java_new_api_features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("./resources/sample.txt");
		String readString = Files.readString(path);
		System.out.println(readString);
		
		String newFileContent = readString.replace("Sathian", "sanjay");
		Path newPath = Paths.get("./resources/sample1.txt");
		Files.writeString(newPath, newFileContent);
		
	}

}
