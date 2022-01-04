package com.learning.corejava.hackerankproblems.data_structures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Stud {
    private String name;
    private double cgpa;
    private int id;

    public Stud(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stud{");
        sb.append("name='").append(name).append('\'');
        sb.append(", cgpa=").append(cgpa);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}

class Priority implements Comparator<Stud> {

    @Override
    public int compare(Stud o1, Stud o2) {

        if (o1.getCgpa() == o2.getCgpa()) {
            if (o1.getName().equals(o2.getName())) {
                return Integer.compare(o1.getId(), o2.getId());
            }
            return o1.getName().compareTo(o2.getName());
        }
        return Double.compare(o2.getCgpa(), o1.getCgpa());

    }


}

public class JavaPriorityQueue {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {

            int operation = scn.nextInt();
            PriorityQueue<Stud> studentQueue = new PriorityQueue<>(new Priority());
            while (operation-- > 0) {
                String action = scn.next();

                switch (action) {
                    case "ENTER": {
                        studentQueue.add(new Stud(scn.next(), scn.nextDouble(), scn.nextInt()));
                        break;
                    }
                    case "SERVED": {
                        if (studentQueue.size() > 0)
                            studentQueue.remove();
                        break;
                    }
                }

            }
            if(studentQueue.size() == 0) {
                System.out.println("EMPTY");
                return;
            }
            while (studentQueue.size() > 0) {
                System.out.println(studentQueue.poll().getName());
            }
        }


    }
}
