package com.learning.corejava.github_repo.java8_tutorial.c_funtional_interface;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F a);
}

class Something{

    static String startsAtStatic(String word){
        return String.valueOf(word.charAt(0));
    }

    String startsAt(String word){
        return String.valueOf(word.charAt(0));
    }
}


class ConverterRunner{
    public static void main(String[] args) {
//        Converter<String,Integer> stringIntegerConverter =(a)->Integer.valueOf(a);

        Converter<String,Integer> stringIntegerConverter =Integer::valueOf;
        System.out.println(stringIntegerConverter.convert("11"));

        //static method reference
        Converter<String,String> stringStringConverter = Something::startsAtStatic;
        System.out.println(stringStringConverter.convert("java"));

        //method reference
        Something something = new Something();
        Converter<String,String> stringStringConverter1 = something::startsAt;
        System.out.println(stringStringConverter1.convert("java"));

    }
}
