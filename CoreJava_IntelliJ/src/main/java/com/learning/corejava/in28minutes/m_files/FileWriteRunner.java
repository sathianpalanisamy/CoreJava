package com.learning.corejava.in28minutes.m_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        Path fileToWrite = Paths.get("./src/main/resources/filewrite.txt");
        List<String> stringList =List.of("Apple","dog");

        Files.write(fileToWrite, stringList);
    }
}
