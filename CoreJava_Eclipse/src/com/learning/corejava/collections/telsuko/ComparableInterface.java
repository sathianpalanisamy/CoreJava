package com.learning.corejava.collections.telsuko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int rno, marks;
	String name;

	public Student(int rno, int marks, String name) {
		super();
		this.rno = rno;
		this.marks = marks;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return marks > o.getMarks() ? 1 : -1;
	}

}

public class ComparableInterface {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, 100, "sathian"));
		students.add(new Student(2, 87, "saravana"));
		students.add(new Student(3, 65, "nivetha"));

//		Collections.sort(students);
		
		Collections.sort(students, (s1,s2)->s1.name.length()>s2.name.length()?1:-1);


		for (Student student : students) {
			System.out.println(student);
		}

	}

}
