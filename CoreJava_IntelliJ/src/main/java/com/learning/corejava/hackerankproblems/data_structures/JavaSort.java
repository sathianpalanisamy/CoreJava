package com.learning.corejava.hackerankproblems.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {

            int noOfStudent = scn.nextInt();
            List<Student> students = new ArrayList<>();
            while (noOfStudent-- > 0) {
                students.add(new Student(scn.nextInt(), scn.next(), scn.nextDouble()));
            }

            students.sort((o1, o2) -> {

                if (o1.getCgpa() == o2.getCgpa()) {
                    if (o1.getName().equals(o2.getName()))
                        return Integer.compare(o1.getId(), o2.getId());
                    return o1.getName().compareTo(o2.getName());
                }
                return Double.compare(o2.getCgpa(), o1.getCgpa());


            });

            students.forEach(s-> System.out.println(s.getName()));

        }

    }
}
