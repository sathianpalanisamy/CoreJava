package com.learning.corejava.in28minutes.m_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {

        Path fileToRead = Paths.get("./src/main/resources/file.txt");
//        List<String> strings = Files.readAllLines(fileToRead);
//        System.out.println(strings);

        Files.lines(fileToRead)
                .map(String::toLowerCase)
                .filter(a->a.contains("a"))
                .forEach(System.out::println);

    }
}
