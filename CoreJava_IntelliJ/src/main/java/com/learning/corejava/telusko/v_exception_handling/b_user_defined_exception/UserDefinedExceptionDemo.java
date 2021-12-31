package com.learning.corejava.telusko.v_exception_handling.b_user_defined_exception;

public class UserDefinedExceptionDemo {

    public static void main(String[] args) {

        int i,j,k;

        i=9;
        j=10;
        try {
            k=i/j;
            if(k==0)
                throw new SathianException("The value of k is zero");
        }catch (Exception e){
            System.err.println("Error : "+e);
        }
        finally {
            System.out.println("bye");
        }



    }
}
