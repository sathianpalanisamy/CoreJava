package com.learning.corejava.telusko.y_collections.a_iterator_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {

    public static void main(String[] args) {

        Collection values = new ArrayList();

        values.add(10);
        values.add(344);
        values.add(21);
        values.add(43);

        Iterator iterator =values.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }
}
