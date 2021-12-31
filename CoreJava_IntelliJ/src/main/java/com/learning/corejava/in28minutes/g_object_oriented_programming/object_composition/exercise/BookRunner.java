package com.learning.corejava.in28minutes.g_object_oriented_programming.object_composition.exercise;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1,"java programming","ranga");
        book.addReview(new Review(1,"good",5));
        book.addReview(new Review(2,"okay",4));

        System.out.println(book);

    }
}
