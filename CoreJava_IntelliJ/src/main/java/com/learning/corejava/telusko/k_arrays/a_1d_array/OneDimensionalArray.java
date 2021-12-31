package com.learning.corejava.telusko.k_arrays.a_1d_array;

class Student{

    int rNo;
    String name;
}

public class OneDimensionalArray {

    public static void main(String[] args) {


//        int[] nums = new int[4];
//
//        nums[0] = 10;
//        nums[1] = 12;
//        nums[2] = 13;
//        nums[3] = 11;

        int[] nums2 = {2,3,4};

        System.out.println("for loop");

        for (int i=0; i<nums2.length;i++)
            System.out.println(nums2[i]);

        System.out.println("Enhanced for loop");

        for (int n:nums2) {
            System.out.println(n);
        }

        Student s1 = new Student();
        s1.name ="sathian";
        s1.rNo =1;

        Student s2 = new Student();
        s2.name ="saravana";
        s2.rNo =2;

        Student[] students ={s1,s2};

        for (int i= 0; i<students.length;i++){
            System.out.println(students[i].rNo+" "+students[i].name);
        }


    }
}
