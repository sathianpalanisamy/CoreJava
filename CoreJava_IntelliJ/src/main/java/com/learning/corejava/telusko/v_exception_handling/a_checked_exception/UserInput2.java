package com.learning.corejava.telusko.v_exception_handling.a_checked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        int no =0;

        try {
            System.out.println("Enter a number : ");
            br = new BufferedReader(new InputStreamReader(System.in));
            no = Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        finally {
            br.close();
        }
        System.out.println("The no is "+no);
    }
}
