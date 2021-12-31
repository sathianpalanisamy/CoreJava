package com.learning.corejava.telusko.i_static;

class Emp{

    int empId;
    int salary;
    static String ceo;

    Emp(){
        empId = 1;
        salary =15000;
    }

    static {
        ceo = "ganesh";
    }

    public void display(){
        System.out.println(empId+" : "+salary+" : "+ceo);
    }

}

public class StaticDemo {

    public static void main(String[] args) {

        Emp sathian = new Emp();
        sathian.empId = 1;
        sathian.salary = 40000;
//        sathian.ceo = "karka";

        Emp ravi = new Emp();
        ravi.empId = 2;
        ravi.salary = 35000;
//        ravi.ceo = "karka";
//        ravi.ceo = "raja";

        Emp.ceo = "rajesh";

        sathian.display();
        ravi.display();


    }
}
