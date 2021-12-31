package com.learning.corejava.telusko.y_collections.f_comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    int rollNo;
    int marks;
    String name;

    public Student(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        return name.length()>o.name.length()?1:-1;
    }
}

public class ComparableInterfaceDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,99,"sathian"));
        students.add(new Student(2,84,"saravana"));
        students.add(new Student(3,89,"sindhu"));
        students.add(new Student(4,05,"nivetha"));
        students.add(new Student(5,65,"roopshree"));

        students.sort((i, j) -> i.marks > j.marks ? 1 : -1);

        for (Student s:students) {
            System.out.println(s.toString());

        }

    }
}
