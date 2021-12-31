package com.learning.corejava.telusko.v_exception_handling.a_checked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput3TryWithResource {

    public static void main(String[] args) throws IOException {
        int no =0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Enter a number : ");
            no = Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        System.out.println("The no is "+no);
    }
}
