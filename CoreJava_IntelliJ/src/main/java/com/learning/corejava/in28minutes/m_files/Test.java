package com.learning.corejava.in28minutes.m_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\91735\\Desktop\\Archon2BuildGen\\Build_App_Creator(Presales_Build) - Copy\\Manifest");

        Stream<Path> list = Files.list(path);



    }
}
