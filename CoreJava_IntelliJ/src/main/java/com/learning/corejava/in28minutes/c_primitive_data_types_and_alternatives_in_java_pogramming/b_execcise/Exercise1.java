package com.learning.corejava.in28minutes.c_primitive_data_types_and_alternatives_in_java_pogramming.b_execcise;

class MyChar{

    private char ch;

    MyChar(char ch){
        this.ch =ch;
    }

    public boolean isVowel(){

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u')
            return true;

        return false;

//        switch (ch){
//            case 'a':
//            case 'A':
//            case 'e':
//            case 'E':
//            case 'i':
//            case 'I':
//            case 'O':
//            case 'o':
//            case 'u':
//            case 'U':
//                return true;
//            default:
//                return false;
//        }
    }

    public boolean isDigt(){

        if(ch>=49&&ch<=57)
            return true;
        return false;
    }

    public boolean isAlphabet(){

        if((ch>=97&&ch<=122)||(ch>=65&&ch<=90))
            return true;
        return false;
    }

    public boolean isConsonant(){

        if(isAlphabet()&&!isVowel())
            return true;

        return false;
    }

    public static void printLowerCaseAlphabets(){

        for (char ch ='a';ch<='z';ch++){
            System.out.println(ch);
        }
    }

    public static void printUpperCaseAlphabets(){

        for (char ch ='A';ch<='Z';ch++){
            System.out.println(ch);
        }
    }

}
public class Exercise1 {
    public static void main(String[] args) {

        MyChar myChar = new MyChar('b');

        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigt());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();



    }
}
