package com.learning.corejava.codingbat.warmup1;

public class Main {
    public static void main(String[] args) {
//        System.out.println(frontBack("ab"));
        System.out.println(front3("Java"));
    }

    private static String front3(String str) {
//        return java.substring(0,3).repeat(3);

        if (str == "") {
            return str;
        } else if (str.length() <= 2) {
            return str + str + str;
        } else {
            String s = str.substring(0, 3);
            return s + s + s;
        }
    }

    private static String frontBack(String str) {
        if (str.length() <= 1)
            return str;
        else {
            char[] s = str.toCharArray();
            char fl = s[0];
            char ll = s[str.length() - 1];
            s[0] = ll;
            s[str.length() - 1] = fl;
            return new String(s);

        }
    }
}
