package com.learning.corejava.in28minutes.g_object_oriented_programming.inheritense.exercise;

class Student{
    private String college;
    private String classNo;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "college='" + college + '\'' +
                ", classNo='" + classNo + '\'' +
                '}';
    }
}

class Employee extends Student{
    private String title;
    private String employer;
    private String grade;
    private int salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Employee{" +
                "title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setCollege("SREC");
        employee.setClassNo("B");

        System.out.println(employee);
    }

}
