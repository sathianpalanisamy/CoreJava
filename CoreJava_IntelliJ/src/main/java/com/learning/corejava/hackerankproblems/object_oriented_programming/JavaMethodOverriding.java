package com.learning.corejava.hackerankproblems.object_oriented_programming;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

public class JavaMethodOverriding {
    public static void main(String[] args) {

        Sports c1 = new Sports();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        c1= new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();

    }
}
