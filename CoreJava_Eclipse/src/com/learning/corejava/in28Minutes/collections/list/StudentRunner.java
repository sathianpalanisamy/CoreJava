package com.learning.corejava.in28Minutes.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingOrderComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getRollNo(), o2.getRollNo());
	}

}

public class StudentRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(2, "sathian"), new Student(1, "nivetha"));

		List<Student> list = new ArrayList<>(students);

		Collections.sort(list);
		System.out.println("Desc " + list);

//		Collections.sort(list, new AscendingOrderComparator());
		list.sort(new AscendingOrderComparator());
		System.out.println("Asc " + list);

	}

}
