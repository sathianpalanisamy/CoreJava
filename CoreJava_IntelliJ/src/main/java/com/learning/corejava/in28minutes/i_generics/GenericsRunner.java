package com.learning.corejava.in28minutes.i_generics;

import java.util.ArrayList;
import java.util.List;

class CustomList<T>{

    List<T> elements = new ArrayList<>();

    public void addElement(T element){
        elements.add(element);
    }

    public void removeElement(T element){
        elements.remove(element);
    }

    public T getElement(int element){
        return elements.get(element);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomList{");
        sb.append("elements=").append(elements);
        sb.append('}');
        return sb.toString();
    }
}

public class GenericsRunner {

    static <T> T doubleValues(T no){
        return no;
    }

    static <T extends List> void duplicateValues(T list){

        list.addAll(list);

    }

    static Number sumOfNumberList(List<? extends Number> no){

        double sum =0.0;
        for (Number n:no) {
            sum+=n.doubleValue();

        }
        return sum;
    }

    static void addCoupleOfValues(List<? super Number> no){

        no.add(10);
        no.add(1.1);


    }




    public static void main(String[] args) {

        String value = doubleValues(new String());
        Integer no= doubleValues(Integer.valueOf(10));
        List<String> l= doubleValues(new ArrayList<>());

        System.out.println(doubleValues(10));

        List<Integer> nos=new ArrayList<>(List.of(10,20));
        duplicateValues(nos);
        System.out.println(nos);

        System.out.println(sumOfNumberList(List.of(10,1.1)));

        List<Number> n=new ArrayList<>(List.of(01));
        addCoupleOfValues(n);
        System.out.println(n);



        CustomList<String> customList = new CustomList<>();
        customList.addElement("sathian");
        customList.addElement("saravana");

        System.out.println(customList);
        System.out.println(customList.getElement(1));

        CustomList<Integer> customList1 =new CustomList();
        customList1.addElement(10);
        customList1.addElement(20);
        customList1.removeElement(10);

        System.out.println(customList1);


    }
}
