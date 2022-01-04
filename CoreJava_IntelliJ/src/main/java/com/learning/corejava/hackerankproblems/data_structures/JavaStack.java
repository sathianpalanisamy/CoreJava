package com.learning.corejava.hackerankproblems.data_structures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (isBalanced(line)) System.out.println("true");
            else System.out.println("false");
        }
    }
}