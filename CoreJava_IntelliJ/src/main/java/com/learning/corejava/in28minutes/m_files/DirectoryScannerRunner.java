package com.learning.corejava.in28minutes.m_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScannerRunner {
    public static void main(String[] args) throws IOException {
        Path currentDir=Paths.get(".");

        Optional<Path> first = Files.list(currentDir).findFirst();

        System.out.println(first.get());

//        Predicate<Path> pathPredicate = path -> String.valueOf(path.getFileName()).endsWith(".java");
//        Files.walk(currentDir,20)
//                .filter(pathPredicate)
//                .forEach(path -> System.out.println(path.getFileName()));


//        BiPredicate<Path, BasicFileAttributes> matcher =(path,attributes)->String.valueOf(path.getFileName()).endsWith(".java");
//        BiPredicate<Path, BasicFileAttributes> matcher =(path,attributes)-> attributes.isDirectory();
//        Files.find(currentDir,20,matcher).forEach(System.out::println);


    }
}
