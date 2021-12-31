package com.learning.corejava.in28Minutes.collections.list;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
//		 -> Ascending order
//		return Integer.compare(this.getRollNo(), o.getRollNo());
		
//		 -> Descending order
         return Integer.compare(o.getRollNo(),this.getRollNo());

	}

}
