package com.learning.corejava.telusko.y_collections.b_list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {

        List values = new ArrayList();

        values.add(10);
        values.add(23);
        values.add(43);
        values.add(1,12);
        values.add("demo");

//        Iterator iterator =values.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (int i=0;i< values.size();i++){
//            System.out.println(values.get(i));
//        }

        for (Object e:values) {
            System.out.println(e);
        }



    }
}
