package com.basics.oops.pillars.inheritance.Single;

public class Animal { // Parent class // Super Class
    void eat(){
        System.out.println("Animal eats some food!");
    }
}
class Cat extends Animal{ // Child Class // Sub Class
    void run(){
        System.out.println("Cats run very fast.");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}
