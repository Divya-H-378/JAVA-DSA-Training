package com.basics.oops.pillars.inheritance.Single;

public class Library {
    int id;
    String name;
    public Library(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Book extends Library {
    double price;
    Book(int id, String name, double price){
        super(id, name);
        this.price = price;
    }
    void bookDetails(){
        System.out.println(id + " " + name + " " + price);
    }
    public static void main(String[] args) {
        Book book = new Book(101,"Alice in Wonderland",300);
        book.bookDetails();
    }
}

