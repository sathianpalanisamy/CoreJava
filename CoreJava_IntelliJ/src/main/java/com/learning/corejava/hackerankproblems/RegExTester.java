package com.learning.corejava.hackerankproblems;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args) {

//        String line = ".(s@;;(;[#\"`)[ $_-a),Thisorderwasp.(s@;;;[#()(( $_-TO)))K)";

        String line2 ="dbo.(CLAIM|s@;;;[#()( $_-a)";
        String pattern = "([\\w\\s/.^@;$`\"\\[\\]\\-*#+_?{}|—/]*).(\\([\\w\\s/.^@;$`\"\\[\\]\\-()*#+_?{}|—/]+\\))";
//        String pattern = "([\\w\\s]*).(\\([\\w\\s/.^@;$`\"\\[\\]\\-()*#+_?{}|—/]+\\))";

//        String pattern = "([\\w\\s]*).(\\([\\w/.^@;$`\\[\\]()*#+_?{}|—/]+\\))";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line2);

        while (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );

        }

    }
    public static String[] getWithBrackets(char[] arr) {
        String[] result = new String[2];

        String res = "";
        int i = 0;
        boolean openFlag = false;
        for (char c : arr) {
            if (c == '[') {
                if (openFlag)
                    res += c;
                openFlag = true;
                continue;
            }
            if (c == ']') {
                openFlag = false;
                result[i++] = res;
                res = "";
            }
            if (openFlag)
                res += c;
        }
        return result;
    }
}
