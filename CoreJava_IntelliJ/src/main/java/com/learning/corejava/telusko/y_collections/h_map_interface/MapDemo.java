package com.learning.corejava.telusko.y_collections.h_map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String,String> values = new HashMap<>();

        values.put("name","sathian");
        values.put("place","thevur");

        Set<String> keys=values.keySet();
        for (String key:keys) {
            System.out.println(key+" "+values.get(key));
        }
    }
}
