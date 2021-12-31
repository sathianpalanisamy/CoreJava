package com.learning.corejava.in28minutes.f_arrays;

public class ExerciseProblem {

    public static void main(String[] args) {
        String[] days={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        String dayWithMostCharacters ="";

        for (String day:days) {

            if (day.length()>dayWithMostCharacters.length())
                dayWithMostCharacters =day;

        }

        System.out.println(dayWithMostCharacters);

        for (int i= days.length-1;i>=0;i--){
            System.out.println(days[i]);
        }

    }
}
