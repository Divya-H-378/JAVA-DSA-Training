package com.basics.oops.pillars.abstraction.interfaces;

public interface Demo {
    void display();
}
class Main{
    public static void main(String[] args) {
        // Can we create an object of an interface
        Demo obj = new Demo() {
            @Override
            public void display() {
                    System.out.println("Normal code - Boilerplate Code");
                }
            };
        obj.display();
            // SCALA - Java - 8 : lambda Expressions -> One Liner
        Demo obj1 = () -> System.out.println("Scala Code");
        obj1.display();
        }
    }
