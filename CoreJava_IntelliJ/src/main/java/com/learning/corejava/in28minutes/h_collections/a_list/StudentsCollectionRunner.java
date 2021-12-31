package com.learning.corejava.in28minutes.h_collections.a_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.id,this.id);
    }
}

class AscendingComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {

        List<Student> students = List.of(new Student(1, "satian"), new Student(2, "nivetha"));

        List<Student> studentList =new ArrayList<>(students);

        Collections.sort(studentList);
        System.out.println("Descending : "+studentList);

//        Collections.sort(studentList,new AscendingComparator());
        studentList.sort(new AscendingComparator());
        System.out.println("Ascending : "+studentList);


    }
}
