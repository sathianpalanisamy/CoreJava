package com.learning.corejava.hackerankproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserNameRegularExpression {
    public static void main(String[] args) {
////        String regex = "[a-zA-Z][\\w_]{7,29}";
////        System.out.println(Pattern.compile(regex).matcher("1sathiana").matches());
//
//        String line = "aa.(aaeee),aaa.(s@;;;[#))))$_-a)";

        String line = "aa.(s@;;(;[#`)[ $_-a)";

//        Pattern r = Pattern.compile("([^1]+).(\\([^1]+\\))");

//        Pattern r = Pattern.compile("([\\w\\W]*).\\(([\\w\\W]+)\\)");

//        Pattern r = Pattern.compile("([\\w\\W]+).(\\([\\w\\W]+\\))");

//        Pattern r = Pattern.compile("\\[([\\w\\W]*)\\].\\[([\\w\\W]+)\\]");

//        Pattern r = Pattern.compile("\\[([\\w\\W]+)\\].\\[([\\w@;#//(//)_\\-$\\[\\]]+)\\],");


//        Pattern r = Pattern.compile("([\\w\\s\\d]*).(\\([\\w\\s\\d]+\\))");


        Pattern r = Pattern.compile("([\\w\\s\"\\-\\[\\]/.^@;$*#+_?{}|—/]*).(\\([\\w\\s\"\\-\\[\\]\\(/.^@;$`()*#+_?{}|—/]+\\))");


//        Pattern r = Pattern.compile("([\\w\\s\"\\-\\[\\]/.^@;$()*+_?{}|—/]*).(\\([\\w\"/.^$*[//]+-?{}|—/]+\\))");

//
//        Pattern r = Pattern.compile("([\\w\"/.^$*\\[//\\]+-?{}|—/]*).(\\([\\w\"/.^$*\\[//\\]+-?{}|—/]+\\))");
////        Pattern r = Pattern.compile("([^.]*).(\\([\\w/.^$*[//]+-?{}|—/]+\\))");
////        Pattern r = Pattern.compile("<(.+)\\)([^<]+)</\\1\\)");
        Matcher m = r.matcher(line);
        System.out.println(m.groupCount());
        while (m.find()) {
            System.out.println(m.group(1)+"                      "+m.group(2));
        }


        Map<String,String> db = new HashMap<>();
//        db.put("s@;;;[#()=( $_-a","a");

        db.put("a","a");

        System.out.println(db);


    }
}
