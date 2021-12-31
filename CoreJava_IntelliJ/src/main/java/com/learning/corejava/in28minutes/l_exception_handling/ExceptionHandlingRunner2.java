package com.learning.corejava.in28minutes.l_exception_handling;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        try {
//            String str = null;
//            System.out.println(str.length());
            int[] values ={10,20,30};
            int no =values[6];
            System.out.println("Method2 Ended");
        }catch (NullPointerException e){
            System.out.println("Matched NullPointerException");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Matched ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Matched Exception");
            e.printStackTrace();
        }
    }
}
