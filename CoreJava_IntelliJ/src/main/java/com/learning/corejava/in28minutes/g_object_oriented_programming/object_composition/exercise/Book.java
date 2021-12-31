package com.learning.corejava.in28minutes.g_object_oriented_programming.object_composition.exercise;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String name;
    private String author;
    private List<Review> review=new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }


    public void addReview(Review r){
        review.add(r);
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", review=" + review +
                '}';
    }
}
