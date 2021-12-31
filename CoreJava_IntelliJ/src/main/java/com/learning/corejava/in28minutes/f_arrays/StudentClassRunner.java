package com.learning.corejava.in28minutes.f_arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

class Student{

    private String name;
    private ArrayList<Integer> marks=new ArrayList<>();

    Student(String name, int... marks){
        this.name=name;
        for (Integer mark:marks) {
            this.marks.add(mark);

        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {

        int sum =0;
        for (int mark:marks) {
            sum+=mark;
        }
        return sum;
    }

    public int getMaximumMark() {

//        int no =marks[0];
//        for (int i=1;i<marks.length;i++){
//            if(no<marks[i]){
//                no= marks[i];
//            }
//        }
//        return no;


//        int max=Integer.MIN_VALUE;
//        for(int mark:marks){
//            if(mark>max)
//                max=mark;
//        }
//        return max;

        return Collections.max(marks);

    }

    public int getMinimumMark() {
//        int no =marks[0];
//        for (int i=1;i<marks.length;i++){
//            if(no>marks[i]){
//                no= marks[i];
//            }
//        }
//        return no;

//        int minValue=Integer.MAX_VALUE;
//        for(int mark:marks){
//            if(mark<minValue)
//                minValue=mark;
//        }
//        return minValue;

        return Collections.min(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void addNewMark(int i) {

        marks.add(i);
    }

    public void removeMarkAtIndex(int i) {
        marks.remove(i);
    }
}

public class StudentClassRunner {
    public static void main(String[] args) {

        Student student =new Student("sathian",10,20,33,60,30,40,50);

        int number =student.getNumberOfMarks();
        System.out.println(number);

        int sumOfMarks =student.getTotalSumOfMarks();
        System.out.println(sumOfMarks);

        int maximumMarks = student.getMaximumMark();
        System.out.println(maximumMarks);

        int minimumMarks = student.getMinimumMark();
        System.out.println(minimumMarks);



        System.out.println("AVERAGE : "+new BigDecimal(sumOfMarks).divide(new BigDecimal(number),3,RoundingMode.UP));

        student.addNewMark(33);
        System.out.println(student);
        student.removeMarkAtIndex(1);
        System.out.println(student);

    }
}
